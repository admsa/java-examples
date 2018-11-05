package client;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Sample {

	public static void main(String[] args) {

		System.out.println(data());

	}

	public static List<HashMap<String, Double>> data() {
		List<HashMap<String, Double>> result = new ArrayList<>();

		
		for (int i = 0; i < 5; i++) {
			HashMap<String, Double> data = new HashMap<>();
			data.put("text_" + i, (double) i);
			result.add(data);
		}

		return result;
	}

}
