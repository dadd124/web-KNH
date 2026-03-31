package ex5_polymorphism.exam04;

public class Main {
	public static void main(String[] args) {
		
		zoo z = new zoo();
		
		// 추상 클래스는 객체를 직접 생성할 수 없다.
		// Animal a = new Animal();
		
		z.printSound(new Dog());
		z.printSound(new Cat());
	}
}
