package practice2;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Count_All_Duplicate_Character {

	public static void main(String[] args) {
		String str = "Alok Kumar Barman";
		char character[] = str.toLowerCase().toCharArray();
		Map<Character,Integer> map = new HashMap<Character, Integer>();
		for(Character ch:character) {
			if(map.containsKey(ch)) {
				map.put(ch, map.get(ch)+1);
			}
			else {
				map.put(ch, 1);
			}
		}
		Set<Character> set = map.keySet();
		for(Character key:set) {
			if(map.get(key)>1) {
				System.out.println("Duplicate: "+key+" occurance: "+map.get(key));
			}
		}
	}

}
