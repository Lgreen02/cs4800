package polymorphism;

public class CargoShip extends Ship {
	private int maxTonnage;

	public CargoShip(String name, String year, int maxTonnage) {
		super(name, year);
		
		this.maxTonnage = maxTonnage;
	}
	
	public int getMaxTonnage() {
		return maxTonnage;
	}
	
	public void setMaxTonnage(int updatedMaxTonnage) {
		this.maxTonnage = updatedMaxTonnage;
	}
	
	public void printShip() {
		System.out.println("Cargo Ship\nShip Name: " + getName() + "\nCargo Capacity (in tons): " + getMaxTonnage() + "\n");
	}
	
}
