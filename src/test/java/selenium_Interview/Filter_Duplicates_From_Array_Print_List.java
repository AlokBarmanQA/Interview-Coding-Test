package selenium_Interview;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Filter_Duplicates_From_Array_Print_List {

	public static Set<String> processList(ArrayList<String> listContainsDuplicates) {
		Set<String> resultSet = new HashSet<String>();
		Set<String> tempSet = new HashSet<String>();
		for (String myString : listContainsDuplicates) {	
			if (!tempSet.add(myString)) {
				resultSet.add(myString);
			}
		}
		System.out.println("Temp set: "+tempSet);
		System.out.println("Duplicate set: "+resultSet);
		return resultSet;
	}
	
	public static void main(String[] args) {
		String[] str = {"alok", "kumar","barman","kumar","alok"};
		ArrayList<String> listContainsDuplicates = new ArrayList<String>();
		for (String word : str) {
			listContainsDuplicates.add(word);
		}

		processList(listContainsDuplicates);
	}
}
