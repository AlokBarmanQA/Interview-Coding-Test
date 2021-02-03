package selenium_Interview;

public class Remove_Duplicate_From_Sorted_Array {

	public static void main(String[] args) {
		int[] arr = {1,2,2,3,3,4,4,5,5};
//		int[] temp = {};
		int index = arr.length;
		int j=0;
		for(int i=0; i<index-1; i++) {
			if(arr[i]!=arr[i+1]) {
				arr[j]=arr[i];
				j++;
			}
		}
		arr[j]=arr[index-1];
		for(Integer num:arr) {
			System.out.print(num+" ");
		}
	}

}
