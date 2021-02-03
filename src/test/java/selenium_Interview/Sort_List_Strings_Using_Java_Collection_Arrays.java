package selenium_Interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Sort_List_Strings_Using_Java_Collection_Arrays {

	public static void main(String[] args) {

		String[] str = {"January", "February", "March", "April", "May", "Jun", "July",
				"august", "September", "October", "november", "December" };
		for (int i=0; i<str.length; i++) {
			System.out.print(str[i]+" ");
		}
		System.out.println();
		Arrays.sort(str);
		for (int i=0; i<str.length; i++) {
			System.out.print(str[i]+" ");
		}
		System.out.println();
		Arrays.sort(str, String.CASE_INSENSITIVE_ORDER);
		for (int i=0; i<str.length; i++) {
			System.out.print(str[i]+" ");
		}
		System.out.println();
		List<String> arrayList = new ArrayList<String>(Arrays.asList("nrityam","barman","argha"));
		System.out.println(arrayList);
		Collections.sort(arrayList);
		System.out.println(arrayList);
		
	}
}
