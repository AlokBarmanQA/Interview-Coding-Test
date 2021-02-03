package selenium_Interview;

public class Reverse_String_Preserving_Space_Positions {

	public static void main(String[] args) {
		
        String string = "HELLO USA";
        System.out.println(string);
        int n = string.length();
        char[] str = string.toCharArray();
        int start = 0;
        int end = n-1;
     // Move both pointers toward each other
        while(start<end) {
            // If character at start or end is space, ignore it
        	if(str[start]==' ') {
        		start++;
        		continue;
        	}
        	else if(str[end]==' ') {
        		end--;
        		continue;
        	}
        	else {
        		// If both are not spaces, do swap
        		char temp=str[start];
        		str[start]=str[end];
        		str[end]=temp;
        		start++;
        		end--;
        	}
        }
        System.out.println("Reverse string: "+String.valueOf(str));
	}

}
