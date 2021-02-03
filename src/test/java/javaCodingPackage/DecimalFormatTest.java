package javaCodingPackage;
public class DecimalFormatTest {

	public static void main(String[] args) {

		System.out.println(amountOrShareFormat("6.00", 2));
	}

	public static String amountOrShareFormat(String amount, int decimalNumber) {
		double doubleAmountOrShares = Double.parseDouble(amount);
		String amountShares = String.format("%."+decimalNumber+"f", doubleAmountOrShares);
		return amountShares;
		
	}
}
