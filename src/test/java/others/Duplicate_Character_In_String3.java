package others;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Duplicate_Character_In_String3 {

	public static void main(String[] args) {
		String test = "This sentence contains two words, one and two";
		if (test==null || test.isEmpty()) {
			System.out.println(Collections.emptySet());
		}
		char[] chr = test.toCharArray();
		System.out.println(Arrays.toString(chr));
		Set<Character> duplicateSet = new HashSet<Character>();
		Set<Character> set = new HashSet<Character>();
		for (Character ch:chr) {
			if(!set.add(ch)) {
				duplicateSet.add(ch);
			}
		}
		System.out.println(duplicateSet);
	}

}
