package com.patterns;
import java.util.Scanner;

public class PyramidStars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter No of Lines in the pattern");

		int lines = scanner.nextInt();

		for (int line = 1; line <= lines; line++) {

			for (int space = 1; space <= lines - line; space++) {
				System.out.print(" ");
			}

			for (int stars = 1; stars <= line; stars++) {
				System.out.print("* ");

			}

			System.out.println();
		}

	}

}
