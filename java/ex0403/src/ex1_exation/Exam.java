package ex1_exation;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exam {
	public static void main(String[] args) {
		// 키보드에서 정수를 입력받고, 정수 이외의 값이 입력되었다면
		// "정수만 입력가능" 메세지 출력하기
		
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("입력 : ");
			int num = sc.nextInt();
			System.out.println(num);
		} catch(InputMismatchException e){
			System.out.println("정수만 입력가능");
		}
		
		String[] fruits = {"사과", "바나나", "포도", "복숭아"};
		// 인덱스를 입력 받는다.
		// 해당위치의 과일을 출력한다.
		// 숫자가 아닌 값을 입력하면 "숫자를 입력해야 합니다." 출력
		// 범위를 벗어난 인덱스를 입력하면 "존재하지 않는 인덱스입니다." 출력
		
		try {
			System.out.print("입력 : ");
			int index = sc.nextInt();
			
			System.out.println("선택한 과일 : " + fruits[index]);
			
		} catch (InputMismatchException e) {
			System.out.println("숫자를 입력해야 합니다.");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("존재하지 않는 인덱스입니다.");
		}
		
		String[] animals = {"강아지", "고양이", "토끼", "호랑이"};
		
		while(true) {
		try {
			System.out.println("입력 : ");
			int index = sc.nextInt();
			
			System.out.println("선택한 동물 : " + animals[index]);
			break;
			
		} catch (InputMismatchException e) {
			System.out.println("숫자를 입력해야 합니다.");
			sc.nextLine();
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("존재하지 않는 인덱스입니다.");
		}
		}
	}
}
