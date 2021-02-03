package javaCodingPackage;

public class JavaStringLeftRightPaddingExample {
	
	public static void main(String[] args) {
		int number = 7;
		int number2 = 7777;
		String num = "987654321";
		System.out.println(num);
		String padded = String.format("%011d", number);
		System.out.println(padded);
		String padded2 = String.format("%04d", number2);
		System.out.println("Number2==>"+padded2);
		
		String str = String.format("%-7d", 7);
		System.out.println(str);
		
		String fundNumber = "9876543210";
		String fundNumber2 = "8765432100";
		System.out.println(String.format("%0"+ (11 - fundNumber.length() )+"d%s", 0 ,fundNumber));
		System.out.println("===>"+String.format("%0"+ (11 - fundNumber2.length() )+"d%s", 0 ,fundNumber2));
		System.out.println(String.format("%0"+ (11 - "9999999999".length() )+"d%s",0 ,"9999999999").substring(0,11));
		System.out.println(leadingZeros(fundNumber2, 11));
//		System.out.println(Strings.padStart("9999999999", 11, '0'));
//		org.apache.commons.lang.StringUtils.leftPad("Apple", 8, "0");
		
		String str3 = String.format("%8s","Apple");
		str3 = str3.replace(' ','0');
		System.out.println("=====>"+str3);
		
		System.out.println(leadingZeros("987654321", 11));
	}
	
	public static String leadingZeros(String s, int length) {
	     if (s.length() >= length) return s;
	     else return String.format("%0" + (length-s.length()) + "d%s", 0, s);
	}

}
