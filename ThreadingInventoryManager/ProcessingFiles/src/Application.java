import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {

		try {

			File file = new File("myfile.txt");
			Scanner input;

			input = new Scanner(file);

			while (input.hasNextLine()) {
				String line = input.nextLine();
				System.out.println(line);
			}

			input.close();

		} catch (FileNotFoundException e) {
			System.out.println("File not found.");
			// e.printStackTrace();
		}

		MyFileUtils myUtil = new MyFileUtils();
		try {
			myUtil.subtract10FromLargerNumber(15);
		} catch (Exception e) {
			e.printStackTrace();
		}

//		
//		Scanner input = new Scanner(System.in);
//		
//		System.out.print("Enter some Test: ");
//		String enteredText = input.nextLine();
//		System.out.println(enteredText);
//		
//		input.close();
//		
	}

}
