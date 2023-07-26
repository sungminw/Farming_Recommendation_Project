package FileLoadRead;
import java.io.File;
import java.util.*;

public class SmartPhoneMain {

	public static void main(String[] args) throws Exception {
		SmartPhone smartPhone = new SmartPhone();
		Scanner sc = new Scanner(System.in);
		
		File saveAddr = new File("C:/Temp/saveAddr");
		if(saveAddr.exists()==false) {
			saveAddr.mkdir();
		}
		
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
				System.out.println("검색할 연락처의 데이터를 입력 하시오 >>");
				smartPhone.serchAddr(sc.nextLine());
			} else if (serch == 3) {
				System.out.println("수정할 연락처의 데이터를 입력 하시오 >>");
				smartPhone.editAddr(sc.nextLine(), smartPhone.inputAddrData());
			} else if (serch == 4) {
				System.out.println("삭제할 연락처의 데이터를 입력 하시오 >>");
				smartPhone.deleteAddr(sc.nextLine());
			} else if (serch == 5) {
				System.out.println("연락처 전체 리스트 보기");
				smartPhone.printAllContent(smartPhone.loadFile());
			} else if (serch == 6) {
				System.out.println("연락처 파일 저장");
				smartPhone.saveFile();
			}else if (serch == 7) {
				System.out.println("연락처 파일 로드");
				smartPhone.loadFile();
			}else if (serch == 8) {
				System.out.println("프로그램을 종료 합니다");
				return;
			} else {
				System.out.println("잘못된 입력 값 입니다. 메뉴의 번호를 고르세요.");
			}
		}
	}
	

	static void printMenu() {
		System.out.println("\n주소관리 메뉴-------------------");
		System.out.println(">> 1. 연락처 등록");
		System.out.println(">> 2. 연락처 검색");
		System.out.println(">> 3. 연락처 수정");
		System.out.println(">> 4. 연락처 삭제");
		System.out.println(">> 5. 연락처 전체 리스트 보기");
		System.out.println(">> 6. 연락처 파일 저장");
		System.out.println(">> 7. 연락처 파일 출력");
		System.out.println(">> 8. 프로그램 종료");
		System.out.println("-----------------------------");
		}
}

