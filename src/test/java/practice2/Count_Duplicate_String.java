package practice2;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Count_Duplicate_String {

	public static void main(String[] args) {
		String words[] = {"Java","java","java", "Selenium","selenium","QTP"};
		Map<String,Integer> map = new HashMap<String, Integer>();
		for(String word:words) {
			if(map.containsKey(word.toLowerCase())) {
				map.put(word.toLowerCase(), map.get(word)+1);
			}
			else {
				map.put(word.toLowerCase(), 1);
			}
		}
		Set<String> set = map.keySet();
		for(String key:set) {
			if(map.get(key.toLowerCase())>1) {
				System.out.println("Duplicate>>"+key+" Occurance>>"+map.get(key));
			}
		}
	}

}
