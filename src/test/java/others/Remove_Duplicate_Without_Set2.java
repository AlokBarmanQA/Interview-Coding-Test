package others;

import java.util.Arrays;

public class Remove_Duplicate_Without_Set2 {

	public static void main(String[] args) {
		int[] myArray = {0,1,2,2,1,3,3,4,4,5};
		int arrayLength = myArray.length;
		System.out.println(Arrays.toString(myArray));

		for (int i=0; i<arrayLength-1; i++) {
			for(int j=i+1; j<arrayLength; j++) {
				if (myArray[i]==myArray[j]) {
					myArray[j]=myArray[arrayLength-1];
					arrayLength--;
				}
			}
		}
		for (int l=0; l<arrayLength; l++) {
			System.out.print(myArray[l]+ " ");
		}
	}
}
