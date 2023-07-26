package HashMapPackage;
import java.util.*;
import java.util.Map.Entry;

public class SmartPhone {

	//필드
	int count = 0;
	Map<String, Addr> map;
	Scanner sc;
	Set<Map.Entry<String, Addr>> setEntry;
	
	//셍성자
	public SmartPhone() {
		map = new HashMap<>();
		sc = new Scanner(System.in);
		setEntry = map.entrySet();
	}
	
	public String newKey() {
		System.out.println("핸드폰 번호를 입력하시오");
		return sc.nextLine();
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

	public void addAddr() {
		String phone = newKey();
		if(!map.containsKey(phone)) {
			map.put(phone, inputAddrData());
			System.out.println(">>> 데이터가 저장 되었습니다 (" + (count+1) + ")");
			count++;
		}else {
			System.out.println("이미 저장된 전화번호 입니다");
		}
	}

	public void printAllAddr() {
		for(Map.Entry<String, Addr> entry : setEntry) {
			System.out.println("\n---------------------");
			System.out.println("휴대폰 번호 : " + entry.getKey());
			System.out.println("이름 : " + entry.getValue().getName());
			System.out.println("전화번호 : " + entry.getValue().getPhoneNum());
			System.out.println("이메일 : " + entry.getValue().getEmail());
			System.out.println("주소 : " + entry.getValue().getAddress());
			System.out.println("그룹 : " + entry.getValue().getGroup());
			System.out.println("---------------------");
		}
		
	}

	public void serchAddr(String name) {
		Iterator<Map.Entry<String, Addr>> iter = setEntry.iterator();//받아온 키를 반복자(iterator)에 하나씪 넣음
		while(iter.hasNext()) {
			Map.Entry<String, Addr> entry = iter.next();
			if(entry.getValue().getName().equals(name)) {
				System.out.println("\n---------------------");
				System.out.println("휴대폰 번호 : " + entry.getKey());
				System.out.println("이름 : " + entry.getValue().getName());
				System.out.println("전화번호 : " + entry.getValue().getPhoneNum());
				System.out.println("이메일 : " + entry.getValue().getEmail());
				System.out.println("주소 : " + entry.getValue().getAddress());
				System.out.println("그룹 : " + entry.getValue().getGroup());
				System.out.println("---------------------");
				return;
			}
		}
		System.out.println(name + "의 연락처가 없습니다");
	}

	void deleteAddr(String name) {			
		for(Map.Entry<String, Addr> entry:setEntry) {
			if(entry.getValue().getName().equals(name)) {
				map.remove(entry.getKey());
				count--;
				return;
			}
		}
		System.out.println(name + "의 연락처가 없습니다");
	}
//		Set<String> keySet = map.keySet();
//		if(map.containsKey(name)) {
//			for(String key:keySet) {
//				if(key.contains(name)) {
//					map.remove(name);
//					count--;
//					return;
//				}
//			}
//			System.out.println(name + "의 연락처가 없습니다");
//		}
	
	
			/*
			Iterator<Map.Entry<String, Addr>> iter = setEntry.iterator(); //받아온 키를 반복자(iterator)에 하나씪 넣음
			while(iter.hasNext()) {
				Map.Entry<String, Addr> entry = iter.next();//enrty에 키,값의 쌍을 하나씩 넣는다
				if(entry.getKey().equals(name)) {
					map.remove(name);
					count--;
					return;
				}
			}
		}
		*/

	
	void editAddr(String name) {
		for(Map.Entry<String, Addr> entry : setEntry) {
			if(entry.getValue().getName().contentEquals(name)) {
				deleteAddr(name);
				addAddr();
				return;
			}
		}
		System.out.println(name + "의 연락처가 없습니다");
	}
		/*
		for(int i=0; i<count; i++) {
			if(name.contentEquals(addAddr[i].getName())) {
				addAddr[i] = newAddr;
				System.out.println(">>> 데이터가 저장 되었습니다 (" + (count) + ")");
				return;
			}
		}
		System.out.println(name + "의 연락처가 없습니다");
	}
	*/
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

/*
Set<Map.Entry<String, Addr>> entrySet = map.entrySet();
Iterator<Map.Entry<String, Addr>> iter = entrySet.iterator();
while(iter.hasNext()) {
	Map.Entry<String, Addr> entry = iter.next();
	if(entry.getKey().equals(name)) {
*/