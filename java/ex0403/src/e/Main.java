package e;

import java.util.Iterator;

public class Main {
	public static void main(String[] args) {
		
		Member m = new Member("user1", "홍길동");
		Member m2 = new Member("user2", "동길동");
		Member m3 = new Member("user3", "서길동");
		
		System.out.println(m.equals(m2));
		System.out.println(m.equals(m3));
		System.out.println(m2.equals(m3));
	
		Object[] arr = {"Java", 100, 3.14, new Employee("홍길동", "개발팀")};
		
		//반복문으로 배열을 순회하면서
		//문자열이면 "문자열데이터 : xx"
		//정수면 "정수데이터 : xx"
		//실수면 "실수데이터 : xx"
		//Employee객체면 이름과 부서를 출력해주세요
		
		// instanceof
		for(Object obj : arr){
			
			if(obj instanceof String) {
				System.out.println("문자열데이터 : " + obj);
			} else if (obj instanceof Integer) {
				System.out.println("정수데이터 : " + obj);
			} else if (obj instanceof Double) {
				System.out.println("실수데이터 : " + obj);
			} else if (obj instanceof Employee) {
				Employee e = (Employee) obj;
				System.out.println("이름: " + e.name + ", 부서: " + e.dept);
			}
			
		}
	}
}
