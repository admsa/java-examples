package practice.loops;

public class FoorLoops {

	public static void main(String[] args) {

		int counter = 0;

		for (int i = 0; i <= 100; i++) {
			System.out.println(i);
			int temp = counter + 1;
			counter = temp;
		}

	}

	public static void even() {

		for (int i = 0; i <= 100; i += 2) {
			System.out.println(i);
		}

//		int number = 100;

//		for (int i = 0; i <= number; i++) {
//			if (i % 2 == 0) {
//				System.out.println(i);
//			}
//		}

	}

	public static void reverse() {

		String name = "abcdefg";
		int length = name.length() - 1;

		for (int i = length; i >= 0; i--) {
			System.out.print(name.charAt(i));
		}
	}

}
