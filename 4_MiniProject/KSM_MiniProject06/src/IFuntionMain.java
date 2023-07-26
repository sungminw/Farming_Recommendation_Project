
public class IFuntionMain {

	public static void main(String[] args) {
		IFuntion iFun;
		
		iFun = new APhone();
		iFun.phoneCall();
		iFun.accessSpeed();
		iFun.tvRemote();
		System.out.println("------------------------");
	
		iFun = new BPhone();
		iFun.phoneCall();
		iFun.accessSpeed();
		iFun.tvRemote();
		System.out.println("------------------------");
		
		iFun = new CPhone();
		iFun.phoneCall();
		iFun.accessSpeed();
		iFun.tvRemote();
		System.out.println("------------------------");
	}

}
