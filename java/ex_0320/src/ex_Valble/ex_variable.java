package ex_Valble;

public class ex_variable {

	public static void main(String[] args) {
		// sysout 템플릿으로 만들기
		System.out.println(10);
		System.out.println(3.14);
		System.out.println("홍길동");
		
		int x;
		x = 55;
		System.out.print(x);
		
		System.out.println(x+1);
		
		x = x + 1;
		
		System.out.println(x);
		
		int y = 30;
		// 변수는 출력문이나 연산식에 사용되어 값을 활용할 수 있다
		
		System.err.println(y);
		
		int hour = 3;
		int minute = 5;
		// 슷지 + 문자열은 문자열로 합쳐진다.
		// "3시간"
		System.out.println(hour + "시간" + minute + "분");
		
		// 총 몇 분인지 구하기
		int totalMinute = hour * 60 + minute;
		System.out.println("총" + totalMinute + "분");
		
		int a = 3;
		int b = a;
		
		System.out.println("a=" + a);
		System.out.println("b=" + b);
		
	}

}
