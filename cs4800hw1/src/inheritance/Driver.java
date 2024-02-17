package inheritance;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee carson = new Employee("Carson", "Green", "111-22-3333");
		SalariedEmployee joeJones = new SalariedEmployee("Joe", "Jones", "111-11-1111", "$2500");
		HourlyEmployee stephanieSmith = new HourlyEmployee("Stephanie", "Smith", "222-22-2222", "$25", "34");
		HourlyEmployee maryQuinn = new HourlyEmployee("Mary", "Quinn", "333-33-3333", "$19", "47");
		CommissionEmployee nicoleDior = new CommissionEmployee("Nicole", "Dior", "444-44-4444", "15%", "$50,000");
		SalariedEmployee renwaChanel = new SalariedEmployee("Renwa", "Chanel", "555-55-5555", "$1700");
		BaseEmployee mikeDavenPort = new BaseEmployee("Mike", "Davenport", "666-66-6666", "$95,000");
		CommissionEmployee mahnazVaziri = new CommissionEmployee("Mahnaz", "Vaziri", "777-77-7777", "22%", "$40,000");
		
		System.out.println("PROBLEM 1: INHERITANCE\n");
		carson.printEmployee();
		joeJones.printSalariedEmployee();
		stephanieSmith.printHourlyEmployee();
		maryQuinn.printHourlyEmployee();
		nicoleDior.printCommissionEmployee();
		renwaChanel.printSalariedEmployee();
		mikeDavenPort.printBaseEmployee();
		mahnazVaziri.printCommissionEmployee();
	}
	

}
