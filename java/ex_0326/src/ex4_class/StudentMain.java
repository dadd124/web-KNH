package ex4_class;

public class StudentMain {
	public static void main(String[] args) {
		
		Student s = new Student();
		
		s.name = "dd";
		s.age = 11;
		s.score = 12;
		
		System.out.println("이름: " + s.name);
		System.out.println("나이: " + s.age);
		System.out.println("점수: " + s.score);
		
	}
}
