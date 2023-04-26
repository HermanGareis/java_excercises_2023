package string_manipulation;

import java.util.Scanner;

public class Utils implements StringUtils {

	private static Utils instance;

	private Utils() {
	}

	static Utils getInstance() {
		if (instance == null) {
			instance = new Utils();
		}
		return instance;
	}

	public String modifyStringSeparator() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter string to be modified: ");
		String input = scanner.nextLine();
		System.out.println("Enter the separator: ");
		String separator = scanner.nextLine();
		String[] parts = input.split(separator);
		String output = String.join("", parts);
		scanner.close();
		return "Result: " + output;
	}

	public String modifyStringRegex() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter string to be modified: ");
		String input = scanner.nextLine();
		System.out.println("Enter the separator Regex: ");
		String regex = scanner.nextLine();
		String output = input.replaceAll(regex, "");
		scanner.close();
		return "Result: " + output;
	}

}
