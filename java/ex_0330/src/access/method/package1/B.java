package access.method.package1;

// 같은 패키지의 다른 클래스
public class B {
	// 메서드를 호출하기 전까지는 실행이 안 됨.
	public static void main(String[] args) {
		A a = new A();
		
		a.field1 = 1;
		a.field2 = 1;
		// a.field3 = 1; private이라서 안 된다.
		
		a.method1();
		a.method2();
		// a.method3();
	}

}
