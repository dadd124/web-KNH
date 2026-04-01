package ex001;

public class SmsNotification implements A{
	
	@Override
	public void send(String message) {
		System.out.println(message + "의 인증번호를 전송합니다.");
	}

}
