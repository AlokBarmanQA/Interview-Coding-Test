package strings;

public class Prove_String_Immutable {

	public static void main(String[] args) {
		String str1 = "java";
		String str2 = "java";
		System.out.println("Befere Modification in str1");
		referenceCheck(str1, str2);
		str1 = str1+"java";
		System.out.println(str1);
		System.out.println("After modification");
		referenceCheck(str1, str2);
	}
	
	public static void referenceCheck(Object x, Object y) {
		if(x==y) {
			System.out.println("Both pointing to the same reference");
		}
		else {
			System.out.println("Both pointing to the different reference");
		}
	}

}
