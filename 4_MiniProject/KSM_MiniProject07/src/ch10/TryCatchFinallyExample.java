package ch10;

public class TryCatchFinallyExample {

	public static void main(String[] args) {
		String data1 = "sad";
		String data2 = "afasfas";
		args = new String[5];
		try {
			data1 = args[0];
			args[1] = data2;
			System.out.println(data1);
			System.out.println(data2);
			args[6] = data2;
		}catch(Exception e) {
			
			System.out.println("어뤠이 인덱스 아웃 머시기");
		}
//		try {
//			Class clazz = Class.forName("java.lang.String");
//			System.out.println(clazz);
//		}catch(Exception e) {
//			System.out.println("클래스가 존재하지 않습니다");
//		}finally {
//		}

	}

}
