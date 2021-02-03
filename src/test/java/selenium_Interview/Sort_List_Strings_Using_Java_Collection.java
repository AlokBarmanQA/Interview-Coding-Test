package selenium_Interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Sort_List_Strings_Using_Java_Collection {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("alok");
		list.add("kumar");
		list.add("barman");
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		
		List<String> arrayList = new ArrayList<String>(Arrays.asList("nrityam","barman","argha"));
		System.out.println(arrayList);
		Collections.sort(arrayList);
		System.out.println(arrayList);
		
	}
}
