package practice;

public class Palindrom_String {

	public static void main(String[] args) {
		String str = "Madam";
		System.out.println(str);
		char input_string[] = str.toLowerCase().toCharArray();
		String reverse ="";
		for(int i=input_string.length-1; i>=0; i--) {
			reverse = reverse + input_string[i];
		}
		System.out.println(reverse);
		if(str.equalsIgnoreCase(reverse)) {
			System.out.println(str +" is Palindrom number");
		}
		else {
			System.out.println(str +" is not Palindrom number");
		}
	}

}
