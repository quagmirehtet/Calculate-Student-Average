package FileHandlingForStudentGrade;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

import StudentAverageConsole.GradeModel;

public class GradeFileService {

	private static final Path HISTORY_FILE = Path.of("grade_history.txt");

	public static void saveResult(GradeModel model, double average, char letterGrade) {

		String result = String.format("Grades: %s | Average: %.2f | Letter Grade: %c%n", model.getGrades(), average,
				letterGrade);
		
		try {
			Files.writeString(HISTORY_FILE, result, StandardOpenOption.CREATE,StandardOpenOption.APPEND);
			
			System.out.println("Result saved to grade_history.txt");
			
		} catch (IOException e) {
			
			 System.out.println("Cannot save file: " + e.getMessage());
			
		}
		
		   

	}
	
	 public static void showHistory() {
	        try {
	            if (Files.notExists(HISTORY_FILE)) {
	                System.out.println("No saved history yet.");
	                return;
	            }

	            System.out.println("\n--- Grade History ---");
	            System.out.println(Files.readString(HISTORY_FILE));

	        } catch (IOException e) {
	            System.out.println("Cannot read file: " + e.getMessage());
	        }
	    }

}
