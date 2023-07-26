package Miniprj07;

import java.util.*;

public class TypeMissMatch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("태어난 년도를 입력 하시오");
		
		try {
			int age = sc.nextInt();
			System.out.println("태어난 년도는 : " +age);
		}catch(InputMismatchException e) {
			System.out.println("정수값이 아닙니다");
			e.printStackTrace();
		}

	}

}
