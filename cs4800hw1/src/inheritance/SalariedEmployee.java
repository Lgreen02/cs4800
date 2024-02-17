package inheritance;

public class SalariedEmployee extends Employee{
	private String weeklySalary;

	public SalariedEmployee(String firstName, String lastName, String SSN, String weeklySalary) {
		super(firstName, lastName, SSN);
		this.weeklySalary = weeklySalary;
		// TODO Auto-generated constructor stub
	}
	
	public String getWeeklySalary() {
		return weeklySalary;
	}
	
	public void setWeeklySalary(String updatedWeeklySalary) {
		this.weeklySalary = updatedWeeklySalary;
	}
	
	public void printSalariedEmployee() {
		printEmployee();
		System.out.print("Weekly Salary: " + getWeeklySalary() + " ||");
	}
}
