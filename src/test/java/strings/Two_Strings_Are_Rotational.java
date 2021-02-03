package strings;

public class Two_Strings_Are_Rotational {

	public static void main(String[] args) {
		String str1 = "AACD";
		String str2 = "ACDA";
		System.out.println(str1.length()==str2.length());
		System.out.println((str1+str2).indexOf(str2));
		boolean length = str1.length()==str2.length();
		boolean index = ((str1+str2).indexOf(str2)) !=-1;
		if(length && index) {
			System.out.println("Strings are rotationals of each other");
		}
		else {
			System.out.println("Strings are not rotational of each other");
		}
				
	}

}
