package practice2;

public class Count_Specific_Duplicate_Character {

	public static void main(String[] args) {
		String str = "Alok Kumar Barman";
		char input[] = str.toLowerCase().toCharArray();
		int len = input.length;
		int count=0;
		for(int i=0; i<len; i++) {
			if(input[i]=='a') {
				count++;
			}
		}
		System.out.println(count);
	}

}
