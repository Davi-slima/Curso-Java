package entities;

public class BusinessAccount extends Account {


	private Double loanLimit;
	
	public BusinessAccount() {
		super();
	}

	public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) { // Construtor com os 4 argumentos da classe ACCOUNT
		super(number, holder, balance); // SUPER é utilizado para pegar os parametros da classe base ---> CLASSE ACCOUNT
		this.loanLimit = loanLimit;
	}

	public Double getLoanLimit() {
		return loanLimit;
	}

	public void setLoanLimit(Double loanLimit) {
		this.loanLimit = loanLimit;
	}
	
	public void loan(double amount) {
		if (amount <= loanLimit) {
			balance += amount - 10.0;
		}
	}

}
