package ex4_setter_getter;

public class StudentMain {
	public static void main(String[] args) {
		
		Student s = new Student();
		
		s.setStudent("홍길동", 10);
		
		System.out.println("이름 : " + s.getName());
		System.out.println("나이 : " + s.getAge());
		
	}
}
