package entities;

public abstract class TaxPayer {
	
	private String name;
	private Double anualIncome;
	
	public TaxPayer() {
	}

	public TaxPayer(String name, Double anualIncome) {
		this.name = name;
		this.anualIncome = anualIncome;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getAnualIncome() {
		return anualIncome;
	}

	public void setAnualIncome(Double anualIncome) {
		this.anualIncome = anualIncome;
	}
	
	public abstract double Tax(); /* N�O FOI APENAS CRIADO UM M�TODO COM OS ARGUMENTOS E AS REGRAS DE IMPOSTO, PORQUE 
	// POR ESTE EXATO MOTIVO	     CADA UMA DAS MINHAS CLASSES ESPEC�FICAS ( INDIVIDUAL E COMPANY ) T�M A SUA PR�PRIA
	// EU CRIEI UM M�TODO ABSTRATO	 REGRA DE IMPOSTO. OU SEJA, AS REGRAS N�O SE APLICAM IGUALMENTE PARA AS DUAS CLASSES! */
	
}
