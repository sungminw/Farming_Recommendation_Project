package Teacher_Sorce.src;

public class Main {
	public static void main(String[] args) {
		IFunction phones;
		
		phones = new APhone();
		phones.phoneCallFunction();
		phones.connectionSpeed();
		phones.remoteControlFunction();
		
		System.out.println("----------------------");
		
		phones = new BPhone();
		phones.phoneCallFunction();
		phones.connectionSpeed();
		phones.remoteControlFunction();

		System.out.println("----------------------");
		
		phones = new CPhone();
		phones.phoneCallFunction();
		phones.connectionSpeed();
		phones.remoteControlFunction();

	}
}
