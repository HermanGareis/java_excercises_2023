package string_manipulation;

import java.util.Arrays;
import java.util.Scanner;

public final class Utils {

	private Utils() {
	};

	public static String takeInput(Scanner scanner) {
		System.out.println("Enter string to be modified: ");
		String input = scanner.nextLine();
		return input;
	}

	public static String takeSeparator(Scanner scanner) {
		System.out.println("Enter separator: ");
		String separator = scanner.nextLine();
		return separator;
	}

	public static int[] sortString(String input, String separator) {

		//split string into an array using the separator
		String[] parts = input.split(separator); 

		//create an empty int array same size as string array
		int[] numbers = new int[parts.length];

		//parse data from the string array to an int deleting every non numercal character
		for (int i = 0; i < parts.length; i++) {
			numbers[i] = Integer.parseInt(parts[i].replaceAll("[^0-9]", ""));
		}

		Arrays.sort(numbers);

		return numbers;

	}
}
