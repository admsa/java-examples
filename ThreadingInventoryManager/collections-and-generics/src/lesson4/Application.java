package lesson4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Application {

	public static void main(String[] args) {

		HashSet<Employee> hashSet = new HashSet<Employee>();
		hashSet.add(new Employee("Mike", 3500, "Accounting"));
		hashSet.add(new Employee("Paul", 3000, "Admin"));
		hashSet.add(new Employee("Peter", 4000, "IT"));
		hashSet.add(new Employee("Angel", 2000, "Maint"));		
		
		ArrayList<Employee> myList = new ArrayList<Employee>(hashSet);
		
		Collections.sort(myList);
		System.out.println(myList);
		
//		HashSet<Integer> hashSet = new HashSet<Integer>();
//		hashSet.add(12);
//		hashSet.add(43);
//		hashSet.add(12);
//		hashSet.add(15);		
//		
//		ArrayList<Integer> myList = new ArrayList<Integer>(hashSet);
//		
//		Collections.sort(myList);
//		System.out.println(myList);
		
//		ArrayList<Integer> list1 = new ArrayList<Integer>();
//		list1.add(12);
//		list1.add(43);
//		list1.add(12);
//		list1.add(15);
//
//		List<Integer> li = new ArrayList<Integer>(list1);
//
//		ArrayList<Integer> newList = new ArrayList<Integer>();
//		newList.add(12);
//
//		// list1.removeAll(newList);
//		// list1.clear();
//
//		// boolean value = list1.contains(43);
//		// System.out.println(value);
//
//		list1.retainAll(newList);
//		System.out.println(list1);

	}

}
