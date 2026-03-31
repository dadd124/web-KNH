package ex7_0;

public class Calculator {
	public int getResult(int n1, int n2) {
		return -1;
	}
}

class Calplus extends Calculator {
	
	@Override
	public int getResult(int n1, int n2) {
		return n1 + n2;
	}
	
}

class CalMinus extends Calculator{
	
	@Override
	public int getResult(int n1, int n2) {
		return n1 - n2;
	}
}

class Main{
	public static void main(String[] args) {
		Calculator c1 = new Calplus();
		Calculator c2 = new CalMinus();
		
		System.out.println(c1.getResult(10, 20));
		System.out.println(c2.getResult(30, 15));
		
	}
}