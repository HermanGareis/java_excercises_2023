package string_manipulation;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		String input = Utils.takeInput(scanner);

		String separator = Utils.takeSeparator(scanner);

		int[] sortedList = Utils.sortString(input, separator);

		for (int i : sortedList) {
			System.out.println(i);
		}

		scanner.close();
	}

}
