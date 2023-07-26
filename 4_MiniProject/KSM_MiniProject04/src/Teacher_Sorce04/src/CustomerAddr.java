package Teacher_Sorce04.src;


public class CustomerAddr extends Addr {
	private String clientName;
	private String trnsactionItem;
	private String position;
	
	public CustomerAddr(String name,String phnNum,String email,String addr,String birth,String group,String clientName,String trnsactionItem,String position){
		super(name,phnNum,email,addr,birth,group);
		this.clientName = clientName;
		this.trnsactionItem = trnsactionItem;
		this.position = position;
	}

	public String getClientName() {
		return clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	public String getTrnsactionItem() {
		return trnsactionItem;
	}

	public void setTrnsactionItem(String trnsactionItem) {
		this.trnsactionItem = trnsactionItem;
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
		System.out.println("거래처 이름 : "+this.clientName);
		System.out.println("거래 품목 : "+this.trnsactionItem);
		System.out.println("그룹 : "+this.position);
	}
}
