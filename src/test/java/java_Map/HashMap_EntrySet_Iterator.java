package java_Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMap_EntrySet_Iterator {

	public static void main(String[] args) {

		Map <String, String> hashMap = new HashMap <String, String>();
		hashMap.put("Key7", "Value7");
		hashMap.put("Key8", "Value8");
		Set <Map.Entry<String,String>> entrySet = hashMap.entrySet();
		Iterator <Map.Entry<String, String>> entrySetIterator = entrySet.iterator();
		while (entrySetIterator.hasNext()) {
			Map.Entry<String, String> entry = entrySetIterator.next();
			Object key = entry.getKey();
			Object value = entry.getValue();
			System.out.println(key+"-"+value);
		}
	}

}
