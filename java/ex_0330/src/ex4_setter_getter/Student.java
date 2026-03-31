package ex4_setter_getter;

public class Student {

	private String name;
	private int age;
	
	public void setStudent(String name, int age) {
		
		if(age < 0) {
			System.out.println("잘못된 입력");
			return;
		} 	this.name = name;
			this.age = age;
		
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	
}
