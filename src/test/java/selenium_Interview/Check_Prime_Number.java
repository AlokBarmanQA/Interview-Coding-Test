package selenium_Interview;

public class Check_Prime_Number {
	//A number divisible by only 2 (different) numbers; 
	//being 1; and The number itself.

	public static void main(String[] args) {
		System.out.println(isPrime(100));
	}
	
	public static boolean isPrime(int number) {
		if(number<=2) {
			return false;
		}
		for(int i=3; i<=number; i++) {
			if(number%i==0) {
				return false;
			}
		}
		return true;
		
	}
}
