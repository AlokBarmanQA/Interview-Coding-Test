package javaCodingPackage;

public class addLeadingZeroForTradeDate {

	public static void main(String[] args) {

		String number = "   ";
		String numberAsString = addZeroBeforeNumber(number);
		System.out.println(numberAsString);
		System.out.println("END");
	}

	public static String addZeroBeforeNumber(String givenNumber) {
		int numberLength = 6;
		int numberOfDigits = givenNumber.length();
		int numberOfLeadingZeroes = numberLength - numberOfDigits;
		StringBuilder sb = new StringBuilder();
		if (!givenNumber.isEmpty() && numberOfLeadingZeroes > 0) {
			for (int i = 0; i < numberOfLeadingZeroes; i++) {
				sb.append("0");
			}
			sb.append(givenNumber);
			return sb.toString();
		}
		else if(givenNumber.isEmpty()){
			givenNumber.trim();
		}
		return givenNumber;
	}
}
