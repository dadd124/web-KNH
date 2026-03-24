package ex1_datatype;

public class StringExample {
	public static void main(String[] args) {
		// char c1 = "홍길동";
		String s1 = "홍길동";
		System.out.println(s1);
		
		System.out.println("홍길동");
		
		// 원래는 주소값을 돌려주는 게 맞다
		// 하지만 문자열은 자주 쓰다 보니 주소에 들어있는 값을
		// 반환하도록 설정 되어 있다.
		
		
		// 데이터를 변수에 넣어서 사용하는 이유
		// 데이터를 저장해 두고, 재상용하기 위함
		System.out.println(s1);
		
		// 이스케이프 문자
		// 문자열 안에서 특수한 기능을 수행하기 위한 문자
		System.out.println("안녕하세요 \"홍길동\"입니다.");
		
		
		// \(백슬래시)가 붙으면 "이 문자는 특별한 의몰 처리해라"
		// \n : 줄바꿈
		// \\ : 백슬래시 추력
		System.out.println("hello\nworld");
		
		// java14부터는 텍스트 블록 문법을 제공한다.
		// println 을 쓰거나 \n을 쓸 필요 없이
		// 작성된 그대로 문자열을 저장한다.
		String str = """
				영역 사이에 작성 """;
		
		System.out.println(str );
				
		
	}
}
