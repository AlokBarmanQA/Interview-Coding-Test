package selenium_Interview;

public class Identify_A_Number_As_Palindrome_4 {
//https://www.techbeamers.com/java-coding-questions-software-testers/
	public static void main(String args[]) { 
		int num = 213;
		String original = String.valueOf(num);
		
		String reverse = ""; // Objects of String class
		
		int length = original.length();
		
		for ( int i = length - 1; i >= 0; i-- )  
			reverse = reverse + original.charAt(i); 
		
		if (original.equals(reverse))  
			System.out.println("Entered string/number is a palindrome.");  
		else  
			System.out.println("Entered string/number isn't a palindrome.");   
	}  

}
