package lesson2;

import java.util.ArrayList;
import java.util.List;

public class Application {

	public static void main(String[] args) {
		
		//ArrayList<String> animals = new ArrayList<String>();
		List<String> animals = new ArrayList<String>();
		animals.add("Lion");
		animals.add("Cat");
		animals.add("Dog");
		animals.add("Bird");
		
//		for(int i = 0; i < animals.size(); i++) {
//			System.out.println(animals.get(i));
//		}

//		for(String value : animals) {
//			System.out.println(value);
//		}

		//ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();
		List<Vehicle> vehicles = new ArrayList<Vehicle>();
		
		Vehicle vehicle2 = new Vehicle("Toyota", "Camery", 12000, true);
		vehicles.add(new Vehicle("Honda", "accord", 12000, false));
		vehicles.add(vehicle2);
		
//		for (Vehicle car : vehicles) {
//			System.out.println(car);
//		}
		
		printElements(vehicles);
		printElements(animals);
		
	}
	
	public static void printElements(List<?> someList) {
		for (int i = 0; i < someList.size(); i++) {
			System.out.println(someList.get(i));
		}
	}

}
