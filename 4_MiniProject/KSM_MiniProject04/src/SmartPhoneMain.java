import java.util.*;

public class SmartPhoneMain {

	public static void main(String[] args) {
		SmartPhone smartPhone = new SmartPhone();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("# 2개의 데이터를 입력합니다");
			smartPhone.addAddr(smartPhone.inputAddrData());
			smartPhone.addAddr(smartPhone.inputAddrData());
		
			int check=1;
			
		while(true) {
			printMenu();
			int serch = Integer.parseInt(sc.nextLine());
			
			if(serch == 1) {
				System.out.println("회사에 추가할 연락처의 데이터를 입력 하시오 >>");
				smartPhone.addAddr(smartPhone.inputAddrData());
			}else if(serch == 2) {
				System.out.println("거래처에 추가할 연락처의 데이터를 입력 하시오 >>");
				smartPhone.addAddr(smartPhone.inputAddrData());
			} else if (serch == 3) {
				smartPhone.printAllAddr();
			} else if (serch == 4) {
				System.out.println("검색할 연락처의 데이터를 입력 하시오 >>");
				smartPhone.serchAddr(sc.nextLine());
			} else if (serch == 5) {
				System.out.println("삭제할 연락처의 데이터를 입력 하시오 >>");
				smartPhone.deleteAddr(sc.nextLine());
			} else if (serch == 6) {
				System.out.println("수정할 연락처의 데이터를 입력 하시오 >>");
				smartPhone.editAddr(sc.nextLine(), smartPhone.inputAddrData());
			} else if (serch == 7) {
				System.out.println("프로그램을 종료 합니다");
				return;
			} else {
				System.out.println("잘못된 입력 값 입니다. 메뉴의 번호를 고르세요.");
			}
		}
	}
	

	static void printMenu() {
		System.out.println("\n주소관리 메뉴-------------------");
		System.out.println(">> 1. 연락처 등록(회사)");
		System.out.println(">> 2. 연락처 등록(거래처)");
		System.out.println(">> 3. 모든 연락처 출력");
		System.out.println(">> 4. 연락처 검색");
		System.out.println(">> 5. 연락처 삭제");
		System.out.println(">> 6. 연락처 수정");
		System.out.println(">> 7. 프로그램 종료");
		System.out.println("-----------------------------");
		}
}

