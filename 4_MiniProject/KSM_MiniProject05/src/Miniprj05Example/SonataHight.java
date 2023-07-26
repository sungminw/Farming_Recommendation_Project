package Miniprj05Example;

public class SonataHight extends Sonata{
	int tax = 1000;
	
	public SonataHight(String color, String tire, int displacement, String handle) {
		super(color, tire, displacement, handle);
	}
	
	public void getSpec() {
		System.out.println("---------------------------------");
		System.out.println("색상 : " + getColor());
		System.out.println("타이어 : " + getTire());
		System.out.println("배기량 : " + getDisplacement());
		System.out.println("핸들: " + getHandle());
		if(getDisplacement()>2000) {
			tax = 1500;
		}
		System.out.println("세금 : " + tax);
		System.out.println("---------------------------------");
	}

}
