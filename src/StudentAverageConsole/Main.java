package StudentAverageConsole;

import java.util.*;

public class Main {
	
	public static char calculateAvgGrade(double grade) {
		
	if(grade >=90 &&  grade < 100) return 'A';
	
	else if(grade >= 80 ) return 'B';
	
	
	else if(grade >=70) return 'C';
	
	
	else return 'D';
		
		
		
	
		
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("How many grade (1 to 5) ? :");
		int numberOfGrade = scanner.nextInt();
		scanner.nextLine();

		double totalAvg = 0.0;
 

		

		if (numberOfGrade < 1 || numberOfGrade > 5) {

			System.out.println("Invalid Input");

			scanner.close();

			return; 

		}

		for (int i = 1; i <= numberOfGrade; i++) {

			System.out.print("Enter grade :");
			double enterGrade = scanner.nextDouble();
			scanner.nextLine();

			totalAvg += enterGrade ;
			
		
			

		}
		
		
		
		System.out.println("Total average :"+totalAvg/numberOfGrade);
		
		char letterGrade=calculateAvgGrade(totalAvg);
		
		System.out.println("Letter Grade :"+letterGrade);

		scanner.close();

	}

}
