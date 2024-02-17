package inheritance;

public class CommissionEmployee extends Employee{
	private String commissionRate;
	private String grossSales;

	public CommissionEmployee(String firstName, String lastName, String SSN, 
			String commissionRate, String grossSales) {
		
		super(firstName, lastName, SSN);
		
		this.commissionRate = commissionRate;
		this.grossSales = grossSales;
	}
	
	public String getCommissionRate() {
		return commissionRate;
	}
	
	public String getGrossSales() {
		return grossSales;
	}
	
	public void setCommissionRate(String updatedCommissionRate) {
		this.commissionRate = updatedCommissionRate;
	}
	public void setGrossSales(String updatedGrossSales) {
		this.grossSales = updatedGrossSales;
	}
	
	public void printCommissionEmployee() {
		printEmployee();
		System.out.print("Commission Rate: " + getCommissionRate() + " || Gross Sales: " + getGrossSales() + " ||");
	}
}
