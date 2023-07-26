package ReviewMiniprj02;

import java.util.*;

public class SmartPhoneMain {

	public static void main(String[] args) {
		SmartPhone sp = new SmartPhone();
		
		System.out.println("연락처 정보 2개를 입력 하시오>>");
		for(int i=0; i<2; i++) {
			sp.addAddr(sp.inputData());
		}
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("\n주소관리 메뉴-------------------");
			System.out.println(">> 1. 연락처 등록");
			System.out.println(">> 2. 모든 연락처 출력");
			System.out.println(">> 3. 연락처 검색");
			System.out.println(">> 4. 연락처 삭제");
			System.out.println(">> 5. 연락처 수정");
			System.out.println(">> 6. 프로그램 종료");
			System.out.println("-----------------------------");
			
			int serch = Integer.parseInt(sc.nextLine());
			
			switch(serch) {
			case 1:
				System.out.println("추가 할 연락처를 입력 하시오>>");
				sp.addAddr(sp.inputData());
				break;
			case 2:
				sp.printAll();
				break;
			case 3:
				System.out.println("검색할 연락처의 이름을 입력 하시오>>");
				sp.serch(sc.nextLine());
				break;
			case 4:
				System.out.println("삭제할 연락처의 이름을 입력 하시오>>");
				sp.deleteAddr(sc.nextLine());
				break;
			case 5:
				System.out.println("수정할 연락처의 이름을 입력 하시오>>");
				sp.editAddr(sc.nextLine(), sp.inputData());
				break;
			case 6:
				System.out.println("프로그램 종료");
				return;
			default:
				System.out.println("잘못된 입력 입니다");
				continue;
			}
		}
	}

}
