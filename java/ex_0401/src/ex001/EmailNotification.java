package ex001;

public class EmailNotification implements B{

	@Override
	public void Email(String message) {
		System.out.println(message + "회원가입을 환영합니다.");
		
	}
	
}
