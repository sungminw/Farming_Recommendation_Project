import java.util.*;

public class SmartPhone {
	Scanner sc = new Scanner(System.in);
	Addr addr = new Addr();
	Addr[] addAddr = new Addr[10];
		
	int count = 0;
	
	Addr inputAddrData() {
			System.out.print("이름: ");
			addr.setName(sc.nextLine());
			System.out.print("전화번호: ");
			addr.setPhoneNum(sc.nextLine());
			System.out.print("이메일: ");
			addr.setEmail(sc.nextLine());
			System.out.print("주소: ");
			addr.setAddress(sc.nextLine());
			System.out.print("그룹(가족/친구): ");
			addr.setGroup(sc.nextLine());
			return new Addr(addr.getName(), addr.getPhoneNum(), addr.getEmail(), addr.getAddress(), addr.getGroup());
			//객체를 생성해서 배열에 넣기 위해 생성한다. 객체는 new했을떄 생성된다
	}
	
	void addAddr(Addr Addr) {
		//addAddr[count] = new Addr(addr.getName(), addr.getPhoneNum(), addr.getEmail(), addr.getAddress(), addr.getGroup());
		
		//index[0]에 첫번쨰 배열부터 순차적으로 넣고 아래에서 count로 인덱스번호 +1
		addAddr[count] = Addr;
		System.out.println(">>> 데이터가 저장 되었습니다 (" + (count+1) + ")");
		/*
		System.out.println("\n---------------------");
		System.out.println("이름 : " + addAddr[count].getName());
		System.out.println("전화번호 : " + addAddr[count].getPhoneNum());
		System.out.println("이메일 : " + addAddr[count].getEmail());
		System.out.println("주소 : " + addAddr[count].getAddress());
		System.out.println("그룹 : " + addAddr[count].getGroup());
		System.out.println("---------------------");
		*/
		count++;
		return;
	}
	
	
	void printMenu() {
		//무한루프 돌리기위해 리턴타입 선언
		boolean run = true;

		while(run) {
			System.out.println("\n주소관리 메뉴-------------------");
			System.out.println(">> 1. 연락처 등록");
			System.out.println(">> 2. 모든 연락처 출력");
			System.out.println(">> 3. 연락처 검색");
			System.out.println(">> 4. 연락처 삭제");
			System.out.println(">> 5. 연락처 수정");
			System.out.println(">> 6. 프로그램 종료");
			System.out.println("-----------------------------");
			switch(Integer.parseInt(sc.nextLine())) {
			case 1:
				//inputAddrData에서 객체를 생성한 후 리턴값을 다시 addAddr로 보내서 배열에 저장한다
				System.out.println("추가할 연락처의 데이터를 입력 하시오 >>");
				addAddr(inputAddrData());
				break;
					
			case 2:
				printAllAddr();
				break;
				
			case 3:
				System.out.println("찾을 연락처의 이름을 입력 하시오>> ");
				String serchName = sc.nextLine();
				serchAddr(serchName);
				break;
				
			case 4:
				System.out.println("삭제할 연락처의 이름을 입력 하시오>> ");
				String deleteName = sc.nextLine();
				deleteAddr(deleteName);
				break;
				
			case 5:
				System.out.println("수정할 연락처의 이름을 입력 하시오>> ");
				String reName = sc.nextLine();
				editAddr(reName, addr);
				break;
				
			case 6:
				//boolean의 값을 false로 설정하여 while문 탈출
				run = false;
				break;
				
			default:
				System.out.println("잘못된 입력 값 입니다. 메뉴의 번호를 고르세요.");
				break;
			}
		}
		System.out.println("시스템이 종료 되었습니다.");
	}
	
	void printAllAddr() {
		for(int i=0; i<count; i++) {
			printAddr(i);
		}	
	}	
	
	//연락처 정보 확인하기, 입력값과 addAddr[i].name이 같으면 출력한다
	void serchAddr(String name) {
		for(int i=0; i<count; i++) {
			if(name.contentEquals(addAddr[i].getName())) {
				System.out.println("\n" + name + "의 연락처 정보는");
				printAddr(i);
			}
		}
	}
	
	//연락처 정보 삭제하기, 입력값과 addAddr[i].name이 같으면 삭제한다
	//인덱스 i번쨰에 같으므로 i번째 배열에 i+1값을 넣어서 복사한다
	//배열의 값이 하나 줄었으므로 count--하고 , 복사하고 남은 마지막 인덱스값을 null로 지운다
	void deleteAddr(String name) {
		for(int i=0; i<count; i++) {
			if(name.contentEquals(addAddr[i].getName())) {
				for(int j=i; j<count-1; j++) {
					addAddr[j] = addAddr[j+1];
				}
				count--;
				addAddr[count] = null;
				System.out.println(name + "의 연락처가 삭제 되었습니다");
			} 
		}
	}
	//값을 바꿀 배열값을 찾는 name , Addr클래스타입의 매개변수 newAddr를 생성
	//inputAddrData();로 set을해서 객체에 값을 넣어준 후 그 값을 return해서 newAddr로 받아온다
	//다시 와서 값을 바꿀 인덱스에 새로 초기화시킨 newAddr를 넣어줘서 값을 변경한다
	void editAddr(String name, Addr newAddr) {
		for(int i=0; i<count; i++) {
			if(name.contentEquals(addAddr[i].getName())) {
				inputAddrData();
				addAddr[i] = newAddr;
				System.out.println(">>> 데이터가 저장 되었습니다 (" + (count) + ")");
				return;
			}
		}
	}
	
	void printAddr(int i) {
		System.out.println("\n---------------------");
		System.out.println("이름 : " + addAddr[i].getName());
		System.out.println("전화번호 : " + addAddr[i].getPhoneNum());
		System.out.println("이메일 : " + addAddr[i].getEmail());
		System.out.println("주소 : " + addAddr[i].getAddress());
		System.out.println("그룹 : " + addAddr[i].getGroup());
		System.out.println("---------------------");
	}
	
}


/*
if(!name.contentEquals(addAddr[i].getName())){
				System.out.println("그런 이름의 연락처는 없습니다");
				return;
			}
*/