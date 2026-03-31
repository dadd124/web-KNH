package ex4_class;

import java.util.Scanner;

public class StudentMain {
	public static void main(String[] args) {
		
		// StudentMain
		// 학생 3명의 정보를 저장할 수 있도록 객체 배열을 만들고 출력하기
		// 배열 사용하기
		Scanner sc = new Scanner(System.in);
		
		System.out.println();
		
		Student s = new Student();
		
		s.name = "dd";
		s.age = 11;
		s.score = 12;
		
		System.out.println("이름: " + s.name);
		System.out.println("나이: " + s.age);
		System.out.println("점수: " + s.score);
		
	}
}
