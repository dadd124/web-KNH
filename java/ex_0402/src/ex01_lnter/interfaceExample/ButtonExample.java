package ex01_lnter.interfaceExample;

public class ButtonExample {
	public static void main(String[] args) {
		Button btnOk = new Button();
		
		// 내부 인터페이스를 구현하는 클래스
		class OkListener implements Button.ClickListener{

			// 추상메서드 오버라이딩
			@Override
			public void onClick() {
				System.out.println("OK 버튼을 클릭했습니다.");
			}
		}
		
			btnOk.setClickListener(new OkListener());
			
			// ok버튼 클릭하기
			btnOk.click();
			
			// -----------------------
			// Cancle버튼과 기능 만들기
		
		Button btnCancel = new Button();
			
		class CancleListener implements Button.ClickListener{
			@Override
			public void onClick() {
				System.out.println("Cancle 버튼을 클릭했습니다.");
			}
		}
		
		btnCancel.setClickListener(new CancleListener());
		btnCancel.click();
	}
}
