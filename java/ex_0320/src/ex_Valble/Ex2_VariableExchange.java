package ex_Valble;

public class Ex2_VariableExchange {
	public static void main(String[] args) {
		int x = 3;
		int y = 5;
		
		System.out.println("x=" + y + "," + "y=" + x);
		
		int temp;
		temp = x;
		x = y;
		y = temp;
		
		System.out.println("x : " + x);
		System.out.println("y : " + y);
		
	}

}
