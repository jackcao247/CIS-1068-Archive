package cis_assignment;
import java.util.Scanner;

public class Grades {

	public static void main(String[] args) {
		Scanner Answer = new Scanner(System.in);
		System.out.println("This program accepts your homework and two exam scores as input and computes your grade in the course.");
		
		

//========== Weights ========== \\
		System.out.println("Homework weight?");
		int homeworkWeight = Answer.nextInt();
		
		System.out.println("Exam 1 weight?");
		int exam1Weight = Answer.nextInt();
		
		int exam2Weight = 100 - homeworkWeight - exam1Weight;
		
		System.out.println("Using weights of" + " " + homeworkWeight + " " + exam1Weight + " " + exam2Weight);
		
		
		
//========== Homework ========== \\
		System.out.println("Homework: \nNumber of assignments?");
		int numAssignment = Answer.nextInt();
		
		System.out.println("Average Homework grade?");
		double avgHomeworkGrade = Answer.nextDouble();
		
		System.out.println("Number of late days used?");
		int dayLate = Answer.nextInt();
		
		System.out.println("Labs attended?");
		int labsAttended = Answer.nextInt();
		
		double homeworkWeightedScore = homeworkGradeCalculate (homeworkWeight, numAssignment, avgHomeworkGrade, dayLate, labsAttended);
		
//========== Exam 1 ========== \\
		System.out.println("Exam 1: \nScore?");
		double exam1Grade = Answer.nextDouble();
		
		System.out.println("Curve?");
		int exam1Curve = Answer.nextInt();
		
		double exam1WeightedScore = exam1GradeCalculate (exam1Weight, exam1Grade, exam1Curve);
		
//========== Exam 2 ========== \\
		System.out.println("Exam 2: \nScore?");
		double exam2Grade = Answer.nextDouble();
		
		System.out.println("Curve?");
		int exam2Curve = Answer.nextInt();
		
		double exam2WeightedScore = exam2GradeCalculate (exam2Weight, exam2Grade, exam2Curve);
		
//========== Course grade ========== \\
		
		double courseGrade = homeworkWeightedScore + exam1WeightedScore + exam2WeightedScore;
		
		System.out.printf("Course grade = %.2f", courseGrade);
	}
	
	
	
	
	
	
	
//========== This function handling calculating homework grade ========== \\
	public static double homeworkGradeCalculate (int homeworkWeight, int numAssignment, double avgHomeworkGrade, int dayLate, int labsAttended) {
		double homeworkTotalPoints;
		double homeworkWeightedScore;
		
	//Handling number of assignment and average homework grade
		if (numAssignment <= 0) {
			homeworkWeightedScore = homeworkWeight;
		} else {
				if (avgHomeworkGrade > 10) {
					avgHomeworkGrade = 10;
				} else if (avgHomeworkGrade < 0) {
					avgHomeworkGrade = 0;
				}
			
				
				
			//Calculating total homework point, lab points and max point can achieve
				double homeworkPoint = numAssignment * avgHomeworkGrade;
				int totalLabPoints = labsAttended * 4;
				int maxPoints = 10 * 10 + 10 * 4;

				
				
			// Handling total points based on number of day late	
				if (dayLate == 0) {
					homeworkTotalPoints = homeworkPoint + totalLabPoints + 5;
				} else if (dayLate <= (numAssignment / 2)) {
					homeworkTotalPoints = homeworkPoint + totalLabPoints;
				} else {
					homeworkTotalPoints = (homeworkPoint * 0.9) + totalLabPoints;
				}
				
				
				System.out.println("Total points = " + homeworkTotalPoints + "/" + maxPoints);
				homeworkWeightedScore = homeworkWeight*homeworkTotalPoints/(numAssignment * 14);
		}
		System.out.printf("Weighted Score: %.2f\n", homeworkWeightedScore);
		return homeworkWeightedScore;
	}
	
	
	
//========== This function handling calculating exam 1 grade ========== \\
	public static double exam1GradeCalculate (int exam1Weight, double exam1Grade, int exam1Curve) {
	// Handling grades that are under 0
		if (exam1Grade < 0) {
			exam1Grade = 0;
		} 
		
		exam1Grade += exam1Curve;
		
	// Handling grades that are exceed 100	
		if (exam1Grade > 100) {
			exam1Grade = 100;
		}
		
		double exam1WeightedScore = exam1Grade / 100.0 * exam1Weight;
		
		System.out.println("Total point :" + exam1Grade + "/100");
		System.out.printf("Weighted Score = %.2f\n", exam1WeightedScore);
		
		return exam1WeightedScore;
		
	}

	
	
//========== This function handling calculating exam 2 grade ========== \\
	public static double exam2GradeCalculate (int exam2Weight, double exam2Grade, int exam2Curve) {
	// Handling grades that are under 0	
		if (exam2Grade < 0) {
			exam2Grade = 0;
		} 
		
		exam2Grade += exam2Curve;
		
	// Handling grades that are exceed 100
		if (exam2Grade > 100) {
			exam2Grade = 100;
		}
		
		double exam2WeightedScore = exam2Grade / 100.0 * exam2Weight;
		
		System.out.println("Total point :" + exam2Grade + "/100");
		System.out.printf("Weighted Score = %.2f\n", exam2WeightedScore);
		
		return exam2WeightedScore;
		
	}

}
