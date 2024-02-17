package polymorphism;

public class Driver {
	public static void main(String args[]) {
		Ship[] shipArr = createShipArray();
		printShipArray(shipArr);
		
	}
	
	public static Ship[] createShipArray() {
		Ship jenny = new Ship("Jenny", "1974");
		CruiseShip queenMary = new CruiseShip("Queen Mary", "2008", 250);
		CargoShip hauley = new CargoShip("Hauley", "1964", 100);
		Ship[] shipArr = new Ship[3];
		
		shipArr[0] = jenny;
		shipArr[1] = queenMary;
		shipArr[2] = hauley;
		
		return shipArr;
	}
	private static void printShipArray(Ship[] shipArr) {
		// TODO Auto-generated method stub
		for(int i = 0; i < 3; i++) {
			shipArr[i].printShip();
		}
	}
}
