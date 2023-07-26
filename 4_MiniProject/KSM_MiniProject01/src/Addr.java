
public class Addr {
	private String name;
	private String phoneNum;
	private String email;
	private String address;
	private String group;
	
	Addr(){}
	
	Addr(String name, String phoneNum, String email, String address, String group){
		this.name = name;
		this.phoneNum = phoneNum;
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

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
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
	
	void printInfo() {
		System.out.print("이름:"+getName() + "\n전화번호:"+getPhoneNum() + "\n이메일:"+getEmail() + "\n주소:"+getAddress() + "\n그룹:"+getGroup());
	}
		
}