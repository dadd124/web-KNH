package ex2_casting;

public class PromotionExample{
	public static void main(String[] args) {
		// 자동 타입 변환
		// 작은 자료형 -> 큰 자료형으로 바꾸려 할 때
		// 자동으로 변호나이 된다.
		
//		byte byeValue = 10;
//		int inValue = bytealbe;
//		System.out.println("intValue : " + inValue);
//		
//		intValue = 50;
//		long longValue = intValue;
//		System.out.println("longValue : " + longValue);
		
		// 문자형타입의 자동형변환
		// 문자형 -> 정수형타입
		char c = 'A';
		int num = c; // 문자형타입 데이터를 정수형 변수에 대입
		System.out.println(num); // 아스키코드값으로 변경되서 나온다. 
		
	}
}