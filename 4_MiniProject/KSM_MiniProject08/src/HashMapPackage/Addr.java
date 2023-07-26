package HashMapPackage;

public class Addr {
	private String name;
	private String phoneNum;
	private String email;
	private String address;
	private String group;

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
	
	//해쉬코드가 같나 비교해보고
		@Override
		public int hashCode() {
			return name.hashCode() + phoneNum.hashCode() + email.hashCode() + address.hashCode() + group.hashCode();
		}
		
		//헤쉬코드가 같을시 객체의 값도 같은게 있는지 비교 (해쉬코드가 같다고 같은 객체이다는거짓이기떄문이다)
		@Override
		public boolean equals(Object obj) {
			if(obj instanceof Addr) {
				Addr addr = (Addr)obj;
				return addr.name.equals(name) && addr.phoneNum.equals(phoneNum) && addr.email.equals(email) && addr.address.equals(address) && addr.group.equals(group);
			}else {
				return false;
			}	
		}
		
}