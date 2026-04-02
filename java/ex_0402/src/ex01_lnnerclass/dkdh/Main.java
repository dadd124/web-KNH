package ex01_lnnerclass.dkdh;

public class Main {
	public static void main(String[] args) {
		
		// 익명클래스는 인터페이스에서 많이 활용된다.
		
		Calculator c = new Calculator() {
			
			// 접근제한자를 부모보다 좁게 줄일 수 없다.
			@Override
			public void add(int x, int y) {
				int result = x + y;
				System.out.println("결과 : " + result);
			}
		};
		
		c.add(8, 9);
		
	}
}
