package polymorphism;

public class Ship {
	
	private String name;
	private String year;
	
	public Ship(String name, String year) {
		this.name = name;
		this.year = year;
	}
	
	public String getName() {
		return name;
	}
	public String getYear() {
		return year;
	}
	public void setName(String updatedName) {
		this.name = updatedName;
	}
	public void setYear(String updatedYear) {
		this.year = updatedYear;
	}
	public void printShip() {
		System.out.println("Ship\nShip Name: " + getName() + "\nYear: " + getYear() + "\n");
	}
}
