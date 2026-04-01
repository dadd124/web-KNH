package ex002;

public class Main {
	public static void main(String[] args) {
		
		Button b = new Button();
		
		b.setListener(new LoginListener());
		b.click();
		
		b.setListener(new LogoutListener());
		b.click();
		
	}
}
