package inheritance;

public class Employee {
	private String firstName;
	private String lastName;
	private String SSN;
	
	public Employee(String firstName, String lastName, String SSN) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.SSN = SSN;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}

	public String getSSN() {
		return SSN;
	}
	
	public void setFirstName(String updatedFirstName) {
		this.firstName = updatedFirstName;
	}
	
	public void setLastName(String updatedLastName) {
		this.lastName = updatedLastName;
	}
	
	public void setSSN(String updatedSSN) {
		this.SSN = updatedSSN;
	}
	
	public void printEmployee() {
		System.out.print("\nFirst Name: " + getFirstName() + " || Last Name: " + getLastName() + " || SSN: " + getSSN() + " || ");
	}
}
