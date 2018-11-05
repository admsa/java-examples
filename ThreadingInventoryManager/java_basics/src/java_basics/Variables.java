package java_basics;

public class Variables {

	public static void main(String[] args) {
		String[] words = new String[] {
				"My", "Name"
		};
		System.out.println(words[0]);
		System.out.println(words[1]);
		
		words = new String[10];
		
		System.out.println(words[0]);
		
		String test = "";
		switch(test) {
			case "wew":
			break;
		}
		
//		MyUtils.print();
//		MyUtils.print(1);
		
		MyUtils util = new MyUtils();
		System.out.println(util.add10(1).getNum());

	}
	


}
