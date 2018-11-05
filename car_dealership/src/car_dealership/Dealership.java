package car_dealership;

public class Dealership {

	public static void main(String[] args) {

		Customer cust1  = new Customer("Tom", "123 Anyhing St.", 25000);
		Vehicle vehicle = new Vehicle("Honda", "Accord", 15000);
		Employee emp    = new Employee();
		
		cust1.purchaseCar(vehicle, emp, false);
		
		Vehicle car = new Vehicle("Honda", "Accord", 15000);
		System.out.println(car.equals(vehicle));
	}

}
