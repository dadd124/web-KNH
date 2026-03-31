package access.method.package2;

import access.method.package1.A;
// import ex_access.method.package1;;

// 다른 패키지의 다른 클래스
public class C {
	//C의 객체를 만들 때 같이 실행이 되는 효과
	public C() {
		
		A a = new A();
		
		a.field1 = 1;
		a.field1 = 1;
		a.field1 = 1;
		
		a.method1();
//		a.method2();
	//	a.method3();
		
	}

}
