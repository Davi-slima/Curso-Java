package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product{
	
	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	private Date manufaturingDate;
	
	public UsedProduct() {
		super();
	}

	public UsedProduct(String name, Double price, Date manufaturingDate) {
		super(name, price);
		this.manufaturingDate = manufaturingDate;
	}

	public Date getManufaturingDate() {
		return manufaturingDate;
	}

	public void setManufaturingDate(Date manufaturingDate) {
		this.manufaturingDate = manufaturingDate;
	}

	public static SimpleDateFormat getSdf() {
		return sdf;
	}
	
	@Override
	public String priceTag() {
		return getName()
				+ " (used) "
				+ String.format("%.2f", getPrice())
				+ "(Manufacture date: " 
				+ sdf.format(manufaturingDate)
				+ ")";
	}

}
