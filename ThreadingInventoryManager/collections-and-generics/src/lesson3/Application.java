package lesson3;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Application {

	public static void main(String[] args) {

		
		animals();
		
	}
	
	public static void animals() {
		HashSet<Animal> animals = new HashSet<Animal>();

		Animal animal1 = new Animal("Dog", 12);
		Animal animal2 = new Animal("Cat", 8);
		Animal animal3 = new Animal("Bird", 3);
		Animal animal4 = new Animal("Dog", 12);
		Animal animal5 = new Animal("Kangaroo", 24);
		
		animals.add(animal1);
		animals.add(animal2);
		animals.add(animal3);
		animals.add(animal4);
		animals.add(animal5);

		for (Animal value : animals) {
			System.out.println(value);
		}
	}

	// Prevents duplicates and maintain order
	public static void linkedHashSet() {
		LinkedHashSet<Integer> values = new LinkedHashSet<Integer>();

		values.add(12);
		values.add(43);
		values.add(12);

		for (Integer value : values) {
			System.out.println(value);
		}

	}

	// Prevents duplicates but doesn't maintain order
	public static void hashSet() {
		HashSet<Integer> values = new HashSet<Integer>();

		values.add(12);
		values.add(43);
		values.add(12);

		for (Integer value : values) {
			System.out.println(value);
		}

	}

}
