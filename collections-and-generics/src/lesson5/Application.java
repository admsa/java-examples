package lesson5;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Application {

	public static void main(String[] args) {
		sortInNaturalOrder();
	}

	public static void sortInNaturalOrder() {

		TreeMap<String, String> dictionary = new TreeMap<String, String>();
		dictionary.put("Brave", "read to face and endure danger or pain; showing courage.");
		dictionary.put("Brilliant", "exceptionally clever or talented.");
		dictionary.put("Joy", "a feeling of great pleasure and happiness.");
		dictionary.put("Confidence", "the state of feeling certain about truth of something.");

		for (Map.Entry<String, String> entry : dictionary.entrySet()) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
	}

	public static void old() {

		LinkedHashMap<String, String> dictionary = new LinkedHashMap<String, String>();
		// HashMap<String, String> dictionary = new HashMap<String, String>();
		dictionary.put("Brave", "read to face and endure danger or pain; showing courage.");
		dictionary.put("Brilliant", "exceptionally clever or talented.");
		dictionary.put("Joy", "a feeling of great pleasure and happiness.");
		dictionary.put("Confidence", "the state of feeling certain about truth of something.");

//		for(String word: dictionary.keySet()) {
//			//System.out.println(word);
//			System.out.println(dictionary.get(word));
//		}

		for (Map.Entry<String, String> entry : dictionary.entrySet()) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
	}

}
