package practice;

public class Reverse_String_Word {

	public static void main(String[] args) {

		String str = "Alok Kumar Barman";
		String words[] = str.split(" ");
		String reverse = "";
		for(int i=words.length-1; i>=0; i--) {
			reverse = reverse+words[i]+" ";
		}
		System.out.println(reverse);
		
		System.out.println("*********************");
		char input_string[] = str.toCharArray();
		String reverse_char = "";
		for(int i=input_string.length-1; i>=0; i--) {
			reverse_char = reverse_char+input_string[i];
		}
		System.out.println(reverse_char);
	}
}
