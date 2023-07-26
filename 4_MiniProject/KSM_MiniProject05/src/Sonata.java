
public abstract class Sonata{
	String color;
	String tire;
	int displacement;
	String handle;
	
	public Sonata(String color, String tire, int displacement, String handle) {
		this.color = color;
		this.tire = tire;
		this.displacement = displacement;
		this.handle = handle;
	}

	public abstract void getSpec();
	
}
