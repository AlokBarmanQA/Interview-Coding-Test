package array_List;

public class Sort_An_Array_For_Loop {

	public static void main(String[] args) {
		//Ascending order
		int[] primitive_numbers = {10,9,11,8,12,7,13,6,14,-15};
		int temp=0;
		for(int i=0; i<primitive_numbers.length; i++) {
			for(int j=i+1; j<primitive_numbers.length; j++) {
				if(primitive_numbers[i]>primitive_numbers[j]) {
					temp = primitive_numbers[i];
					primitive_numbers[i]=primitive_numbers[j];
					primitive_numbers[j]=temp;
				}
			}
			System.out.print(primitive_numbers[i]+" ");
		}
		System.out.println();
		//Descending
		int temporary=0;
		for(int i=0; i<primitive_numbers.length; i++) {
			for(int j=i+1; j<primitive_numbers.length; j++) {
				if(primitive_numbers[i]<primitive_numbers[j]) {
					temporary = primitive_numbers[i];
					primitive_numbers[i]=primitive_numbers[j];
					primitive_numbers[j]=temporary;
				}
			}
			System.out.print(primitive_numbers[i]+" ");
		}
	}

}
