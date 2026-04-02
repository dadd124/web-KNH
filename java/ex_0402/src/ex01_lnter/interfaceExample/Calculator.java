package ex01_lnter.interfaceExample;

public class Calculator {

	public static class Result {
		private int value;
	
	public Result(int value) {
			this.value = value;
		}
		
		public int getResult() {
			return value;
		}
		
		public void show() {
			System.out.println("계산 결과 : " + value);
		}
		
	}
	
	public static Result add(int a, int b) {
		return new Result(a + b);
	}
}
