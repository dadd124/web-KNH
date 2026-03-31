package ex5_polymorphism.exam02;

public class CardPayment extends Payment{
	@Override
	public void pay(int amount) {
		System.out.println(amount + "원을 카드로 결제합니다.");
	}
}
