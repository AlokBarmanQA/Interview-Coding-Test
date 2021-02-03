package selenium_Interview;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Filter_Duplicates_From_Array_Print_List_04 {

	public static void main(String[] args) {
		String[] str = {"alok", "kumar", "barman", "kumar"};
		List<String> list = new ArrayList<String>();
		for (String words : str) {
			list.add(words);
		}
		System.out.println(processList(list));
	}
	
	public static Set<String> processList(List<String> listWithDuplicates) {
		Set<String> resultSet = new HashSet<String>();
		Set<String> tempSet = new HashSet<String>();
		for (String word : listWithDuplicates) {
			if (!tempSet.add(word)) {
				resultSet.add(word);
			}
		}
		return resultSet;
	}
}
