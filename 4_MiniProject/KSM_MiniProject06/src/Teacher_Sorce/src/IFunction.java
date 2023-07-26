package Teacher_Sorce.src;

public interface IFunction {
	String PHONECALL_POSSIBLE="가능";
	String PHONECALL_IMPOSSIBLE="불가능";
	
	String CONNECTSPEED_3G = "3G";
	String CONNECTSPEED_4G = "4G";
	String CONNECTSPEED_5G = "5G";
	
	String REMOTECONTROL_POSSIBLE= "탑재";
	String REMOTECONTROL_IMPOSSIBLE= "미탑재";
	
	void phoneCallFunction();
	void connectionSpeed();
	void remoteControlFunction();
}
