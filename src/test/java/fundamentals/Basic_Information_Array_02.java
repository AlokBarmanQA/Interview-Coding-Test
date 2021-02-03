package fundamentals;

import java.util.ArrayList;
import java.util.Arrays;

public class Basic_Information_Array_02 {

	public static void main(String[] args) {

		//Add a new item to an Array
		int[] intArr = {1,2,3,4,5,6,7,8,9};
		int[] newArray = Arrays.copyOf(intArr, intArr.length+10);
		System.out.println(newArray.length);
		// create an array
		String[] dogs = {"Pitbull", "Poodle", "Lab", "Pug"};
		for (String str:dogs) {
			System.out.println(str);
		}
		String[] newElementArray = Arrays.copyOf(dogs, dogs.length+1);
		newElementArray[4]="abc";
		for (String str:newElementArray) {
			System.out.println(str);
		}
		//****************************************
		//Covert a list to an array
		// A list of size 4 which is to be converted:
		ArrayList<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		//ArrayList converted to Object[] array:
		Object[] objArr = list.toArray();
		for(Object obj: objArr){
			// Using casting before performing addition:
			System.out.println((Integer)obj + 1);
		}
		//**************************************
		
	}

}
