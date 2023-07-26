package Miniprj05Example;

public class SonataMain {

	public static void main(String[] args) {
		SonataLow ls = new SonataLow(CarSpecs.COLOR_BLUE, CarSpecs.NOMAL_TIRE, CarSpecs.DISPLACEMENT_2000, CarSpecs.POWER_HANDLE);
		ls.getSpec();
		
		SonataHight hs = new SonataHight(CarSpecs.COLOR_RED, CarSpecs.WIDE_TIRE, CarSpecs.DISPLACEMENT_2500, CarSpecs.POWER_HANDLE);
		hs.getSpec();
	}

}
