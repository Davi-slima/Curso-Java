package model.services;

public class PypalService implements OnlinePaymentService {
	
	private static final double payment_free = 0.02;
	private static final double monthly_interest = 0.01;
	
	public double paymentFree(double amount) {
		return amount * payment_free;
	}
	
	public double interest(double amount, int months) {
		return amount * monthly_interest * months;
	}
	
}
