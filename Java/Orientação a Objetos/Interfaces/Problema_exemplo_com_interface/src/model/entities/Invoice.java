package model.entities;

public class Invoice {
	
	private Double basicPaymentDouble;
	private Double tax;
	
	public Invoice() {
	}

	public Invoice(Double basicPaymentDouble, Double tax) {
		this.basicPaymentDouble = basicPaymentDouble;
		this.tax = tax;
	}

	public Double getBasicPaymentDouble() {
		return basicPaymentDouble;
	}

	public void setBasicPaymentDouble(Double basicPaymentDouble) {
		this.basicPaymentDouble = basicPaymentDouble;
	}

	public Double getTax() {
		return tax;
	}

	public void setTax(Double tax) {
		this.tax = tax;
	}
	
	public Double getTotalPayment() {
		return getBasicPaymentDouble() + getTax();
	}

}
