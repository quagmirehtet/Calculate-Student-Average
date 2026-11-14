package StudentAverageConsole;

import java.util.*;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("How many grade (1 to 5) ? :");
		int numberOfGrade = scanner.nextInt();
		scanner.nextLine();

		double totalAvg = 0.0;

		String ans = "";

		if (numberOfGrade < 1 || numberOfGrade > 5) {

			System.out.println("Invalid Input");

			scanner.close();

			return;

		}

		for (int i = 1; i <= numberOfGrade; i++) {

			do {

				try {
					System.out.println("Enter grade :");
					double enterGrade = scanner.nextDouble();
					scanner.nextLine();

					totalAvg += enterGrade;
				} catch (InputMismatchException e) {

					System.out.println("Invalid input Type.");

				}

				ServiceGrade.calculateTotalAvg(totalAvg, numberOfGrade);

				char letterGrade = ServiceGrade.calculateAvgGrade(totalAvg);

				System.out.println("Letter Grade :" + letterGrade);

				System.out.println("Do you want to continue (y/n)?");
				ans = scanner.nextLine().trim();

			} while (ans.equalsIgnoreCase("y"));

			scanner.close();

		}
	}

}
