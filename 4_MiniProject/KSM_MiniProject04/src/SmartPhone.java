import java.util.*;

public class SmartPhone {
	//필드
	int count = 0;
	Addr[] addAddr;
	Scanner sc;

	//셍성자
	public SmartPhone() {
		addAddr = new Addr[10];
		sc = new Scanner(System.in);
			
	}
	
	public Addr inputAddrData() {
		System.out.print("이름: ");
		String name = sc.nextLine();
		System.out.print("전화번호: ");
		String phoneNum = sc.nextLine();
		System.out.print("이메일: ");
		String email = sc.nextLine();
		System.out.print("주소: ");
		String address = sc.nextLine();
		System.out.print("그룹(회사/거래처): ");
		String group = sc.nextLine();
		if(group.contentEquals("회사")) {
			System.out.print("회사이름: ");
			String companyName = sc.nextLine();
			System.out.print("부서이름: ");
			String departmentName = sc.nextLine();
			System.out.print("직급: ");
			String position = sc.nextLine();
			System.out.println();
			return new CompanyAddr(name, phoneNum, email, address, group, companyName, departmentName, position);
		} else if (group.contentEquals("거래처")) {
			System.out.print("거래처이름: ");
		String clientName = sc.nextLine();
		System.out.print("품목이름: ");
		String transItem= sc.nextLine();
		System.out.print("직급: ");
		String cusPosition = sc.nextLine();
		System.out.println();
		return new CustomerAddr(name, phoneNum, email, address, group, clientName, transItem, cusPosition);
		}
		return null;
	}


	public void addAddr(Addr addr) {
		addAddr[count] = addr;
		System.out.println(">>> 데이터가 저장 되었습니다 (" + (count+1) + ")");
		count++;
	}
	
	public void printAddr(Addr addr) {
				addr.printInfo();
		}
	
	public void printAllAddr() {
		for(int i=0; i<count; i++) {
			System.out.println("\n===================");
			printAddr(addAddr[i]);
			System.out.println("\n===================");
		}
	}

	public void serchAddr(String name) {
		for(int i=0; i<count; i++) {
			Addr addr = addAddr[i];
			if(name.contentEquals(addr.getName())) {
				System.out.println("\n" + name + "의 연락처 정보는");
				printAddr(addr);
				return;
			}
		}
		System.out.println(name + "의 연락처가 없습니다");
	}

	void deleteAddr(String name) {
		for(int i=0; i<count; i++) {
			Addr addr = addAddr[i];
			if(name.contentEquals(addr.getName())) {
				for(int j=i; j<count-1; j++) {
					addAddr[j] = addAddr[j+1];
				}
				count--;
				addAddr[count] = null;
				System.out.println(name + "의 연락처가 삭제 되었습니다");
				return;
			}
		}
		System.out.println(name + "의 연락처가 없습니다");
	}
	
	void editAddr(String name, Addr newAddr) {
		for(int i=0; i<count; i++) {
			if(name.contentEquals(addAddr[i].getName())) {
				addAddr[i] = newAddr;
				System.out.println(">>> 데이터가 저장 되었습니다 (" + (count) + ")");
				return;
			}
		}
		System.out.println(name + "의 연락처가 없습니다");
	}
}


