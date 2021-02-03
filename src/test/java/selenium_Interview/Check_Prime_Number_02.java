package selenium_Interview;

public class Check_Prime_Number_02 {
	//A number divisible by only 2 (different) numbers; 
	//being 1; and The number itself.

	public static void main(String[] args) {
        int num = 100;
        boolean isPrime = true;
 
        for (int i=2; i <= num/2; i++)
        {
            if ( num % i == 0)
            {
                isPrime = false;
                break;
            }
        }
 
        if ( isPrime == true )
            System.out.println(num + " is a prime number");
        else
            System.out.println(num + " is not a prime number");
	}
}
