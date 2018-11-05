package hello;

public class Hello {
	public static void main(String[] args) {
		int max = 8;
		for(int i=0; i < max; i++) {
			for(int j=0; j < i; j++) {
				System.out.print('*');
			}
			System.out.print("\n");
		}
		for(int i=max; i > 0; i--) {
			for(int j=i; j > 0; j--) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}
}
