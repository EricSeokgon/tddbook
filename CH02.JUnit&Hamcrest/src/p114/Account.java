package p114;

public class Account {
	private int balance;
	
	public Account(int money) {
		if (money < 0) {
			throw new IllegalArgumentException("���������� money�� ����̾�� ��, ����: " + money);
		} else if ( money > 2100000000) {
			throw new IllegalArgumentException("���������� money�� 40�� �̸�, ����: " + money);
		} 
		this.balance = money;
	}

	public void deposit(int money){
		this.balance += money;
	}
	
	public void withdraw(int money){
		this.balance -= money;
	}
	
	public int getBalance(){
		return this.balance;
	}
	
	public double getCompoundInterest( int year, double interest){
		return 0;
	}
	
	public static void main(String[] args) {
		int money = Integer.parseInt(args[0]);
		Account account = new Account(money);
		account.deposit(10000);
		System.out.println( account.getBalance());
	}
}
