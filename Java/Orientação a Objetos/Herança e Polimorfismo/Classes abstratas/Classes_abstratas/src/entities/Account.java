package entities;

public abstract class Account {  /* O ABSTRACT NESTA CLASSE ( ACCOUNT ) ESTÁ ME MOSTRANDO QUE A MINHA CLASSE ACCOUNT 
								 	NÃO PODE SER INSTÂNCIADA NA PARTE PRINCIPAL DO MEU PROGRAMA */
	private Integer number;
	private String holder;
	protected Double balance;
	
	public Account() {
	}

	public Account(Integer number, String holder, Double balance) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {   // A operação setBalance foi removida, porque não se pode alterar o saldo da conta livremente
		return balance;
	}

	public void withdraw(double amount) {
		balance -= amount + 5.0;
	}
	
	public void deposit(double amount) {
		balance += amount;
	}
}


