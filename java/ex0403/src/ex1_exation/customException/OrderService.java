package ex1_exation.customException;

public class OrderService {

	public int calculate(int price, int quantity) throws IllegalArgumentException{
		
		if(quantity < 0) {
			throw new IllegalArgumentException("수량은 1 이상이어야 합니다.");
		} else if(price <= 0) {
			throw new IllegalArgumentException("가격은 1 이상이어야 합니다.");
		}
		return price * quantity;
	}
	
}
