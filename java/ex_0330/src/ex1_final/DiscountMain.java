package ex1_final;

import java.util.Scanner;

public class DiscountMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("상품 가격 입력 : ");
		int price = sc.nextInt();
		
		DisCountRate d = new DisCountRate();
		d.discountRate(price);
		
		System.out.println(d);
		sc.hasNextDouble();
		
	}
}
