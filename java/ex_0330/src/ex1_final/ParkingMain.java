package ex1_final;

import java.util.Scanner;

public class ParkingMain {
	public static void main(String[] args) {
		// 키보드에서 입력 받아 총 금액 구하기
		
		Parking p = new Parking();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("사용 시간 입력: ");
		int time = sc.nextInt();
		
		int total = p.calculateFee(time);
		
		System.out.println("총 금액 : " + total);
				
		}		
}
