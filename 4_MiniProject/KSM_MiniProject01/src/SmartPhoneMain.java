
public class SmartPhoneMain {

	public static void main(String[] args) {
		SmartPhone smartPhone = new SmartPhone();
		
		//우선적으로 2개의 객체의 값을 배열에 넣는다
		System.out.println("# 2개의 데이터를 입력합니다");
		for(int i=0; i<2; i++) {
			smartPhone.addAddr(smartPhone.inputAddrData());
		}
		smartPhone.printMenu();
	}

}



//smartPhone.addAddr(smartPhone.addr);