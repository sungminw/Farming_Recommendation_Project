package Teacher_Car.src.com.javaEdu.ex;

public abstract class Sonata {

	public String color;
	public String tire;
	public int displacement;
	public String handle;
	
	public Sonata(String color, String tire, int displacement, String handle) {
		this.color = color;
		this.tire = tire;
		this.displacement = displacement;
		this.handle = handle;
		
	}
	public abstract void getSpec();
}
