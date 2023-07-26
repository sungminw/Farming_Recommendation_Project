
public class SonataLowGrade extends Sonata{
	
	
	public SonataLowGrade(String color, String tire, int displacement, String handle) {
		super(color, tire, displacement, handle);
		}
	
	int tax = 0;
	
	public void getSpec() {
		System.out.println("색상 " +  color);
		System.out.println("타이어 " +  tire);
		System.out.println("배기량 " +  displacement);
		System.out.println("핸들 " +  handle);
		if(displacement <=2000) {
			tax = 1000;
		}else {
			tax = 1500;
		}
		System.out.println("세금 " +  tax);
	}
}
