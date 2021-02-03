package strings;

public class Convert_String_And_Integer {

	public static void main(String[] args) {
		//If you don't have numbers in string literal, calling Integer.parseInt() or 
		//Integer.valueOf() methods throw NumberFormatException.
//		String string = "ABCD";
//		System.out.println(Integer.parseInt(string));
//		System.out.println(Integer.valueOf(string));
		String str = "100";
		int parseNumber = Integer.parseInt(str);
		System.out.println(parseNumber);
		
		int valueOfNumber = Integer.valueOf(str);
		System.out.println(valueOfNumber);
		
		int number = 1000;
		
		String valueOfIntNumber = String.valueOf(number);
		System.out.println(valueOfIntNumber);
		
//		Integer numberToString = new Integer(number);
//		String num = numberToString.toString();
//		System.out.println(num);
		
		String convertNumber = Integer.toString(number);
		System.out.println(convertNumber);
		
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append(1234);
		String numberBuilder = stringBuilder.toString();
		System.out.println(numberBuilder);
		
		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append(2345);
		String numberBuffer = stringBuffer.toString();
		System.out.println(numberBuffer);
	}

}
