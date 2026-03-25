package ex2_while;

import java.util.Scanner;

public class BreakExample {
	public static void main(String[] args) {
		// 1~45 사이의 난수 뽑기
		int rand = (int)(Math.random()*45)+1;
		
//		Scanner sc = new Scanner(System.in);
//		int answer;
//		
//		System.out.println("updown, 기회는 10번");
//		
//		for (int i = 1; i <=10; i++) {
//			System.out.println(i + "번 시도: ");
//			answer = sc.nextInt();
//			
//			if(answer == rand) {
//				System.out.println(i + "번만에 성공!");
//				break;
//			} else if(answer < rand) {
//				System.out.println("up");
//			} else if(answer > rand) {
//				System.out.println("down");
//			}
//			
//			if(i == 10) {
//				System.out.println("기회가 모두 소진되었습니다. 정답은 " + rand);
//			}
//		}
//		sc.close();
//		
////		while(true) {
////			System.out.println("정답 : ");
////			answer = sc.nextInt();
////			// 입력 받은 answer랑 난수랑 일치하면
////			// 반복문을 빠져나가게 하기
//			if(answer == rand) {
//				break;
//			}
//		}
		
		// updown 게임을 for문을 이용해서 만들기
		// 기회는 10번
		// 중간에 정답을 맞추면 반복문 종료하고 "정답입니다" 출력하기
		// 입력한 값이 정답보다 작으면 "up"
		// 입력한 값이 정답보다 크면 "down"
		// 10번만에 못 맞추면 "정답을 맞추지 못했습니다."
		
		// 라벨
		outer:for(int i = 1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				System.out.println(i+" "+j);
				if(j == 3) {
					break outer;
				}
			}
		}
		
		
	}
}
