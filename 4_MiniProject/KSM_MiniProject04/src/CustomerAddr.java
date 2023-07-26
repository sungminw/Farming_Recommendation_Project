
public class CustomerAddr extends Addr {
	private String clientName;
	private String transItem;
	private String cusPosition;
	
	CustomerAddr(String name, String phoneNum, String email, String address, String group, String clientName, String transItem, String cusPosition){
		super(name, phoneNum, email, address, group);
		this.clientName = clientName;
		this.transItem = transItem;
		this.cusPosition = cusPosition;
	}


	public String getClientName() {
		return clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	public String getTransItem() {
		return transItem;
	}

	public void setTransItem(String transItem) {
		this.transItem = transItem;
	}

	public String getCusPosition() {
		return cusPosition;
	}

	public void setCusPosition(String cusPosition) {
		this.cusPosition = cusPosition;
	}
	
	@Override
	void printInfo() {
		System.out.print("이름:"+getName() + "\n전화번호:"+getPhoneNum() + "\n이메일:"+getEmail() + "\n주소:"+getAddress() + "\n그룹:"+getGroup() + "\n거래처 이름:"+ getClientName() + "\n거래품목:"+getTransItem() + "\n직급:"+getCusPosition());
	}
	
}