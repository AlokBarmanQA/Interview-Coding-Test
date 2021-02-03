package practice;

import java.util.HashSet;

public class Print_Duplicates_In_A_List {

	public static void main(String[] args) {
		String str = "aabbcdef";
		char character[] = str.toCharArray();
		HashSet<Character> set = new HashSet<Character>();
		HashSet<Character> duplicateSet = new HashSet<Character>();
		for(char ch:character) {
			if(!set.add(ch)) {
				duplicateSet.add(ch);
			}
		}
		System.out.println(duplicateSet);
	}

}
