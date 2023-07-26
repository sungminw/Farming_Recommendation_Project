package Teacher_Car.src.com.javaEdu.ex;

public class MainClass {

	public static void main(String[] args) {
		
		Sonata sonataLowGrade = new SonataLowGrade(CarSpecs.COLOR_BLUE, CarSpecs.TIRE_NORMAL, CarSpecs.DISPLACEMENT_2000, CarSpecs.HANDLE_POWER);
		Sonata sonataHighGrade = new SonataHighGrade(CarSpecs.COLOR_RED, CarSpecs.TIRE_WIDE, CarSpecs.DISPLACEMENT_2500, CarSpecs.HANDLE_NORMAL);
		
		sonataLowGrade.getSpec();
		sonataHighGrade.getSpec();
		

	}

}
