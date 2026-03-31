package ex1_final;

public class DisCountRate {
	
	// 할인률
	static final double RATE_HIGHT = 0.02;
	static final double RATE_MID = 0.1;
	static final double RATE_LOW = 0.05;
	
	// 금액별 할인률 결정하는 메서드
	public double discountRate(int price){
		if(price >= 100000) {
			return price * RATE_HIGHT;
		} else if(price >= 50000) {
			return price * RATE_MID;
		} else {
			return price * RATE_LOW;
		}
	}	
	
	// 금액별 할인률이 적용된 금액을 반환하는 메서드
	// 메서드 내부에서 메서드를 호출할 수 있다.
	public double calculatePrice(int price) {
		double rate = discountRate(price);
		return price * (1 - rate);
	}
	
	
}
