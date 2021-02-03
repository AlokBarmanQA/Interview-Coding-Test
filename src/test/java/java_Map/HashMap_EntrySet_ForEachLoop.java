package java_Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMap_EntrySet_ForEachLoop {

	public static void main(String[] args) {
		
		HashMap <String,String> hashMap = new HashMap<String, String>();
		hashMap.put("Key5", "Value5");
		hashMap.put("Key6", "Value6");
		Set <Map.Entry<String,String>> entrySet = hashMap.entrySet();
		for (Map.Entry<String,String> entry : entrySet) {
			Object key = entry.getKey();
			Object value = entry.getValue();
			System.out.println(key+"-"+value);
		}
	}

}
