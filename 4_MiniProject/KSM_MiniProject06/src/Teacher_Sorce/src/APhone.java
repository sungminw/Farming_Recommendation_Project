package Teacher_Sorce.src;

public class APhone implements IFunction{
	String connect;
	
	@Override
	public void phoneCallFunction() {
		System.out.println("A Phone");
		System.out.println("전화 "+PHONECALL_POSSIBLE+"합니다.");
	}
	@Override
	public void connectionSpeed() {
		connect="불가능";
		System.out.println(connect+"합니다."+CONNECTSPEED_3G+"입니다.");
	}
	@Override
	public void remoteControlFunction() {
		System.out.println(REMOTECONTROL_IMPOSSIBLE+"되어 있습니다.");
	}
}
