package inheritance;

public class HourlyEmployee extends Employee{
	private String wage;
	private String numHoursWorked;
	
	public HourlyEmployee(String firstName, String lastName, String SSN, 
				String wage, String numHoursWorked) {
	
		super(firstName, lastName, SSN);
		
		this.wage = wage;
		this.numHoursWorked = numHoursWorked;
	}
	
	public String getWage() {
		return wage;
	}
	
	public String getNumHoursWorked() {
		return numHoursWorked;
	}
	
	public void setWage(String updatedWage) {
		this.wage = updatedWage;
	}
	
	public void setNumHoursWorked(String updatedNumHoursWorked) {
		this.numHoursWorked = updatedNumHoursWorked;
	}
	
	public void printHourlyEmployee() {
		printEmployee();
		System.out.print("Wage: " + getWage() + " || Hours Worked: " + getNumHoursWorked() + " ||");
	}
}
