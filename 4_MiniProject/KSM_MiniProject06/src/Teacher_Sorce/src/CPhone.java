package Teacher_Sorce.src;

public class CPhone implements IFunction{
	String connect;

	@Override
	public void phoneCallFunction() {
		System.out.println("C Phone");
		System.out.println("전화 "+PHONECALL_POSSIBLE+"합니다.");
	}
	@Override
	public void connectionSpeed() {
		connect = "가능";
		System.out.println(connect+"합니다."+CONNECTSPEED_4G+"입니다.");
	}
	@Override
	public void remoteControlFunction() {
		System.out.println(REMOTECONTROL_IMPOSSIBLE+"되어 있습니다.");
	}
}