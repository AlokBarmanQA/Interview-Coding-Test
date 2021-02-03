package selenium_Interview;

public class Identify_A_Number_As_Palindrome_02 {

	public static void main(String[] args) {
		int n=454;//It is the number variable to be checked for palindrome
		int r;
		int sum=0;
		int temp;    
		temp=n;    
		while(n>0){    
			r=n%10;  //getting remainder  
			sum=(sum*10)+r;    
			n=n/10;    
		}    
		if(temp==sum)    
			System.out.println("palindrome number ");    
		else    
			System.out.println("not palindrome"); 
	}

}
