package java_basics;

public class MyUtils {
	
	protected int result;
	
	public static void print() {
		System.out.println("Stuff");
	}
	
	public static void print(int d) {
		System.out.println(d);
	}
	
	public MyUtils add10(int num) {
		result = num + 10;
		return this;
	}
	
	public int getNum() {
		return result;
	}
}
