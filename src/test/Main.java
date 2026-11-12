package test;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int[] array;

		System.out.println("Enter number :");
		int num = scanner.nextInt();
		scanner.nextLine();

		int i = 1;
		while (i <= 5) {
			
			System.out.print("How many number ( 1 to 5 ) ?");
			int sum=scanner.nextInt();
			scanner.nextLine();
			
			

			i++;
		}

	}

}
