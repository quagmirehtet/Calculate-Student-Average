package StudentAverageConsole;

import java.util.*;

public class GradeModel {

	private List<Double> grades = new ArrayList<>();

	public void addGrade(double grade) {
		if (grade < 0 || grade > 100) {
			throw new IllegalArgumentException("Grade must be between 0 and 100.");
		}

		grades.add(grade);
	}

	public List<Double> getGrades() {
		return Collections.unmodifiableList(grades);
	}

	public int getCount() {
		return grades.size();

	}

}
