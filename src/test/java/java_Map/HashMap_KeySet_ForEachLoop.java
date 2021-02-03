package java_Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMap_KeySet_ForEachLoop {

	public static void main(String[] args) {

		Map <String, String> hashMap = new HashMap<String, String>();
		hashMap.put("Key1", "Value1");
		hashMap.put("Key2", "Value2");
		Set <String> keySet = hashMap.keySet();
		for (String key : keySet) {
			String value = hashMap.get(key);
			System.out.println(key + "-"+value);
		}
	}

}
