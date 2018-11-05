package lambda.practical;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class App {

	public static void main(String[] args) {

		List<Car> cars = Arrays.asList(
			new Car("Honda", "Accord", "Red", 22300),
			new Car("Honda", "Civic", "Blue", 17700), 
			new Car("Toyota", "Land Cruiser", "White", 48500),
			new Car("Jeep", "Wrangler", "Red", 24500)
		);

		Function<Car, String> priceAndColor = c -> " price = " + c.getPrice() + " color = " + c.getColor();
		System.out.println(priceAndColor.apply(cars.get(0)));
		
//		printCarsPriceRange(cars, 17700, 22300);
//		printCarsByColor(cars, "Red");
		
		printCars(cars, c -> c.getPrice() >= 17700 && c.getPrice() <= 22300);
		printCars(cars, c -> c.getColor().equals("Blue"));

	}
	

	//public static void printCars(List<Car> cars, Condition<Car> condition) {
	public static void printCars(List<Car> cars, Predicate<Car> predicate) {
		for (Car c : cars) {
			if (predicate.test(c)) {
				c.printCar();
			}
		}
	}

//	public static void printCarsPriceRange(List<Car> cars, int low, int high) {
//		for (Car c : cars) {
//			if (low <= c.getPrice() && c.getPrice() <= high) {
//				c.printCar();
//			}
//		}
//	}
//
//	public static void printCarsByColor(List<Car> cars, String color) {
//		for (Car c : cars) {
//			if (c.getColor().equals(color)) {
//				c.printCar();
//			}
//		}
//	}

}

@FunctionalInterface
interface Condition<T> {
	public boolean test(T t);
}

//@FunctionalInterface
//interface CarCondition {
//	public boolean test(Car c);
//}