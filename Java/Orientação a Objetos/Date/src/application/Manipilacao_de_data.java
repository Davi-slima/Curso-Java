package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class Manipilacao_de_data {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Date d = Date.from(Instant.parse("2021-02-20T16:08:35Z"));
		System.out.println(sdf.format(d));
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(d);
//		cal.add(cal.HOUR_OF_DAY, 4);
//		d = cal.getTime();
		
		int minutes = cal.get(Calendar.MINUTE);
		int month = 1 + cal.get(Calendar.MONTH);
		
		System.out.println("Minutes: " + minutes);
		System.out.println("Month: " + month);
		
		System.out.println("-----------------------------------------------------------");
		
		cal.add(Calendar.DATE, -15); // Imprime 15 dias no passado a partir da data atual
		System.out.println("15 dias atr?s: " + cal.getTime());
		
		cal.add(Calendar.MONTH, 4);// Imprime 4 meses no futuro a partir da data atual
		System.out.println("4 meses depois: " + cal.getTime());
		
		cal.add(Calendar.YEAR, 2); // Imprime 2 anos no futuro a partir da data atual
		System.out.println("2 anos depois: " + cal.getTime());
		

	}

}
