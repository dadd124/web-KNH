package ex2_method;

public class Calculator {
	// 계산기 기능이 있는 메서드
	// 숫자 2개, 문자열타입의 연산자
	public int getResult(int x, int y, String op) {
		if(op.equals("+")){
			return x + y;
		} else if(op.equals("-")) {
			return x - y;
		} else if(op.equals("*")) {
			return x * y;
		} else if(op.equals("/")) {
			return x / y;
		} else {
			System.out.println("잘못된 입력");
			return 0;
		}
		
	}

}
