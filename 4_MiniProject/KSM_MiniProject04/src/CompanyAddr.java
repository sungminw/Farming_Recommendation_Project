
public class CompanyAddr extends Addr {
	private String companyName;
	private String departmentName;
	private String position;
	
	CompanyAddr(String name, String phoneNum, String email, String address, String group, String companyName, String  departmentName, String position){
		super(name, phoneNum, email, address, group);
		this.companyName = companyName;
		this.departmentName = departmentName;
		this.position = position;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}
	
	@Override
	void printInfo() {
		System.out.print("이름:"+getName() + "\n전화번호:"+getPhoneNum() + "\n이메일:"+getEmail() + "\n주소:"+getAddress() + "\n그룹:"+getGroup() + "\n회사이름:"+getCompanyName() + "\n부서이름:"+getDepartmentName() + "\n직급:"+getPosition());
	}
	

}
