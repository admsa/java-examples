package client;

import java.util.ArrayList;
import java.util.List;

public class Application2 {

	public static void main(String[] args) {
		
		//Object myObject = new Object();
		
		ArrayList<Employee> employees = new ArrayList<>();
		
		employees.add(new Employee());
		ArrayList<Accountant> accountants = new ArrayList<>();
		accountants.add(new Accountant());
		
		//makeEmployeeWork(employees);
		makeEmployeeWork(accountants);
		
		ArrayList<?> employees2 = new ArrayList<>();
		ArrayList<String> accountants2 = new ArrayList<>();
		employees2 = accountants2;
		
		// Upper bound
		ArrayList<? extends Employee> employees3 = new ArrayList<>();
		ArrayList<Accountant> accountants3 = new ArrayList<>();
		
		employees3 = accountants3;

		// Lower Bound
		ArrayList<? super Employee> employees4 = new ArrayList<>();
		//ArrayList<Accountant> accountants4 = new ArrayList<>();
		ArrayList<Object> accountants4 = new ArrayList<>();
		
		employees4 = accountants4;
	}
	
	public static void makeEmployeeWork(List<? extends Employee> employees) {
		for (Employee emp : employees) {
			emp.work();
		}
	}

}
