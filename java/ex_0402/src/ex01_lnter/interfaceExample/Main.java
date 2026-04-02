package ex01_lnter.interfaceExample;

public class Main {
	public static void main(String[] args) {
		RemoteControl rc = new RemoteControl();
		RemoteControl.Button button = rc.new Button();
		
		button.press();
		System.out.println("현재 전원 상태 : " + rc.power);
		
		Calculator result = new Calculator();
		 Calculator.Result result2 = Calculator.add(5, 7);
		
		 result2.show();
	}
}
