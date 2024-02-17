package polymorphism;

public class CruiseShip extends Ship{
	private int maxNumPass;
	public CruiseShip(String name, String year, int maxNumPass) {
		super(name, year);
		// TODO Auto-generated constructor stub
		this.maxNumPass = maxNumPass;
	}
	
	public int getMaxNumPass() {
		return maxNumPass;
	}
	public void setMaxNumPass(int updatedMaxNumPass) {
		this.maxNumPass = updatedMaxNumPass;
	}
	public void printShip() {
		System.out.println("Cruise Ship\nShip Name: " + getName() + 
				"\nMax Number of Passengers: " + getMaxNumPass() + "\n");
	}

}
