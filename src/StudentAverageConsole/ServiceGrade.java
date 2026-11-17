package StudentAverageConsole;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ServiceGrade {



	public static char calculateAvgGrade(double grade) {

		if (grade >= 90 && grade <= 100)
			return 'A';
		else if (grade >= 80)
			return 'B';
		else if (grade >= 70)
			return 'C';
		else
			return 'D';
	}

	public static double calculateTotalAvg(GradeModel model) {

		double total = 0;

		for (double grade : model.getGrades()) {

			total = total + grade;

		}

		return total / model.getCount();

	}

	public static void readHowManyGrade(GradeModel model,
			Scanner scanner) {

		int numberOfGrade = 0;

		while (true) {
			try {
				System.out.print("How many grades (1 to 5)? ");
				numberOfGrade = scanner.nextInt();
				scanner.nextLine();

				if (numberOfGrade < 1 || numberOfGrade > 5) {
					System.out.println("Enter a number from 1 to 5.");
					continue;
				}

				break;

			} catch (InputMismatchException e) {
				System.out.println("Enter number only.");
				scanner.nextLine();
			}
		}

		while (model.getCount() < numberOfGrade) {
			try {
				System.out.print("Enter grade: ");
				double enterGrade = scanner.nextDouble();
				scanner.nextLine();

				model.addGrade(enterGrade);

			} catch (InputMismatchException e) {
				System.out.println("Enter number only.");
				scanner.nextLine();

			} catch (IllegalArgumentException e) {
				System.out.println(e.getMessage());
			}
		}

	}

}
