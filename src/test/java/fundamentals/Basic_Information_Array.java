package fundamentals;

public class Basic_Information_Array {

	public static void main(String[] args) {
		//declare an array
		int[] a = {};
		System.out.println(a.length);
		int[] intArray = new int[2];
		intArray[0]=1;
		intArray[1]=2;
		System.out.println(intArray[1]);
		String[] str = new String[5];
		str[0]="cat";
		str[1]="dog";
		System.out.println(str[0]);
		//*****Declare and initialize an array********* 
		int[] intArr = {1,2,3,4,5,6,7,8,9};
		// access first element
		System.out.println("First Element: " + intArr[0]);
		// loop through the array with for Loop
		System.out.println("Using for Loop:");
		for (int i=0; i<intArr.length; i++) {
			System.out.println(intArr[i]);
		}
		// create an array
		String[] dogs = {"Pitbull", "Poodle", "Lab", "Pug"};
		// access first element 
		System.out.println("First Element: " + dogs[0]);
		// loop through the array with for Loop
		System.out.println("Using for Loop:");
		for (int i=0; i<dogs.length; i++) {
			System.out.println(dogs[i]);
		}
		int[] intArrDeclare = new int[] {0,1,2,3,4};
		System.out.println("First element: "+intArrDeclare[0]);
		System.out.println("Last element: "+intArrDeclare[intArrDeclare.length-1]);
		for (int i : intArrDeclare) {
			System.out.println("All elements: "+intArrDeclare[i] );
		}
		String[] strArrDeclare = new String[] {"alok","kumar","barman"};
		for (int i=0; i<strArrDeclare.length; i++) {
			System.out.println("All string: "+strArrDeclare[i]);
		}
	}

}
