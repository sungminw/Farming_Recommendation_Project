package Miniprj05Example;

public abstract class Sonata {
	private String color;
	private String tire;
	private int displacement;
	private String handle;
	
	public Sonata(String color, String tire, int displacement, String handle) {
		this.color = color;
		this.tire = tire;
		this.displacement = displacement;
		this.handle = handle;
	}
	
	public String getColor() {
		return color;
	}



	public void setColor(String color) {
		this.color = color;
	}



	public String getTire() {
		return tire;
	}



	public void setTire(String tire) {
		this.tire = tire;
	}



	public int getDisplacement() {
		return displacement;
	}



	public void setDisplacement(int displacement) {
		this.displacement = displacement;
	}



	public String getHandle() {
		return handle;
	}



	public void setHandle(String handle) {
		this.handle = handle;
	}



	//구현클래스에서 무조건 구현을 해줘야 한다
	public abstract void getSpec();
}
