package ex1_exation.customException;

public class AccountMain {
	public static void main(String[] args) {
		Account account = new Account();
		
		account.deposit(100000);
		System.out.println("예금액 : " + account.getBalance());
		
		// 15만원 출금하기
		
		try {
			account.withdraw(150000);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
