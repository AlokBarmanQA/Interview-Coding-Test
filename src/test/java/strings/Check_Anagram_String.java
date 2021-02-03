package strings;

import java.util.Arrays;

public class Check_Anagram_String {

	public static void main(String[] args) {
		String str1 = "Mother In Law";
		String str2 = "Hitler  Woman";
		String s1 = str1.replace("\\s", "");
		String s2 = str2.replace("\\s", "");
		char[] arrayS1 = s1.toLowerCase().toCharArray();
		char[] arrayS2 = s2.toLowerCase().toCharArray();
		Arrays.sort(arrayS1);
		Arrays.sort(arrayS2);
		if(s1.length() != s2.length()) {
			System.out.println("Not anagram string>>>Characters are not same");
		}
		else if(Arrays.equals(arrayS1, arrayS2)) {
			System.out.println("Anagram string");
		}
		else {
			System.out.println("Not anagram string");
		}
	}

}
