package practice2;

public class Reverse_String {

	public static void main(String[] args) {
		String str = "Alok Kumar Barman";
		char input[] = str.toCharArray();
		int len = input.length;
		String reverse = "";
		for(int i=len-1; i>=0; i--) {
			reverse=reverse+input[i];
		}
		System.out.println(reverse);
		
		String rev = "";
		for(int i=str.length()-1; i>=0; i--) {
			rev = rev + str.charAt(i);
		}
		System.out.println(rev);
		
		String words[] = str.split(" ");
		int length = words.length;
		String reverse2 = "";
		for(int i=length-1; i>=0; i--) {
			reverse2 = reverse2 + words[i]+" ";
		}
		System.out.println(reverse2);
	}
}
