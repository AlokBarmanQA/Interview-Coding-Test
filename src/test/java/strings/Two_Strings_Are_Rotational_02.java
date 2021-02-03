package strings;

public class Two_Strings_Are_Rotational_02 {

	public static void main(String[] args) {
//		String str1 = "avajava";
//		String str2 = "javaava";
		String str1 = "ava";
		String str2 = "java";
		String str3 = str1+str1;
		if(str1.length() != str2.length()) {
			System.out.println("Not rotational");
		}
		else if(str3.contains(str2)) {
			System.out.println("Both are rotational");
		}
		else {
			System.out.println("Not rotational");
		}
	}

}
