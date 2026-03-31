package ex3_time;

public class TimesTable {
	
	
	public void showTalbe(int dan) {
		for(int i = 1; i < 10; i++) {
				System.out.printf("%d * %d = %d\n" , dan, i, (i * dan));
		}
	}

}
