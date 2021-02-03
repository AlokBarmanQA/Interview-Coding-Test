package strings;

public class How_To_Remove_White_Space {
	
	public static void main(String[] args) {
		//The java string trim() method eliminates leading and trailing spaces.
		String str = "    alok     kumar      barman    ";
		String removeSpace = str.trim();
		String strReplaceAll = str.replaceAll(" ", "");
		System.out.println(removeSpace);
		System.out.println(strReplaceAll);
	}
}
