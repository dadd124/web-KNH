package ex2_method;

public class MethodMain {
	public static void main(String[] args) {
		// 클래스 안에는 정의된 메서드 사용
		
		// 1. 객체는 정의되어야 한다.
		MethodExample m = new MethodExample();
		
		// 2. 객체를 통해서 메서드를 호출해야 한다.
		// 변수명.메서드명();
		m.printInfo();
		
		// 두 수를 더해서 출력하기
		
		// 메서드 호출
		int result = m.add(10, 7);
		System.out.println(result);
		
		System.out.println(m.add(3,2));
		
		double re2 = m.circleArea(6);
		System.out.println(re2);
		
		m.circleRound(4);
		
		int [] nu = {1,2,3,4,};
		
		int re3 = m.countEven(nu);
		System.out.println(re3);
		
		m.countChar("apple", 'p');
		m.countChar2("ball", 'a');
		
		
		
	}
}
