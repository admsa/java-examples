package lesson1;

import java.util.ArrayList;
import java.util.LinkedList;

public class Application {

	public static void main(String[] args) {
		
		ArrayList<String> words = new ArrayList<String>();
		words.add("One");
		words.add("Two");

		//System.out.println(words.get(0));
		for (String word : words) {
			System.out.println(word);
		}
		
		LinkedList<Integer> numbers = new LinkedList<Integer>();
		numbers.add(100);
		numbers.add(200);

		for(int number : numbers) {
			System.out.println(number);
		}
	}

}
