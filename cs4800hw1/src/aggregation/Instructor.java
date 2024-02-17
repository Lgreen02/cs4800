package aggregation;

public class Instructor {
	private String firstName;
	private String lastName;
	private String officeNumber;
	
	public Instructor(String firstName, String lastName, String officeNumber) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.officeNumber = officeNumber;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	public String getOfficeNumber() {
		return officeNumber;
	}
	public void setFirstName(String updatedFirstName) {
		this.firstName = updatedFirstName;
	}
	public void setLastName(String updatedLastName) {
		this.lastName = updatedLastName;
	}
	public void setOfficeNumber(String updatedOfficeNumber) {
		this.officeNumber = updatedOfficeNumber;
	}
	
}
