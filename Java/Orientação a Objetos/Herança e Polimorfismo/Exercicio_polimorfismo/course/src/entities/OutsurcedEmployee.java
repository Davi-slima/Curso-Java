package entities;

public class OutsurcedEmployee extends Employee {

	private Double additionalCharge;

	public OutsurcedEmployee() {
		super();
	}
	
	public OutsurcedEmployee(String name, Integer hours, double valuePerHour, Double additionalCharge) {
		super(name, hours, valuePerHour);
		this.additionalCharge = additionalCharge;
	}

	public Double getAdditionalCharge() {
		return additionalCharge;
	}

	public void setAdditionalCharge(Double additionalCharge) {
		this.additionalCharge = additionalCharge;
	}
	
	@Override
	public double payment() {
		return super.payment() + additionalCharge * 1.1;
	}
}
