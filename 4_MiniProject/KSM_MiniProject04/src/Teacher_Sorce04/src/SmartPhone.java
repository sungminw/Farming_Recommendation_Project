package Teacher_Sorce04.src;

import java.util.Scanner;

public class SmartPhone {
	Scanner in = new Scanner(System.in);
	Addr[] addr = new Addr[10];
	int count = 0;

	public Addr inputAddrData(String groupName) {
		Addr addrGroup = null;
		System.out.println("이름 : ");
		String name = in.nextLine();
		System.out.println("전화번호 : ");
		String phnNum = in.nextLine();
		System.out.println("이메일 : ");
		String email = in.nextLine();
		System.out.println("주소 : ");
		String addr = in.nextLine();
		System.out.println("생일 : ");
		String birth = in.nextLine();
		if(isCompany(groupName)==true) {
			String group = "회사";
			System.out.println("회사이름 : ");
			String company = in.nextLine();
			System.out.println("부서이름 : ");
			String department = in.nextLine();
			System.out.println("직위 : ");
			String position = in.nextLine();
			addrGroup = new CompanyAddr(name,phnNum,email,addr,birth,group,company,department,position);
		}else{
			String group = "거래처";
			System.out.println("거래처이름 : ");
			String client = in.nextLine();
			System.out.println("거래품목 : ");
			String trnsactionItem = in.nextLine();
			System.out.println("직위 : ");
			String position = in.nextLine();
			addrGroup = new CustomerAddr(name,phnNum,email,addr,birth,group,client,trnsactionItem,position);
		}
		return addrGroup;
	}

	public boolean isCompany(String groupName) {
		if(groupName==null) {	
			System.out.println("그룹(회사/거래처) : ");
			groupName = in.nextLine();
		}
		while(groupName.contentEquals("회사")==false && groupName.contentEquals("거래처")==false) {
			System.out.println("잘못된 그룹입니다. 다시 입력해주세요.\n그룹(회사/거래처) : ");
			groupName = in.nextLine();
		}
		if(groupName.contentEquals("회사")) {return true;}
		
		return false;
	}
	
	public void addAddr(Addr Addr) {
		addr[count] = Addr;
		count++;
		System.out.println(">>> 데이터가 저장되었습니다.("+count+")");
	}
	
	public void printAddr(Addr Addr) {
		System.out.println("---------------------------------");
		System.out.println("이름 : "+Addr.getName());
		System.out.println("전화번호 : "+Addr.getPhnNum());
		System.out.println("이메일 : "+Addr.getEmail());
		System.out.println("주소 : "+Addr.getAddr());
		System.out.println("생일 : "+Addr.getBirth());
		System.out.println("그룹 : "+Addr.getGroup());
		if(isCompany(Addr.getGroup())==true) {
			if(Addr instanceof CompanyAddr) {
				CompanyAddr company = (CompanyAddr)Addr;
				System.out.println("회사 이름 : "+company.getCompanyName());
				System.out.println("부서 이름 : "+company.getDepartment());
				System.out.println("직위 : "+company.getPosition());
			}
		}else{
			if(Addr instanceof CustomerAddr) {
				CustomerAddr customer = (CustomerAddr)Addr;
				System.out.println("거래처 이름 : "+customer.getClientName());
				System.out.println("품목 이름 : "+customer.getTrnsactionItem());
				System.out.println("직위 : "+customer.getPosition());
			}
		}
		System.out.println("---------------------------------");
	}

	public void printAllAddr() {
		for(int i=0;i<count;++i) {
			printAddr(addr[i]);
		}
	}

	public void searchAddr(String name) {
		for(int i=0;i<count;++i) {
			if(addr[i].getName().contentEquals(name)) {
				printAddr(addr[i]);
				return; 
			}
		}
		System.out.println("검색 결과가 없습니다.");
	}
	
	public void deleteAddr(String name) {
		for(int i=0;i<count;++i) {
			if(this.addr[i].getName().contentEquals(name)) {
				for(int j=i;j<count;++j) {
					addr[j] = addr[j+1];
				}
				count--;
				return;
			}
		}
		System.out.println("검색 결과가 없습니다.");
	}
	
	public void editAddr(String name, Addr newAddr) {
		for(int i=0;i<count;++i) {
			if(this.addr[i].getName().contentEquals(name)) {
				addr[i]= newAddr;
				return;
			}
		}
		System.out.println("검색 결과가 없습니다.");
	}
}
