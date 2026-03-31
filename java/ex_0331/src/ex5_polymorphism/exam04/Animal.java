package ex5_polymorphism.exam04;

// 추상 클래스
abstract class Animal {
	
	// 추상 클래스에도 일반적인 필드나 메서드가 들어갈 숫 있다.
	int feed;
	
	public void breath() {
		System.out.println("숨을 쉰다.");
	}
	
	// 추상 메서드
	public void run() {
		System.out.println("동물이 운다.");
	}
}

// 추상 클래스를 상속받은 클래스는 추상 메서드를 반드시
// 오버라이딩해서 내요ㅕㅇ을 구현해야 한다.

class Dog extends Animal{
	@Override
	public void run() {
		System.out.println("멍멍");
	}
}

class Cat extends Animal{
	@Override
	public void run() {
		System.out.println("야옹");
	}
}