// Chapter 2 Assignment : Get you a cat

// "This program tests your understanding of using static methods and println statements. You should write a Java class called Song that should be saved into a file called Song.java. The program should produce as output the following song, which is a shortened version of a classic American folk song named, Bought Me a Cat."
// Main
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
		Cat();
        CatSound();
        Gap();
	}
	
	public static void SecondVerse() {
		Hen();
        HenSound();
        CatSound();
        Gap();
	}
	
	public static void ThirdVerse() {
		Duck();
        DuckSound();
        HenSound();
        CatSound();
        Gap();
	}
	
	public static void FourthVerse() {
		Goose();
        GooseSound();
        DuckSound();
        HenSound();
        CatSound();
        Gap();
	}
	
	public static void FifthVerse() {
		Sheep();
        SheepSound();
        GooseSound();
        DuckSound();
        HenSound();
        CatSound();
        Gap();
	}
	
	public static void SixthVerse() {
		Pig();
        PigSound();
        SheepSound();
        GooseSound();
        DuckSound();
        HenSound();
        CatSound();
        Gap();
	}

	
	
	
// Bought me.. verse	
	public static void Cat() {
        System.out.println("Bought me a cat and the cat pleased me,");
        System.out.println("I fed my cat under yonder tree.");
	}
	
	public static void Hen() {
        System.out.println("Bought me a hen and the hen pleased me,");
        System.out.println("I fed my hen under yonder tree.");
	}
	
	public static void Duck() {
        System.out.println("Bought me a duck and the duck pleased me,");
        System.out.println("I fed my duck under yonder tree.");
	}
	
	public static void Goose() {
        System.out.println("Bought me a goose and the goose pleased me,");
        System.out.println("I fed my goose under yonder tree.");
	}
	
	public static void Sheep() {
	    System.out.println("Bought me a sheep and the sheep pleased me,");
	    System.out.println("I fed my sheep under yonder tree.");
	}
	
	public static void Pig() {
        System.out.println("Bought me a pig and the pig pleased me,");
        System.out.println("I fed my pig under yonder tree.");
	}

	
	
	
// Animal sound	
	public static void CatSound() {
        System.out.println("Cat goes fiddle-i-fee.");
	}
	
	public static void HenSound() {
		System.out.println("Hen goes chimmy-chuck, chimmy-chuck,");
	}
	
	public static void DuckSound() {
		System.out.println("Duck goes quack, quack,");
	}
	
	public static void GooseSound() {
		System.out.println("Goose goes hissy, hissy,");
	}
	
	public static void SheepSound() {
		System.out.println("Sheep goes baa, baa,");
	}
	
	public static void PigSound() {
		System.out.println("Pig goes oink, oink,");
	}
	
	
	
//Gap between each verse
	public static void Gap() {
		System.out.println(" ");
	}
}
