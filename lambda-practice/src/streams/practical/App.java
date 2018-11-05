package streams.practical;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class App {

	public static void main(String[] args) {

		{
			IntStream.range(1, 10).forEach((x) -> System.out.print(x));
			System.out.println();
		}

		{
			IntStream.range(1, 10).skip(5).forEach((x) -> System.out.print(x));
			System.out.println();
		}

		{
			System.out.println(IntStream.range(1, 5).sum());
		}

		{
			Stream.of("Hello", "Bottle", "Africa").sorted().findFirst().ifPresent(x -> System.out.println(x));
		}

		{
			String[] items = { "car", "computer", "toothpaste", "box", "pencil", "tent", "door", "toy" };
			Stream.of(items).filter(x -> x.startsWith("t")).sorted().forEach(x -> System.out.print(x + ", "));
			System.out.println();
		}

		{
			// Average of squares of an int array
			Arrays.stream(new int[] { 2, 4, 6, 8, 10 }).map(x -> x * x).average().ifPresent(n -> System.out.print(n));
			System.out.println();
		}

		{
			List<String> listOfItems = Arrays.asList("Computer", "Toothpaste", "Box", "Pencil", "Car", "Tent", "Door",
					"Toy");
			listOfItems.stream().map(x -> x.toLowerCase()).filter(x -> x.startsWith("c")).sorted()
					.forEach(x -> System.out.print(x + ", "));
		}

		{
			try {

				Stream<String> lines = Files.lines(Paths.get("files/wordFile.txt"));
				lines.filter(l -> l.length() > 6).sorted().forEach(x -> System.out.print(x + ", "));
				lines.close();
				System.out.println();

			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		{
			try {
				List<String> words = Files.lines(Paths.get("files/wordFile.txt")).filter(x -> x.contains("th"))
						.collect(Collectors.toList());
				words.forEach(x -> System.out.print(x + ", "));
				System.out.println();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		{
			String sentence = "The quick brown foxes:2";
			// sentence.split(" ");

			List<String> items1 = Arrays.asList(sentence.split(" "));
			items1.forEach(x -> System.out.print(x + ", "));
			// System.out.println(items1);
			System.out.println();

			Arrays.asList(sentence.split(" ")).stream().filter(x -> x.contains(":"))
					.forEach(x -> System.out.print(x + ", "));
			System.out.println();

		}

		{

			try {

				Stream<String> rows = Files.lines(Paths.get("files/stockDataCsv.txt"));

				int rowCount = (int) rows.map(x -> x.split(",")).filter(x -> x.length > 3).count();
				System.out.println(rowCount + " good rows.");
				rows.close();

			} catch (IOException e) {

				e.printStackTrace();
			}

		}

		{
			try {

				Stream<String> rows = Files.lines(Paths.get("files/stockDataCsv.txt"));

				rows.map(x -> x.split(",")).filter(x -> x.length > 3).filter(x -> Integer.parseInt(x[1].trim()) > 15)
						.forEach(x -> System.out.println(x[0].trim() + " " + x[2].trim() + " " + x[3].trim()));

				rows.close();

			} catch (IOException e) {

				e.printStackTrace();
			}

		}

	}

}
