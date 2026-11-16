package StudentAverageConsole;

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

	public static double calculateTotalAvg(double totalAvg, int numberOfGrade) {

		return totalAvg / numberOfGrade;

	}

}