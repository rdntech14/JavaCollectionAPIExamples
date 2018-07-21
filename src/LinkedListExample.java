import java.util.LinkedList;

public class LinkedListExample {
	
	public static void testLinkedList() {
	LinkedList<Integer> linkedList = new LinkedList<>();
	linkedList.add(10);
	linkedList.add(20);
	linkedList.add(30);
	linkedList.add(40);
	linkedList.add(50);
	linkedList.add(60);
	
	System.out.println(linkedList);
	
	linkedList.removeFirst();
	linkedList.removeLast();
	linkedList.remove(3);
	linkedList.remove(new Integer(50));
	
	System.out.println(linkedList);
	
	System.out.println(linkedList.contains(10));
	
	}
}
