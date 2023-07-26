package ReviewMiniprj02;

import java.util.*;

public class SmartPhone {
	List<Addr> addrList = new LinkedList<>();
	
	int count = 0;
	
	Scanner sc = new Scanner(System.in);
	
	public Addr inputData() {
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("전화번호 : ");
		String phoneNumber = sc.nextLine();
		System.out.print("이메일 : ");
		String email = sc.nextLine();
		System.out.print("주소 : ");
		String address = sc.nextLine();
		System.out.print("그룹(친구/가족) : ");
		String group = sc.nextLine();
		return new Addr(name, phoneNumber, email, address, group);
	}
	
	public void addAddr(Addr addr) {
		addrList.add(addr);
		++count;
		System.out.println("데이터가 저장 되었습니다. (" +count+ ")");
		//printAddr(addr);
	}
	
	public void printAddr(Addr addr) {
		addr.printInfo();
	}
	
	public void printAll() {
		for(int i=0; i<addrList.size(); i++) {
			addrList.get(i).printInfo();
		}	
	}
	
	public void serch(String name) {
		for(Addr add : addrList) {
			if(add.getName().contentEquals(name)) {
				add.printInfo();
			}
		}
	}
	
	public void deleteAddr(String name) {
		for(Addr add : addrList) {
			if(add.getName().contentEquals(name)) {
				addrList.remove(add);
			}
		}
	}
	
	public void editAddr(String name, Addr newAddr) {
		for(int i=0; i<addrList.size(); i++) {
			if(addrList.get(i).getName().equals(name)) {
				addrList.set(i, newAddr);
			}
			
		}
	}
}
