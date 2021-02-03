package array_List;

import java.util.Arrays;
import java.util.Collections;

public class Sort_An_Array_String {

	public static void main(String[] args) {
		String strArray[] = {"Mango","Apple","Grapes","Papaya","Pineapple","Banana","Orange"};
		Arrays.sort(strArray);
		for(int i=0; i<strArray.length; i++) {
			System.out.print(strArray[i]+" ");
		}
		System.out.println();
		Arrays.sort(strArray, Collections.reverseOrder());
		for(int i=0; i<strArray.length; i++) {
			System.out.print(strArray[i]+" ");
		}
	}

}
