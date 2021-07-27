package model.services;

public interface OnlinePaymentService {
	
	public double paymentFree(double amount);
	public double interest(double amount, int month);

}
