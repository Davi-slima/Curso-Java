package entities;

public class SavingsAccount extends Account {
	
	private Double interestRate;

	public SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
		super(number, holder, balance);
		this.interestRate = interestRate;
	}

	public SavingsAccount(Double interestRate) {
		super();
		this.interestRate = interestRate;
	}

	public Double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}
	
	public void updateBalance() {
		balance += balance * interestRate; // Atualiza��o do saldo com essa taxa de juros
	}
	
	@Override // Nesta linha, o OVERRIDE est� informando que meu withdraw na linha de baixo � uma SOBREPOSI��O!!!
	public final void withdraw(double amount) {  // Saque sem o desconto de 5.0!
		balance -= amount;                       // O M�TODO FINAL FAZ COM QUE A MINHA CLASSE WITHDRAW N�O SEJA SOBREPOSTA EM UMA SUBCLASSE
	}
	
	@Override
	public String toString() {
		return "UPDATE!\n" 
				+ "holder:" + this.getHolder() + ",\n"
				+ "balance:" + this.getBalance() + ",\n"
				+ "currency:BRL" + ",\n"
				+ "id:" + this.getNumber();
	}
}
