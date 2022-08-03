
import java.util.*;
public class collectionsDemo {
	
	public static void main(String[] args) {
		//ArrayList
		System.out.println("ArrayList");
		ArrayList<Integer> ob = new ArrayList<Integer>();
		ob.add(10);
		ob.add(20);
		ob.add(50);
		System.out.println(ob);
		System.out.println("");
		//LinkedList
		System.out.println("LinkedList:");
		LinkedList<String> names =  new LinkedList<String>();
		names.add("Arjun");
		names.add("Aravindh");
		names.add("Bala");
		Iterator<String> itr = names.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		//Hashset
		System.out.println("");
		System.out.println("Hashset");
		HashSet<String> hash = new HashSet<String>();
		hash.add("Dog");
		hash.add("Cat");
		hash.add("zebra");
		hash.add("Cow");
		System.out.println(hash);
		
		//LinkedHashset
		System.out.println("");
		System.out.println("LinkedHashset");
		LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
		set.add(20);
		set.add(5);
		set.add(10);
		set.add(100);
		System.out.println(set);
	}
}
