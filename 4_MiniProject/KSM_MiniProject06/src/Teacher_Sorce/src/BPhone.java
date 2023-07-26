package Teacher_Sorce.src;


public class BPhone implements IFunction{
	String connect;

	@Override
	public void phoneCallFunction() {
		System.out.println("B Phone");
		System.out.println("전화 "+PHONECALL_POSSIBLE+"합니다.");
	}
	@Override
	public void connectionSpeed() {
		connect="가능";
		System.out.println(connect+"합니다."+CONNECTSPEED_5G+"입니다.");
	}
	@Override
	public void remoteControlFunction() {
		System.out.println(REMOTECONTROL_POSSIBLE+"되어 있습니다.");
	}
}
