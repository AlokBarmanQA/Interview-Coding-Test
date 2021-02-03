package selenium_Interview;

public class String_Reverse_Without_StringBuffer_Class {

	public static void main(String[] args) {
		String str = "alok";
		String reverse="";
		char[] ch = str.toCharArray();
		for(int i=str.length()-1; i>=0; i--) {
			reverse = reverse+ch[i];
		}
		System.out.println(reverse);
		
		String name="alok                   kumar barman";
		String[] nameArray = name.split(" ");
		String rev="";
		for(int i=nameArray.length-1; i>=0; i--) {
			rev=rev+nameArray[i]+" ";
		}
		System.out.println(rev);
		String inputName="alok kumar         barman";
		String revers = "";
		char[] chr = inputName.toCharArray();
		for(int i=chr.length-1; i>=0; i--) {
			revers=revers+chr[i];
		}
		System.out.println(revers);
	}

}
