package Teacher_Sorce04.src;


public class CompanyAddr extends Addr {
	
	private String companyName;
	private String department;
	private String position;
	public CompanyAddr(String name,String phnNum,String email,String addr,String birth,String group,String companyName,String department,String position){
		super(name,phnNum,email,addr,birth,group);
		this.companyName = companyName;
		this.department = department;
		this.position = position;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getDepartment() {
		return department;
	}

	public void setDprtmName(String dprtmName) {
		this.department = dprtmName;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}
	
	@Override 
	public void printInfo() {
		System.out.println("이름 : "+getName());
		System.out.println("전화번호 : "+getPhnNum());
		System.out.println("이메일 : "+getEmail());
		System.out.println("주소 : "+getAddr());
		System.out.println("생일 : "+getBirth());
		System.out.println("그룹 : "+getGroup());
		System.out.println("회사 이름 : "+this.companyName);
		System.out.println("부서 이름 : "+this.department);
		System.out.println("직급 : "+this.position);
	}
	
}
