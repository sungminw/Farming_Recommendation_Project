package ch10;

import java.util.*;

public class NumberTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("태어난 년도를 입력 하시오");
		
		try {
			int input = sc.nextInt();
			System.out.println("입력하신 숫자는 : " + input);
			//정수로 입력해야 하는데 문자를 입력한 경우 예외 발생
			}catch(InputMismatchException e) {
				System.out.println("입력하시는 데이터는 숫자가 아닙니다.");
				e.printStackTrace();
		}
		
	}
	
}
