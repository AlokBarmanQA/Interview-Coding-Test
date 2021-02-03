package fundamentals;

import java.util.ArrayList;
import java.util.Random;

import org.apache.commons.lang3.ArrayUtils;

public class ListToArray {
	public static void main(String[] args) {
	    // A list of size 4 to be converted:
			ArrayList<Integer> list = new ArrayList<>();
			list.add(2);
			list.add(3);
			list.add(4);
			list.add(5);
			
	    // Declaring an array of size 4:
			Integer[] arr = new Integer[4];
			
	    // Passing the declared array as the parameter:
	    list.toArray(arr);
			
	    // Printing all elements of the array:
	    System.out.println("Printing 'arr':");
			for(Integer i: arr)
	      System.out.println(i);

	    // Declaring another array of insufficient size:
	    Integer[] arr2 = new Integer[3];

	    // Passing the array as the parameter:
	    Integer[] arr3 = list.toArray(arr2);

	    // Printing the passed array:
	    System.out.println("\n'arr2' isn't filled because it is small in size:");
	    for(Integer i: arr2)
	      System.out.println(i);
	    
	    // Printing the newly allocated array:
	    System.out.println("\n'arr3' references the newly allocated array:");
	    for(Integer i: arr3)
	      System.out.println(i);
	    
	  //***************************************
	    //Get a random value
	    int[] array = {99,98,97};
	    int anyValue = array[new Random().nextInt(array.length)];
	    System.out.println("Random:::::"+anyValue);
	    
	    //**********************
	    //Insert a Value Between two other Values
	    int[] largerArray = ArrayUtils.insert(2, array, 77);
	    for(Integer i: largerArray)
		      System.out.println(i);
	    
	    //Check if an Array Is Empty
	    boolean isEmpty = array == null || array.length == 0;
		System.out.println(isEmpty);
	    boolean isArrayEmpty = ArrayUtils.isEmpty(array);
	    System.out.println(isArrayEmpty);
		}
}
