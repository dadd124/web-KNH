package ex3_print;

public class PrintExample {
	public static void main(String[] args) {
		// System.out.print("Welcome\n");
		// System.out.print("Java World\n");
		
		System.out.println("Welcome");
		System.out.println("Java World");
		
		int age = 30;
		String name = "박길동";
		
		System.out.println("제 이름은 " + name + ", 나이는 " + age + "입니다.");
		
		// printf();
		// 문자열 속에서 데이터를 출력할 수 있는 메서드
		// 데이터는 자료형에 따라 서식문자를 이용해 출력한다.
		
		// 정수 : %d(decimal)
		// 실수 : %f(float)
		// 문자형 : %c(charater)
		// 문자열 : %s
		// 논리형 : %b
		
		System.out.printf("제 이름은 %s, 나이는 %d세 입니다.\n", name, age);
		
		double height = 169.5;
		System.out.printf("키는 %.1fcm입니다.", height);
		
		int price = 123;
		System.out.printf("상품 가격 : %6d원\n", price);
		System.out.printf("상품 가격 : %06d원\n", price);
		System.out.printf("상품 가격 : %-6d원\n", price);
		// System.out.println("상품 가격 : %-06d원", price);
	}
}
