package step03_ask02.test;

import static org.junit.Assert.fail;
import org.junit.Test;

import step03_ask02.main.Account;

public class AccountTest {
	@Test
	public void testAccount() throws Exception {
		Account account = new Account();
	}

	@Test
	public void testGetBalance() throws Exception {
		Account account = new Account(10000);
		if (account.getBalance() != 10000) {
			fail();
		}
		account = new Account(1000);
		if (account.getBalance() != 1000) {
			fail();
		}
		account = new Account(0);
		if (account.getBalance() != 0) {
			fail();
		}
	}
}