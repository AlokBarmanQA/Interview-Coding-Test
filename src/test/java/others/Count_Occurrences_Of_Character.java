package others;
import org.apache.commons.lang3.StringUtils;
public class Count_Occurrences_Of_Character {
	
	public static void main(String args[]) {

		String input = "Today is Monday"; //count number of "a" on this String.


		//Using Apache commons lang StringUtils class
		int number = StringUtils.countMatches(input, "a");
		System.out.println("count of character 'a' on String: 'Today is Monday' using commons StringUtils " + number);

		//counting occurrence of character with loop
		int charCount = 0;
		for(int i =0 ; i<input.length(); i++){
			if(input.charAt(i) == 'a'){
				charCount++;
			}
		}
		System.out.println("count of character 'a' on String: 'Today is Monday' using for loop  " + charCount);

		//a more elegant way of counting occurrence of character in String using for each loop

		charCount = 0; //resetting character count
		for(char ch: input.toCharArray()){
			if(ch == 'a'){
				charCount++;
			}
		}    
		System.out.println("count of character 'a' on String: 'Today is Monday' using for each loop  " + charCount);
	}

}
