package ex1_final;

public class Parking {

	// 기본 요금 : 10,000원(상수)
	// 추가 요금 : 시간당 2,000(상수)
	
	static final int a = 10000;
	static final int b = 2000;
	
	// 요금계산 메서드
	public int calculateFee(int time) {
		return a + (time * b);
	}
	
}
