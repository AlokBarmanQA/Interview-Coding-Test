package java_Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMap_KeySet_Iterator {

	public static void main(String[] args) {

		Map <String, String> hashMap = new HashMap <String, String>();
		hashMap.put("Key3", "Value3");
		hashMap.put("Key4", "Value4");
		Set <String> keySet = hashMap.keySet();
		Iterator <String> keySetIterator = keySet.iterator();
		while (keySetIterator.hasNext()) {
			String key = keySetIterator.next();
			String value = hashMap.get(key);
			System.out.println(key+"-"+value);
		}
	}

}
