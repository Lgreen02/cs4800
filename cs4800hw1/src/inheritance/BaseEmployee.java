package inheritance;

public class BaseEmployee extends Employee{
	private String baseSalary;
	public BaseEmployee(String firstName, String lastName, String SSN, String baseSalary) {
		
		super(firstName, lastName, SSN);
		
		this.baseSalary = baseSalary;
	}
	
	public String getBaseSalary() {
		return baseSalary;
	}
	public void setBaseSalary(String updatedBaseSalary) {
		this.baseSalary = updatedBaseSalary;
	}
	
	public void printBaseEmployee() {
		printEmployee();
		System.out.print("Base Salary: " + getBaseSalary() + " ||");
		
	}
	
}
