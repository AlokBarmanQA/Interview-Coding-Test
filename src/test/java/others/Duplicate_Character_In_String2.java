package others;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Duplicate_Character_In_String2 {

	public static void main(String[] args) {
		String test = "This sentence contains two words, one and two";
		if (test==null || test.isEmpty()) {
			System.out.println(Collections.emptySet());
		}
		String[] words = test.split("\\s+");
		System.out.println(Arrays.toString(words));
		Set<String> duplicateSet = new HashSet<String>();
		Set<String> set = new HashSet<String>();
		for (String word:words) {
			if(!set.add(word)) {
				duplicateSet.add(word);
			}
		}
		System.out.println(duplicateSet);
	}

}
