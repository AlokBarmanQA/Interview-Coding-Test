package fundamentals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Basic_Information_ArrayList {

	public static void main(String[] args) {
/*
 *public class ArrayList<E>extends AbstractList<E>
 *		implements List<E>,RandomAccess, Cloneable, Serializable
 */
		// declare arrayList
		ArrayList<String> arrayList=new ArrayList<String>(Arrays.asList("One","Two","Three"));
		System.out.println(arrayList);
		ArrayList<Integer> arraylist = new ArrayList<>(3);
		arraylist.add(1);
		arraylist.add(2);
		arraylist.add(3);
		System.out.println(arraylist);
//		ArrayList<data_type> list_name = new ArrayList<> (Collection c);
		ArrayList<Integer> intList = new ArrayList<Integer>(Arrays.asList(10,20,30,40,50));
		System.out.println(intList);
        System.out.println("Contents of ArrayList using for-loop:");
        //use for loop to traverse through its elements and print it
        for(int i=0;i<intList.size();i++){
               System.out.print(intList.get(i) + " ");
        }
        System.out.println();
		ArrayList<Integer> ArrayList = new ArrayList<>(intList);
		System.out.println(ArrayList);
	       System.out.println("Contents of ArrayList using for-each loop:");
	    //use for-each loop to traverse through its elements and print it
	       for (Integer num : ArrayList) {
	    	   System.out.print(num+" ");
	       }
	    System.out.println();
	    //Traverse through the ArrayList using iterator
	    Iterator<Integer> itr = ArrayList.iterator();
	    while (itr.hasNext()) {
	    	System.out.print(itr.next()+" ");
	    }
	}
}
