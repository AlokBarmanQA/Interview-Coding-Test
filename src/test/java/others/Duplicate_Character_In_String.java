package others;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Duplicate_Character_In_String {

	public static void main(String[] args) {
		String str = "Alok*Kumar*Barman";
		char[] ch = str.toLowerCase().toCharArray();
		System.out.println(ch);
		Map<Character,Integer> map = new HashMap<Character, Integer>();
		for (Character c:ch) {
			if (map.containsKey(c)) {
				map.put(c, map.get(c)+1);
			}
			else {
				map.put(c, 1);
			}
		}
		System.out.println(map);
		Set<Character> set = map.keySet();
		for (Character keys:set) {
			if (map.get(keys)>1) {
				System.out.println("Character '"+keys+"' repeating "+map.get(keys)+" times");
			}
		}
	}

}
