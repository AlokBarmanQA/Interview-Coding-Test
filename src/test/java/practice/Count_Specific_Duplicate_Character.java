package practice;

public class Count_Specific_Duplicate_Character {

	public static void main(String[] args) {
		String str = "aabbccddeeffgg";
		char chracter[] = str.toLowerCase().toCharArray();
		int count = 0;
		for(char ch:chracter) {
			if(ch=='a') {
				count++;
			}
		}
		System.out.println(count);
	}

}
