import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;


public class ListAsClassObjectExample {
	
	public static void listAsClassObjectExample() {
		
		List<Student> list = new ArrayList<Student>();
		
		String[] subject1 = {"c", "c++"};
		String[] subject2 = {"java", "phythn"};
		list.add(new Student("mike", 1001, subject1));
		list.add(new Student("john", 1002, subject2));
		
		Iterator<Student> iterator = list.iterator();
		
		// iterate with object all values together 
		System.out.println(" ### iterate with object all values together ");
		for(int i=0;i<list.size();i++) {
			System.out.println(iterator.next());
		}
		
		// iterate with individual values of an object 
		System.out.println(" ### iterate with individual values of an object ");
		Iterator<Student> iterator1 = list.iterator();
		for(int i=0;i<list.size();i++) {
			Student s = iterator1.next();
			System.out.println(s.getId());
			System.out.println(s.getName());
			System.out.println(Arrays.toString(s.getSubject()));
		}
		
	}//end of main
	
}//end of class

class Student{
	
	String name;
	int id;
	String[] subject;
	
	public Student(String name, int id, String[] subject) {
		this.name=name;
		this.id=id;
		this.subject=subject;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String[] getSubject() {
		return subject;
	}
	public void setSubject(String[] subject) {
		this.subject = subject;
	}
	

	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", subject=" + Arrays.toString(subject) + "]";
	}
}
