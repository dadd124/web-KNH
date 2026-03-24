package ex2_if;

import java.util.Scanner;

public class IfelseEample {
	public static void main(String[] args) {
		int age = 17;
		
		if(age >= 20) {
			System.out.println("성인입니다.");
		} else {
			System.out.println("미성년자입니다.");
		}
		
		// 정수 하나를 입력 받아서 짝수면 "짝수", 홀수면 "홀수"를
		// 출력하는 코드 작성하기
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 입력: ");
		int a = sc.nextInt();
		
		if(a % 2 == 0) {
			System.out.println("짝수");
		} else {
			System.out.println("홀수");
		}
		
		System.out.println("결과 : " + a);
		
		sc.close();
		
		// 사용자가 입력한 비밀번호가 맞는지 확인하기
		// 키보드에서 비밀번호 입력 받기
		// 비밀번호 : 1234
		// 입력한 비밀번호와 일치하면 "로그인 성공"
		// 일치하지 않으면 "비밀번호가 일치하지 않습니다."
		
		
		System.out.print("숫자 입력: ");
		int b = sc.nextInt();
		
		if (b == 1234) {
			System.out.println("로그인 성공");
		} else {
			System.out.println("비밀번호가 일치하지 않습니다.");
		}
		sc.close();
	}
}
