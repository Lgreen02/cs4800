package aggregation;

public class Course {
	private String courseName;
	private Instructor primaryInstructor;
	private Instructor secondaryInstructor; //more interesting names than instructor1 and instructor2
	private Textbook primaryTextbook;
	private Textbook secondaryTextbook;
	
	
	public Course(String courseName, Instructor primaryInstructor, Textbook primaryTextbook, Instructor secondaryInstructor, Textbook secondaryTextbook) {
		this.courseName = courseName;
		this.primaryInstructor = primaryInstructor;
		this.secondaryInstructor = secondaryInstructor;
		this.primaryTextbook = primaryTextbook;
		this.secondaryTextbook = secondaryTextbook;
	}
	public String getCourseName() {
		return courseName;
	}
	public Instructor getPrimaryInstructor() {
		return primaryInstructor;
	}
	public Textbook getPrimaryTextbook() {
		return primaryTextbook;
	}
	public Instructor getSecondaryInstructor() {
		return secondaryInstructor;
	}
	public Textbook getSecondaryTextbook() {
		return secondaryTextbook;
	}
	public void setCourseName(String updatedCourseName) {
		this.courseName = updatedCourseName;
	}
	public void setPrimaryInstructor(Instructor updatedInstructor) {
		this.primaryInstructor = updatedInstructor;
	}
	public void setPrimaryTextbook(Textbook updatedTextbook) {
		this.primaryTextbook = updatedTextbook;
	}
	public void setSecondaryInstructor(Instructor updatedInstructor) {
		this.secondaryInstructor = updatedInstructor;
	}
	public void setSecondaryTextbook(Textbook updatedTextbook) {
		this.secondaryTextbook = updatedTextbook;
	}
	public void printCourseDetails() {
		
		System.out.println("Course Name: " + getCourseName() 
		+ "\nPRIMARY: ");
		printInstructorDetails(primaryInstructor);
		printTextbookDetails(primaryTextbook);
		System.out.println("\n\nSECONDARY: ");
		printInstructorDetails(secondaryInstructor);
		printTextbookDetails(secondaryTextbook);
		
	}
	// Wanted to put these methods in the instructor and textbook class, but kept them here because
	// document said to access the member variables with setters and getters.
	// unsure if that meant they should be accessed here.
	public void printInstructorDetails(Instructor instructor) {
		System.out.print("\nInstructor Full Name: " + instructor.getFirstName() + " "
				+ instructor.getLastName() + " " + "\nOffice Number: " + 
		instructor.getOfficeNumber());
	}
	public void printTextbookDetails(Textbook textbook) {
		System.out.print("\nTextbook Title: " + primaryTextbook.getTitle() 
		+ "\nAuthor: " + primaryTextbook.getAuthor() + "\nPublisher: " + primaryTextbook.getPublisher());
	}
}
