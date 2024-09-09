// Chapter 2 Assignment : Get you a cat

// "This program tests your understanding of using static methods and println statements. You should write a Java class called Song that should be saved into a file called Song.java. The program should produce as output the following song, which is a shortened version of a classic American folk song named, Bought Me a Cat."
public class Song{
	public static void main(String[] args) {
		FirstVerse();
		SecondVerse();
		ThirdVerse();
		FourthVerse();
		FifthVerse();
		SixthVerse();
	}

	public static void FirstVerse() {
        System.out.println("Bought me a cat and the cat pleased me,");
        System.out.println("I fed my cat under yonder tree.");
        Repeat1();
        Gap();
	}
	
	public static void SecondVerse() {
        System.out.println("Bought me a hen and the hen pleased me,");
        System.out.println("I fed my hen under yonder tree.");
        Repeat2();
        Repeat1();
        Gap();
	}
	
	public static void ThirdVerse() {
        System.out.println("Bought me a duck and the duck pleased me,");
        System.out.println("I fed my duck under yonder tree.");
        Repeat3();
        Repeat2();
        Repeat1();
        Gap();
	}
	
	public static void FourthVerse() {
        System.out.println("Bought me a goose and the goose pleased me,");
        System.out.println("I fed my goose under yonder tree.");
        Repeat4();
        Repeat3();
        Repeat2();
        Repeat1();
        Gap();
	}
	
	public static void FifthVerse() {
        System.out.println("Bought me a sheep and the sheep pleased me,");
        System.out.println("I fed my sheep under yonder tree.");
        Repeat5();
        Repeat4();
        Repeat3();
        Repeat2();
        Repeat1();
        Gap();
	}
	
	public static void SixthVerse() {
        System.out.println("Bought me a pig and the pig pleased me,");
        System.out.println("I fed my pig under yonder tree.");
        Repeat6();
        Repeat5();
        Repeat4();
        Repeat3();
        Repeat2();
        Repeat1();
        Gap();
	}


	
	public static void Repeat1() {
        System.out.println("Cat goes fiddle-i-fee.");
	}
	
	public static void Repeat2() {
		System.out.println("Hen goes chimmy-chuck, chimmy-chuck,");
	}
	
	public static void Repeat3() {
		System.out.println("Duck goes quack, quack,");
	}
	
	public static void Repeat4() {
		System.out.println("Goose goes hissy, hissy,");
	}
	
	public static void Repeat5() {
		System.out.println("Sheep goes baa, baa,");
	}
	
	public static void Repeat6() {
		System.out.println("Pig goes oink, oink,");
	}
	
//Gap between each verse
	public static void Gap() {
		System.out.println(" ");
	}
}
