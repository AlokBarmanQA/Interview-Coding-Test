package practice2;

public class Count_Specific_Duplicate_String_Integer_Character {

	public static void main(String[] args) {
		String words[] = {"Java","java","java", "Selenium","selenium","QTP"};
		int wordOccuranceCount = 0;
		for(String word:words) {
			if(word.equalsIgnoreCase("java")) {
				wordOccuranceCount++;
			}
		}
		System.out.println("Java >>>>Occurance--"+wordOccuranceCount);
		System.out.println("*****************************");
		int numbers[] = {10,10,10,20,20,30};
		int integerOccuranceCount = 0;
		for(Integer number:numbers) {
			if(number==10) {
				integerOccuranceCount++;
			}
		}
		System.out.println("10 >>>>>>Occurance--"+integerOccuranceCount);
		System.out.println("*****************************");
		char characters[] = {'a','a','A','b','B','c'};
		int charOccuranceCount = 0;
		for(Character character:characters) {
			if(character=='a'|| character=='A') {
				charOccuranceCount++;
			}
		}
		System.out.println("A >>>> Occurance--"+charOccuranceCount);
	}
}
