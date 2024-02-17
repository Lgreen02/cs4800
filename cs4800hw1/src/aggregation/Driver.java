package aggregation;

public class Driver {
	public static void main(String args[]) {
		Instructor nimaDavarpanah = new Instructor("Nima", "Davarpanah", "3-2636");
		Textbook cleanCode = new Textbook("Clean Code", "Robert C. Martin", "Prentice Hall");
		Instructor carsonGreen = new Instructor("Carson", "Green", "4-51");
		Textbook donQuixote = new Textbook("Don Quixote", "Miguel de Cervantes", "Penguin");
		Course cs4800 = new Course("Software Engineering", nimaDavarpanah, cleanCode, carsonGreen, donQuixote);
		cs4800.printCourseDetails();
	}

}
