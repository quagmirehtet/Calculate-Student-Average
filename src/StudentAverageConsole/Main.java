package StudentAverageConsole;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);

		String ans = "";

		do {
			GradeModel model = new GradeModel();

			ServiceGrade.readHowManyGrade(model, scanner);

			double average = ServiceGrade.calculateTotalAvg(model);

			System.out.println("Average Grade: " + average);
			System.out.println("Letter Grade: " + ServiceGrade.calculateAvgGrade(average));

			System.out.print("Do you want to continue (y/n)? ");
			ans = scanner.nextLine().trim();

		} while (ans.equalsIgnoreCase("y"));

	}

}
