package step07_respond03.test;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import step07_respond03.main.Account;

public class AccountTest {
	@Test
	public void testAccount() throws Exception {
		Account account = new Account(10000);
	}

	@Test
	public void testGetBalance() throws Exception {

		Account account = new Account(10000);
		assertEquals(10000, account.getBalance());

		account = new Account(1000);
		assertEquals(1000, account.getBalance());

		account = new Account(0);
		assertEquals(0, account.getBalance());
	}

	@Test
	public void testDeposit() throws Exception {
		Account account = new Account(10000);
		account.deposit(1000);
		assertEquals(11000, account.getBalance());
	}

	@Test
	public void testWithdraw() throws Exception {
		Account account = new Account(10000);
		account.withdraw(1000);
		assertEquals(9000, account.getBalance());
	}
}