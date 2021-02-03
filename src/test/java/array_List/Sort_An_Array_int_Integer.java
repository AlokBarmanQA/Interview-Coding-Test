package array_List;

import java.util.Arrays;
import java.util.Collections;

public class Sort_An_Array_int_Integer {

	public static void main(String[] args) {
		
		int[] primitive_numbers = {10,9,11,8,12,7,13,6,14,15};
		Arrays.sort(primitive_numbers);
		for(int i=0; i<primitive_numbers.length; i++) {
			System.out.print(primitive_numbers[i]+" ");
		}
		System.out.println();
			
		Integer numbers[] = {10,9,11,8,12,7,13,6,14,15};
		Arrays.sort(numbers, Collections.reverseOrder());
		for(int i=0; i<numbers.length; i++) {
			System.out.print(numbers[i]+" ");
		}	
	}
}
