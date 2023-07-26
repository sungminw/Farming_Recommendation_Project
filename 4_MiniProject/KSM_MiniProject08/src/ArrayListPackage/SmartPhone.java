package ArrayListPackage;
import java.util.*;

public class SmartPhone {

	//필드
	int count = 0;
	List<Addr> list;
	Scanner sc;

	//셍성자
	public SmartPhone() {
		list = new ArrayList<>();
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
			System.out.print("그룹(가족/친구): ");
			String group = sc.nextLine();
			return new Addr(name, phoneNum, email, address, group);
	}

	public void addAddr(Addr addr) {
		list.add(addr);
		System.out.println(">>> 데이터가 저장 되었습니다 (" + (count+1) + ")");
		printAddr(addr);
		count++;
	}
	
	public void printAddr(Addr addr) {
		System.out.println("\n---------------------");
		System.out.println("이름 : " + addr.getName());
		System.out.println("전화번호 : " + addr.getPhoneNum());
		System.out.println("이메일 : " + addr.getEmail());
		System.out.println("주소 : " + addr.getAddress());
		System.out.println("그룹 : " + addr.getGroup());
		System.out.println("---------------------");
	}
	
	public void printAllAddr() {
		for(int i=0; i<count; i++) {
			printAddr(list.get(i));
		}
	}

	public void serchAddr(String name) {
		for(Addr addr:list) {
			if(name.contains(addr.getName())) {
				System.out.println("\n" + name + "의 연락처 정보는");
				printAddr(addr);
				return;
			}
		}
		System.out.println(name + "의 연락처가 없습니다");
	}

	void deleteAddr(String name) {
		for(Addr addr:list) {
			if(name.contains(addr.getName())) {
				list.remove(addr);
				count--;
				return;
			}
		}
		System.out.println(name + "의 연락처가 없습니다");
	}
	
	void editAddr(String name, Addr newAddr) {
		for(int i=0; i<list.size(); i++) {
			Addr addr = list.get(i);
			if(name.contains(addr.getName())) {
				list.set(i, newAddr);
				System.out.println(">>> 데이터가 저장 되었습니다 (" + (count) + ")");
				return;
			}
		}
		System.out.println(name + "의 연락처가 없습니다");
	}
}

//	void printAddr(int i) {
//		System.out.println("\n---------------------");
//		System.out.println("이름 : " + addAddr[i].getName());
//		System.out.println("전화번호 : " + addAddr[i].getPhoneNum());
//		System.out.println("이메일 : " + addAddr[i].getEmail());
//		System.out.println("주소 : " + addAddr[i].getAddress());
//		System.out.println("그룹 : " + addAddr[i].getGroup());
//		System.out.println("---------------------");
//	}

