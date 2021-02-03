package array_List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class Sort_An_ArrayList_String {

	public static void main(String[] args) {
		
		ArrayList<String>list=new ArrayList<String>(Arrays.asList(
				"Volkswagen","Toyota","Porsche","Ferrari","Mercedes-Benz","Audi","Rolls-Royce","BMW"));
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		for(String car:list) {
			System.out.print(car+" ");
		}
		System.out.println();
		Collections.sort(list, Collections.reverseOrder());
		System.out.println(list);
		Iterator<String> itr = list.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}
	}

}
