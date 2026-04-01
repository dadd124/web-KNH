package ex3_interface;

public class HankookTire extends Tire{
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		System.out.println("한국 타이어가 굴러갑니다.");
	}

}
