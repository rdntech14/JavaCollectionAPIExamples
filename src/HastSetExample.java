import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class HastSetExample {
	
	public static void hastSetExample() {
		//remove duplicate data from array 
		int oriArr[] = {2,5,4,1,2,3,4,5};
		System.out.println(Arrays.toString(oriArr));
		
		HashSet<Integer> hashSet = new HashSet<>();
		for(int i=0;i< oriArr.length;i++) {
			hashSet.add(oriArr[i]);
		}
		
		System.out.println(hashSet);
		
		int noDuplicateArr[] = new int[hashSet.size()];
		
		Iterator<Integer> iterator = hashSet.iterator();
		
		for(int i = 0; i< noDuplicateArr.length; i++) {
			noDuplicateArr[i] = iterator.next();
		}
		
		System.out.println(Arrays.toString(noDuplicateArr));
	}

}
