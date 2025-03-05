package ch11.sec06;

public class AccountExample {
	public static void main(String[] args) {
		Account account = new Account();
		//예금하기
		account.deposit(10000);
		System.out.println("예금액: " + account.getBalance());

		//출금하기
		try {
			account.withdraw(30000);
		} catch(InsufficientException e) {
			String message = e.getMessage();
//			String message = e.toString(); // toString으로 하면 예외에 대한 내용을 추가해준다.
			System.out.println(message);
		}
	}
}