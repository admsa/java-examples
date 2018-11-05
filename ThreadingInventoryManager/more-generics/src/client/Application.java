package client;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Application {

	public static void main(String[] args) {

//		Container<Integer, String> container = new Container<>(12, "test");
//		int val1 = container.getItem1();

		//System.out.println(val1);

		Set<String> mySet1 = new HashSet<String>();
		mySet1.add("First");
		mySet1.add("Second");

		Set<String> mySet2 = new HashSet<String>();
		mySet2.add("First");
		mySet2.add("Third");
		mySet2.add("Fourth");

		Set<String> result = union(mySet1, mySet2);
		//System.out.println(result);
		
		Iterator<String> itr = result.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

	public static <E> Set<E> union(Set<E> set1, Set<E> set2) {

		Set<E> result = new HashSet<>(set1);
		result.addAll(set2);

		return result;
	}
}
