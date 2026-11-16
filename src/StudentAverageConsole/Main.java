package StudentAverageConsole;

import java.util.*;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		


		String ans = "";
		
		int numberOfGrade=0;

	

		do {
			

			double totalAvg = 0.0;

			while (true) {
				
				try {
				
				System.out.print("How many grade (1 to 5) ? :");
				numberOfGrade = scanner.nextInt();
				scanner.nextLine();
				
				if (numberOfGrade < 1 || numberOfGrade > 5) {

					System.out.println("Invalid Input");

					scanner.close();

					return;

				}
				
				}catch(InputMismatchException e) {
					
					System.out.println("Enter number only");
					scanner.nextLine();
					
					break;
					
				}

				for (int i = 1; i <= numberOfGrade; i++) {

					try {
						System.out.println("Enter grade :");
						double enterGrade = scanner.nextDouble();
						scanner.nextLine();

						totalAvg += enterGrade;

					} catch (InputMismatchException e) {

						System.out.println("Invalid input Type.");

					}

				}

				double grade = ServiceGrade.calculateTotalAvg(totalAvg, numberOfGrade);

				System.out.println("Total Grade :"+grade);
				
				char letterGrade = ServiceGrade.calculateAvgGrade(grade);

				System.out.println("Letter Grade :" + letterGrade);

				break;
			}

			System.out.println("Do you want to continue (y/n)?");
			ans = scanner.nextLine().trim();

		} while (ans.equalsIgnoreCase("y"));

	}

}
