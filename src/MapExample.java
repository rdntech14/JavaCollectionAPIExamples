import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class MapExample {
	
	public static void mapExample() {
		Map<Integer, String> map = new HashMap<>();
		// put values
		map.put(10, "Apple");
		map.put(20, "Google");
		map.put(30, "Amazon");
		map.put(40, "Facebook");
		map.put(50, "Microsoft");
		
		//updated value
		map.put(30, "Amazon1");
		
		// remove values
		map.remove(50);
		
		System.out.println(map);
		
		System.out.println(map.containsKey(40));
		System.out.println(map.containsValue("Google"));
		System.out.println(map.containsValue("Samsung"));
		
		// iterate map
		System.out.println(" ######  Print map - keyset");
		for(Object o : map.keySet()) {
			System.out.println(o);
		}
		
		System.out.println("  ###### Print map - values");
		for(Object o : map.values()) {
			System.out.println(o);
		}
		
		System.out.println(" ###### Print map - Entry Set");
		for(Entry<Integer, String> o : map.entrySet()) {
			System.out.println(o);
		}
		
		// iterate using regular for loop
		System.out.println(" ###### iterate using Iterator plus for loop ###### ");
		Iterator<Entry<Integer, String>> iterator = map.entrySet().iterator();
		for(int i=0;i<map.size(); i++) {
			System.out.println(iterator.next());
		}
	}
	
	// Get the count of duplicate values in the given array
	
	public static void getDuplicateValuesCountInArray() {
		
		int arrOri[] = {2,3,4,2,4,5,6,5,2,4,3}; 
		
		System.out.println(arrOri);
		
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i=0;i<arrOri.length;i++) {
			int counter=0;
			if(map.containsKey(arrOri[i])) {
				counter = map.get(arrOri[i]);
				counter++;
				map.put(arrOri[i], counter);
			} else {
				map.put(arrOri[i], 1);
			}
		}
		
		System.out.println(map.entrySet());
		
	}

}
