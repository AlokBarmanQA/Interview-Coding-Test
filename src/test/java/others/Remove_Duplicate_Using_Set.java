package others;

import java.util.HashSet;
import java.util.Set;

public class Remove_Duplicate_Using_Set {

	public static void main(String[] args) {
		int[] arr = {0,1,2,2,1,3,3,4,4,5};
		int end = arr.length;
		Set<Integer> set = new HashSet<Integer>();

		for(int i = 0; i < end; i++){
		  set.add(arr[i]);
		}
		System.out.println(set);
		
		// By using Iterator
		
	}

}
