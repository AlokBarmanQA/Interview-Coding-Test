package practice;

public class Palindrom_Number {

	public static void main(String[] args) {

		int number = 343;
		int reverse = 0;
		int reminder;
		int originalInteger;
		originalInteger=number;
		System.out.println(originalInteger);
		while(number !=0) {
			reminder = number%10;
			reverse = reverse*10 + reminder;
			number = number/10;
		}
		System.out.println(reverse);
		if(originalInteger==reverse) {
			System.out.println(originalInteger+ " is a pelindrom number");
		}
		else {
			System.out.println(originalInteger+ " is not a pelindrom number");
		}
	}

}
