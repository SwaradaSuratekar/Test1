package Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapJava {

	public static void main(String[] args) {
		Map<String, Integer> map= new HashMap();
		map.put("abc", 1);
		map.put("pqr", 2);
		map.put("xyz", 3);
		System.out.println("map is: "+map);
		System.out.println("size of map is: "+ map.size());
		Set<Entry<String, Integer>> entry_set=map.entrySet();
		for(Entry<String, Integer> entry: entry_set) {
			String key= entry.getKey();
			System.out.println("key: "+key);
			int value=entry.getValue();
			System.out.println("value: "+value);
		}
		
	}
}
