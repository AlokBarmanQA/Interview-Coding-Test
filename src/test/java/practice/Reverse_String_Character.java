package practice;

public class Reverse_String_Character {

	public static void main(String[] args) {
		String str = "Alok";
		String reverse = "";
		for(int i=str.length()-1; i>=0; i--) {
			reverse = reverse+str.charAt(i);
		}
		System.out.println(reverse);
	}
}
