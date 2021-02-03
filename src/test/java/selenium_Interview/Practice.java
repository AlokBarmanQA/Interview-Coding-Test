package selenium_Interview;

public class Practice {

	public static void main(String[] args) {
		/**Why string objects are immutable in java?
			Because java uses the concept of string literal.Suppose there are 5 reference 
			variables,all referes to one object "sachin".If one reference variable changes 
			the value of the object, it will be affected to all the reference variables. 
			That is why string objects are immutable in java.
		 **/
		String str = "alok";
		str = "barman";
		System.out.println(str);

//		String s="Sachin";
//		s.concat(" Tendulkar");//concat() method appends the string at the end
//		System.out.println(s);//will print Sachin because strings are immutable objects

		String s="Sachin";  
		s=s.concat(" Tendulkar");  
		System.out.println(s);  
	}
}
