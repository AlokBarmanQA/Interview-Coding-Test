package others;

import java.util.Arrays;

import org.apache.commons.lang3.ArrayUtils;

public class Remove_Duplicate_Without_Set {

	public static void main(String[] args) {
		int[] myArray = {0,1,2,2,1,3,3,4,4,5};
		System.out.println("Array before removing elements ::"+Arrays.toString(myArray));
		System.out.print("Duplicate element: ");
		for(int i=0; i<myArray.length-1; i++) {
	         for (int j=i+1; j<myArray.length; j++) {
	            if(myArray[i] == myArray[j]) {
	            	System.out.print(myArray[j]+" ,");
	            	myArray = ArrayUtils.remove(myArray, j);
	            }
	         }
	      }
		System.out.println();
	    System.out.println("Array after removing elements ::"+Arrays.toString(myArray));	
	}

}
