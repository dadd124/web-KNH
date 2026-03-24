package ex1_operator;

import java.util.Scanner;

public class Example {
	public static void main(String[] args) {
		// 상자 하나에는 농구공 5개가 들어갈 수 있다.
		// 만일 농구공이 23개라면 몇개의 상자가 필요한가?
		
		int b = 23;
		int box = (b + 4) /5;
		System.out.println(box);
		
		int a = 23;
		int bx = (a % 5 ==0) ? (a/5) : (a/5+1);
		
		System.out.println(bx);
		
		Scanner sc = new Scanner(System.in);
		
//		System.out.println("공의 개수 : ");
//		int ball = sc.nextInt();
//		
//		int boxs = (ball % 5 ==0) ? (ball/5) : (ball & 5+1);
//		System.out.println(boxs);
		
		// 사격형의 가로와 세로의 길이를 입력받아
		// 넓이와 둘레 구하기
		
//		int area = width * height
	//	int round = (width + height)
		//System.out.println("너비 : " + area);
		//System.out.println("둘레 : " + round);
		
		// 학생은 하루에 일정한 금액의 용돈을 받는다.
		// 하루에 받는 용돈 : money
		// 날짜 수 : day
		// 총 받은 용돈에서 사용한 금액 used를 뺀 남은 돈을
		// 출력하는 코드 작성하기
		
		// 각 값들은 키보드에서 입력
		
//		System.out.println("받는 돈 : ");
//		int money = sc.nextInt();
//		
//		System.out.print("날짜 수 입력: ");
//		int day = sc.nextInt();
//		
//		System.out.print("사용한 금액 입력: ");
//		int used = sc.nextInt();
//		
//		int total = money * day;
//		int remain = total - used;
//		
//		System.out.println("남은 돈 : " + remain);
//		
//		sc.close();
		
		// 국어, 영어, 수학에 대한 점수를 커보드에서 입력 받는다.
		// 1. 세 과목에 대한 합계 출력
		// 2. 평균 출력(합계/3.0)
		// 3. 세 과목의 점수가 각각 60점 이상이고, 평균이 60점 이상일 때 합격
		// 아니면 불합격
		
		System.out.println("국어 점수 : ");
		int aa = sc.nextInt();
		
		System.out.println("영어 점수 : ");
		int bb = sc.nextInt();
		
		System.out.println("수학 점수 : ");
		int cc = sc.nextInt();
		
		int to = aa + bb + cc;
		double re = to / 3.0;
		
		String r = (aa >= 60 && bb >= 60 && cc >= 60 && re >= 60)
				? "합격" : "불합격";
		
		System.out.println("결과 : " + r);
		sc.close();
	}
}
