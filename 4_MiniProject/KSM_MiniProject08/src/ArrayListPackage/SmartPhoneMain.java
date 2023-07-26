package ArrayListPackage;
import java.util.*;

public class SmartPhoneMain {

	public static void main(String[] args) {
		SmartPhone smartPhone = new SmartPhone();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("# 2개의 데이터를 입력합니다");
		for(int i=0; i<2; i++) {
			smartPhone.addAddr(smartPhone.inputAddrData());
		}
		
		while(true) {
			printMenu();
			int serch = Integer.parseInt(sc.nextLine());
			
			if(serch == 1) {
				System.out.println("추가할 연락처의 데이터를 입력 하시오 >>");
				smartPhone.addAddr(smartPhone.inputAddrData());
			} else if (serch == 2) {
				smartPhone.printAllAddr();
			} else if (serch == 3) {
				System.out.println("검색할 연락처의 데이터를 입력 하시오 >>");
				smartPhone.serchAddr(sc.nextLine());
			} else if (serch == 4) {
				System.out.println("삭제할 연락처의 데이터를 입력 하시오 >>");
				smartPhone.deleteAddr(sc.nextLine());
			} else if (serch == 5) {
				System.out.println("수정할 연락처의 데이터를 입력 하시오 >>");
				smartPhone.editAddr(sc.nextLine(), smartPhone.inputAddrData());
			} else if (serch == 6) {
				System.out.println("프로그램을 종료 합니다");
				return;
			} else {
				System.out.println("잘못된 입력 값 입니다. 메뉴의 번호를 고르세요.");
			}
		}
	}
	
	//메인메소드에서는 static 사용해도 괜찮다(메인 이외의 클래스에서는 짜지 않는게 좋다)
	//do-while문으로 해보기
	static void printMenu() {
		System.out.println("\n주소관리 메뉴-------------------");
		System.out.println(">> 1. 연락처 등록");
		System.out.println(">> 2. 모든 연락처 출력");
		System.out.println(">> 3. 연락처 검색");
		System.out.println(">> 4. 연락처 삭제");
		System.out.println(">> 5. 연락처 수정");
		System.out.println(">> 6. 프로그램 종료");
		System.out.println("-----------------------------");
		}
}


/*
while(true) {
	printMenu();
	
	switch(Integer.parseInt(sc.nextLine())) {
	case 1:
		System.out.println("추가할 연락처의 데이터를 입력 하시오 >>");
		smartPhone.addAddr(smartPhone.inputAddrData());
		break;

	case 2:
		smartPhone.printAllAddr();
		break;

	case 3:
		System.out.println("찾을 연락처의 이름을 입력 하시오>> ");
		String serchName = sc.nextLine();
		smartPhone.serchAddr(serchName);
		break;

	case 4:
		System.out.println("삭제할 연락처의 이름을 입력 하시오>> ");
		String deleteName = sc.nextLine();
		smartPhone.deleteAddr(deleteName);
		break;

	case 5:
		System.out.println("수정할 연락처의 이름을 입력 하시오>> ");
		String reName = sc.nextLine();
		smartPhone.editAddr(reName, smartPhone.inputAddrData());
		break;

	case 6:
		System.out.println("시스템이 종료 되었습니다.");
		sc.close();
		//return으로 while문 탈출 가능하다 or System.exit(0);
		return;
		
	default:
		System.out.println("잘못된 입력 값 입니다. 메뉴의 번호를 고르세요.");
		break;
	}
}
*/
