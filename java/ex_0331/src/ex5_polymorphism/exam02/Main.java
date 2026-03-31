package ex5_polymorphism.exam02;

public class Main {
	public static void main(String[] args) {
		
		Order or = new Order();
		
		or.payment = new CardPayment();
		or.proccessPayment(3);
		
		or.payment = new KakaoPayment();
		or.proccessPayment(2);
		
	}
}
