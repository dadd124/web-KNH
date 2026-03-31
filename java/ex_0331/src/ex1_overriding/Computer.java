package ex1_overriding;

public class Computer extends Calculator{
	
	//@ : 어노테이션
	//@Override : 컴파일 단계에서 정확히 오버라이딩이 되었는지 체크하고
	

	@Override
	public double areaCircle(double r) {
		System.out.println("Computer 객체의 areaCircle() 실행");
		return Math.PI * r * r;
	}
}
