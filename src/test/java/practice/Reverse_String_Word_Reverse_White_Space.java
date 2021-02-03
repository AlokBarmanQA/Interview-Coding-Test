package practice;

public class Reverse_String_Word_Reverse_White_Space {

	public static void main(String[] args) {

		String str = "Alok Kumar Barman";
		System.out.println(str);
		char character[] = str.toCharArray();
		int len = character.length;
		int start = 0;
		int end = len-1;
		while(start<end) {
			if(character[start]==' ') {
				start++;
			}
			else if(character[end]==' ') {
				end--;
			}
			else {
				char temp=character[start];
				character[start]=character[end];
				character[end]=temp;
				start++;
				end--;
			}
		}
		System.out.println(String.valueOf(character));
	}
}
