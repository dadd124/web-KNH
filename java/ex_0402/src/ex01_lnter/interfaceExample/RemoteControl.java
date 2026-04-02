package ex01_lnter.interfaceExample;

public class RemoteControl {

	String power = "Off";
	
	class Button{
		void press() {
			power = "on";
			System.out.println("전원을 켭니다.");
		}
	}
	
	
}
