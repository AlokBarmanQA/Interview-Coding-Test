package array_List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class Sort_An_ArrayList_Integer {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(1,9,2,8,3,7,4,6,5,-9));
		Collections.sort(list);
		System.out.println("List>>>"+list);
		for(Integer num:list) {
			System.out.print(num+" ");
		}
		System.out.println();
		Collections.sort(list, Collections.reverseOrder());
		System.out.println("List==>"+list);
		Iterator<Integer> itr = list.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}
	}

}
