package ch10;

public class ImputException extends Exception{
	public ImputException() {}
	public ImputException(String message) {
		super(message);
		message= "입려하신 데이터는 숫자가 아닙니다";
	}
}
