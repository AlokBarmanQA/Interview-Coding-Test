package practice;

public class PracticeTest {
    public static void main(String[] args) {

        int i;
        int maxCheck = 100; // maxCheck limit till which you want to find prime numbers
        boolean isPrime = true;

        //Empty String
        String primeNumbersFound = "";

        //Start loop 1 to maxCheck
        for (i = 1; i <= maxCheck; i++) {
            isPrime = CheckPrime(i);
            if (isPrime) {
                primeNumbersFound = primeNumbersFound + i + " ";
            }
        }
        System.out.println("Prime numbers from 1 to " + maxCheck + " are:");
        // Print prime numbers from 1 to maxCheck
        System.out.println(primeNumbersFound);
    }
    public static boolean CheckPrime(int numberToCheck) {
        int remainder;
        for (int j = 2; j <= numberToCheck / 2; j++) {
            remainder = numberToCheck % j;
            //if remainder is 0 than numberToCheckber is not prime and break loop. Elese continue loop
            if (remainder == 0) {
                return false;
            }
        }
        return true;

    }
}
