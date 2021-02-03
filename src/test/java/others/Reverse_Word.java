 package others;

public class Reverse_Word {

	public static void main(String[] args) {
		String sentence = "Alok Kumar Barman";
		String[] words = sentence.split(" ");
		// By using StringBuilder
		StringBuilder sb = new StringBuilder();
		 		 
		for (int i=words.length-1; i>=0; i--) 
		{
		    sb.append(words[i]).append(" ");                             //step 3
		} 
		System.out.println( sb.toString() ); 
		System.out.println("******************");
		// Using traditional approach
	    String result="";
	    for(int i=words.length-1; i>=0; i--) {
	        result = result + words[i]+" ";
	    }
	    System.out.println("Result 3:"+result);
	}

}
