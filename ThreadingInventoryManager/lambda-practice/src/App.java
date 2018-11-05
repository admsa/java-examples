
public class App {

	public static void main(String[] args) {
		Human tom = new Human();
		walker(tom);
		
		Robot wale = new Robot();
		walker(wale);

		
		ALambdaClass aBlockOfCode = () -> {
			System.out.println("Custom object walking. ");
		};
		

		// Functional interface must have one abstract method
		walker(() -> System.out.println("Custom object walking. "));
		
//		walker(() -> {
//			System.out.println("Custom object walking. ");
//		});
		
		Calculate sumVar = (a, b) -> a + b;
		
		System.out.println(sumVar.comput(1, 2));
		
		Calculate nonZeroDivider = (a, b) -> {
			if (a == 0 ) return 0;
			return a/b;
		};
		
		System.out.println(nonZeroDivider.comput(4, 2));
		
		StringWorker reverser = (str) -> {
			String result = "";
			for (int i = str.length() - 1; i >= 0; i--) {
				result += str.charAt(i);
			}
			return result;
		};
		
		System.out.println(reverser.work("sample"));
		
		Factorial factorial = (number) -> {
			int result = 1;
			for (int i = 1; i <= number; i++) {
				result = i*result;
			}
			return result;
		};
		
		System.out.println(factorial.compute(5));
		
		// Reverser
		
		MyGenericInterface<String> reverser2 = (str) -> {
			String result = "";
			for (int i = str.length() - 1; i >= 0; i--) {
				result += str.charAt(i);
			}
			return result;
		};
		
		
		MyGenericInterface<Integer> factorial2 = (number) -> {
			int result = 1;
			for (int i = 1; i <= number; i++) {
				result = i*result;
			}
			return result;
		};
		
		System.out.println(reverser2.work("Oops"));
		System.out.println(factorial2.work(3));
		
	}
	
	public static void walker(Walkable walkableEntity) {
		walkableEntity.walk();
	}

}


interface MyGenericInterface<T> {
	public T work(T t);
}

interface Calculate {
	public int comput(int a, int b);
}

interface StringWorker {
	public String work(String str);
}

interface Factorial {
	public int compute(int number);
}