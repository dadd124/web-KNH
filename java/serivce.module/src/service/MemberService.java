package service;

import member.Member;

// 실제 기능을 만드는 곳
public class MemberService {

	// 매개변수 자리에 들어올 것은 member가 될 거야
	public void register(Member member) {
		System.out.println("회원 등록을 시작합니다.");
		System.out.println("회원 이름 : " + member.getName());
		System.out.println("회원 나이 : " + member.getAge());
		System.out.println("회원 등록이 완료되었습니다.");
	}
	
	// 성인인지 판단하는 chekAuldt() 메서드 만들기
	// 20살 이상이면 "성인 회우너입니다.
	?? 아니면 "미성년자입니다."
}
