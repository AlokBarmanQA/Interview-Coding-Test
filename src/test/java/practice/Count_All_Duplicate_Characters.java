package practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Count_All_Duplicate_Characters {

	public static void main(String[] args) {
		String str = "Aaaaabbbbcccddefg";
		char charac[] = str.toLowerCase().toCharArray();
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for(Character ch:charac) {
			if(map.containsKey(ch)) {
				map.put(ch, map.get(ch)+1);
			} 
			else {
				map.put(ch, 1);
			}
		}
		Set<Character> map_set = map.keySet();
		for(Character key:map_set) {
			if(map.get(key)>1) {
				System.out.println("Duplicate character: "+key+" Ocurance "+map.get(key));
			}
		}
		
	}

}
