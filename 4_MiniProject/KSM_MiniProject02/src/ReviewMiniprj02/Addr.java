package ReviewMiniprj02;

public class Addr {
	private String name;
	private String phoneNumber;
	private String email;
	private String address;
	private String group;
	
	public Addr(String name, String phoneNumber, String email, String address, String group) {
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.address = address;
		this.group = group;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getGroup() {
		return group;
	}

	public void setGroup(String group) {
		this.group = group;
	}
	
	public void printInfo() {
		System.out.println("-----------------------------");
		System.out.println("이름 : " + getName());
		System.out.println("전화번호 : " + getPhoneNumber());
		System.out.println("이메일 : " + getEmail());
		System.out.println("주소 : " + getAddress());
		System.out.println("그룹 : " + getGroup());
		System.out.println("-----------------------------");
	}

}
