package ex1_exation.throwsexample;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Converter converter = new Converter();
		
		System.out.println("문자열 입력 : ");
		String input = sc.nextLine();
		
		try {
			int num = converter.tolnt(input);
			System.out.println("변환된 숫자 : " + num);
		} catch (NumberFormatException e) {
			System.out.println("숫자로 변환할 수 없습니다.");
		}
		
		sc.close();
	}
}
