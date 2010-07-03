package step01_respond01.test;

import step01_respond01.main.Account;

public class AccountTest {
	public void testAccount() throws Exception {
		Account account = new Account();
		if (account == null) {
			throw new Exception("계좌생성 실패");
		}
	}

	public static void main(String[] args) {
		AccountTest test = new AccountTest();
		try {
			test.testAccount(); // 테스트 케이스 실행
		} catch (Exception e) {
			System.out.println("실패(X)"); // 예외가 발생하면 실패(X)
			return;
		}
		System.out.println("성공(O)");
	}
}