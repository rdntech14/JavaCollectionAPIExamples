import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListExample {
	

	public static void arrayListExample() {
		
		List<Integer> list = new ArrayList<Integer>();
		
		list.add(20);
		list.add(70);
		list.add(1, 20);
		list.add(10);
		list.add(300);
		
		System.out.println(list);
		
		//remove based on index
		list.remove(3);
		
		//remove based on Object/List value
		list.remove(new Integer(20));
		
		System.out.println(list.contains(20));
		
		System.out.println(list);
		// List has get method, Set does not have get method
		System.out.println(list.get(2));
		
		// way to iterate list
		
		System.out.println(" ### way to iterate list - method 1 - iterator ### ");
		Iterator<Integer> iterator = list.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		System.out.println("way to iterate list - method 2 - regular for loop");
		for(int i = 0; i <list.size();i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("way to iterate list - method 3 - enhanced for loop");
		for(Integer i : list) {
			System.out.println(i);
		}
	}

}
