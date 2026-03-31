package ex2_method;

import java.util.Scanner;

public class CalculatorMain {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Calculator c = new Calculator();
		
		System.out.println("첫 번째: ");
		int x = sc.nextInt();
		
		System.out.println("두 번째: ");
		int y = sc.nextInt();
		
		System.out.println("답: ");
		String op = sc.next();
		
		int result = c.getResult(x, y, op);
		
		System.out.println("결과: " + result);
		
	}

}
