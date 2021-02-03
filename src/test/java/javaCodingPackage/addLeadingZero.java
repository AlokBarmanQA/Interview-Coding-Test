package javaCodingPackage;

public class addLeadingZero {

	public static void main(String[] args) {

		String number = "1965";
		String numberAsString = addZeroBeforeNumber(number, 4);
		System.out.println(numberAsString);
	}

	public static String addZeroBeforeNumber(String givenNumber, int numberLength) {
		int numberOfDigits = givenNumber.length();
		int numberOfLeadingZeroes = numberLength - numberOfDigits;
		StringBuilder sb = new StringBuilder();
		if (numberOfLeadingZeroes > 0) {
			for (int i = 0; i < numberOfLeadingZeroes; i++) {
				sb.append("0");
			}
		}
		sb.append(givenNumber);
		return sb.toString();
	}
}
