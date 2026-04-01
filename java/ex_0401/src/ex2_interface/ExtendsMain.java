package ex2_interface;

public class ExtendsMain {
	public static void main(String[] args) {
		interfacelmpl impl = new interfacelmpl();
		// 인터페이스의 타입 변환
		// 인터페이스와 구현클래스 사이에서 발생
		// 자동 타입변환
		// 구현 객체를 인터페이스 타입변수에 대딥할 때
		
		// 강제 타입변환		
		interfaceA ia = impl;
		ia.methodA();
		// ia.methodB();
		// ia.methodC();
		
		interfaceB ib = impl;
		// ib.methodA();
		ib.methodB();
		// ib.methodC();
		
		// 다른 인터페이스를 상속 받았기 때문에 세개의 메서드 전부 가능
		interfaceC ic = impl;
		ic.methodA();
		ic.methodB();
		ic.methodC();
		
		System.out.println();
		
	}
}
