package Miniprj07;

import java.util.*;

public class NameExceptionMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("아이디를 입력 하시오>>");
		String name = sc.nextLine();
		
		if(name != null && !name.isEmpty()) {
			
			if(checkId(name)) {
				System.out.println("입력하신 아이디는 : " + name);
			}else {
			
				try {
					throw new BadIdInputException("잘못된 이름을 입력 하셨습니다");
					
				}catch(BadIdInputException e) {
					System.out.println(e.getMessage());
					e.getStackTrace();
				}
			}
			
		}else {
			System.out.println("잘못된 아이디 입력 입니다");
		}
		

	}
	public static boolean checkId(String name) {
		for(int i=0; i<name.length(); i++) {
			char c = name.charAt(i);
			
			if(c>='a'&&c<='z' || c>='A'&&c<='Z' || c>='0'&&c<='9') {
				return true;
			}
		}
		return false;
	}
	
}
