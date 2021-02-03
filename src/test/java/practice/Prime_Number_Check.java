package practice;

public class Prime_Number_Check {

	public static void main(String[] args) {
		
		int num = 7;
		boolean isPrime = true;
		
		for(int i=2; i<=num/2; i++) {
			if(num%i == 0) {
				isPrime=false;
			}
		}
		if(isPrime == true) {
			System.out.println(num+" Prime number");
		}
		else {
			System.out.println(num+" not Prime number");
		}
	}

}
