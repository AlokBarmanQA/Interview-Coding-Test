package javaCodingPackage;

import java.math.BigDecimal;

public class addDecimalNumber {


	public static void main(String[] args) {
		String number = "8";
		double f = Double.parseDouble(number);
		System.out.println(f);
		System.out.println(String.format("%.3f", f));
		System.out.println(String.format("%.2f", f));
		System.out.println(String.format("%.3f", f).toString());
		System.out.println(String.format("%.3f", new BigDecimal(f)));
		System.out.println(String.format("%.35f", new BigDecimal(f)));
		System.out.println(String.format("%.5f", new BigDecimal(f)));
		System.out.println(String.format("%.4f", Double.parseDouble(number)).toString());

		System.out.println(amountOrShareFormat("27", 2));
		System.out.println(amountOrShareFormat("", 2));
		System.out.println(amountFormat(""));
		System.out.println(shareFormat(""));
		System.out.println(amountFormat("88.8"));
		System.out.println(shareFormat(" "));
		System.out.println(shareBlankFormat("11"));
	}

	public static String amountOrShareFormat(String amountOrShares, int decimalNumber) {
		String amountShare=null;
		if(amountOrShares.isEmpty()) {
			StringBuilder sb = new StringBuilder();
			sb.append(".00");
			String zeroValue = sb.append(amountOrShares).toString();
			double doubleAmount = Double.parseDouble(zeroValue);
			amountShare = String.format("%."+decimalNumber+"f", doubleAmount);
			return amountShare;
		}
		double doubleAmount = Double.parseDouble(amountOrShares);
		amountShare = String.format("%."+decimalNumber+"f", doubleAmount);
		return amountShare;
	}
	
	public static String amountFormat(String amount) {
		
		if(amount.isEmpty()) {
			StringBuilder sb = new StringBuilder();
			sb.append(".00");
			return sb.toString();
		}
		else {
		double doubleAmount = Double.parseDouble(amount);
		String formattedAmount = String.format("%.2f", doubleAmount);
		return formattedAmount;
		}
	}
	public static String shareFormat(String shares) {
		if(shares.isEmpty()) {
			StringBuilder sb = new StringBuilder();
			sb.append(".000");
			return sb.toString();
		}
		double doubleAmount = Double.parseDouble(shares);
		String formattedShare = String.format("%.3f", doubleAmount);
		return formattedShare;

	}
	public static String shareBlankFormat(String shares) {
		if(shares.isEmpty()) {
			double doubleAmountOrShares = Double.parseDouble(shares);
			String amountShares = String.format("%.2f", doubleAmountOrShares);
			return amountShares;
		}
		double doubleAmount = Double.parseDouble(shares);
		String formattedShare = String.format("%.3f", doubleAmount);
		return formattedShare;

	}
}
