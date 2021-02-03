package javaCodingPackage;

import java.math.BigDecimal;


public class DecimalTest {
	
	public static void main(String[] args) {
		String number = "6";
		double f = Double.parseDouble(number);
		System.out.println(f);
		System.out.println(String.format("%.3f", f));
		System.out.println(String.format("%.2f", f));
		System.out.println(String.format("%.3f", f).toString());
		System.out.println(String.format("%.3f", new BigDecimal(f)));
		System.out.println(String.format("%.35f", new BigDecimal(f)));
		System.out.println(String.format("%.5f", new BigDecimal(f)));
		System.out.println(String.format("%.4f", Double.parseDouble(number)).toString());
		
	}

	
}
