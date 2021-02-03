package selenium_Interview;

public class String_Reverse_With_StringBuffer_Class {

	public static void main(String[] args) {
		String str = "abcd";
		StringBuffer stringBuffer = new StringBuffer(str);
		StringBuffer string = stringBuffer.reverse();
		System.out.println(string);
		
		StringBuilder stringBuilder = new StringBuilder(str);
		String result = stringBuilder.reverse().toString();
		System.out.println(result);
	}

}
