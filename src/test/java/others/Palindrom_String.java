package others;

public class Palindrom_String {
	/** 
	 * Java program to show you how to check if a String is palindrome or not. 
	 * An String is said to be palindrome if it is equal to itself after reversing. 
	 * if a string is a palindrome in java using recursion 
	 * and for loop both. 
	 **/

	public static void main(String[] args) {
		String originalWord = "Madam";
		char[] character = originalWord.toCharArray();
		String reverse = "";
		for (int i=character.length-1; i>=0; i--) {
			reverse = reverse + character[i];
		}
		System.out.println(reverse);
		if (originalWord.equalsIgnoreCase(reverse)) {
			System.out.println("Given word is a Palindrom");
		}
		else {
			System.out.println("Given word is not a Palindrom");
		}
	}
}
