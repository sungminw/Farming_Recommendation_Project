package Teacher_Sorce04.src;

public class Addr {
	private String name;
	private String phnNum;
	private String email;
	private String addr;
	private String birth;
	private String group;
	public int length;
	Addr(String name,String phnNum,String email,String addr,String birth,String group){
		this.name = name;
		this.phnNum = phnNum;
		this.email = email;
		this.addr = addr;
		this.birth = birth;
		this.group = group;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getPhnNum() {
		return phnNum;
	}
	public void setPhnNum(String phnNum) {
		this.phnNum = phnNum;
	}

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	public String getGroup() {
		return group;
	}
	public void setGroup(String group) {
		this.group = group;
	}
	
	public void printInfo() {
		System.out.println("이름 : "+this.name);
		System.out.println("전화번호 : "+this.phnNum);
		System.out.println("이메일 : "+this.email);
		System.out.println("주소 : "+this.addr);
		System.out.println("생일 : "+this.birth);
		System.out.println("그룹 : "+this.group);
	}
}
