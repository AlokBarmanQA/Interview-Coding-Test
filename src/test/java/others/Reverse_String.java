package others;

public class Reverse_String {

	public static void main(String[] args) {
		String word = "Alok Kumar Barman";
		// By using StringBuilder
		StringBuilder sb = new StringBuilder(word);
		sb = sb.reverse();
		String reverseString = sb.toString();
		System.out.println("Result 1:"+reverseString);
		System.out.println("******************");
		// Using StringBuffer class
	    StringBuffer buffer = new StringBuffer(word);
	    System.out.println("Result 2:"+buffer.reverse().toString());  
		System.out.println("******************");
		// Using traditional approach
	    String result="";
	    for(int i=word.length()-1; i>=0; i--) {
	        result = result + word.charAt(i);
	    }
	    System.out.println("Result 3:"+result);
	    System.out.println("--------------------");
		// By using Character array
		char[] chr = word.toCharArray();
		int length = chr.length;
		String reverse = "";
		for (int i=length-1; i>=0; i--) {
			reverse = reverse + chr[i];
		}
		System.out.println("Result 4:"+reverse);
		System.out.println("--------------------------");
	    String text = "abcdefghijklmnopqrstuvwxyz";

	    for (int i = (text.length() - 1); i >= 0; i--) {
	        System.out.print(text.charAt(i));
	    }
	}
}
