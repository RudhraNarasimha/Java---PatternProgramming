package com.patterns;
import java.util.Scanner;

public class DiamondPattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter No of Lines in the pattern:");

		int lines = scanner.nextInt();

		// Top half (including middle line)
		for (int line = 1; line <= lines; line++) {
			// Print spaces
			for (int space = 1; space <= lines - line; space++) {
				System.out.print(" ");
			}

			// Print stars for border only
			for (int star = 1; star <= line; star++) {
				if (star == 1 || star == line) {
					System.out.print("* ");
				} else {
					System.out.print("  "); // space between border stars
				}
			}
			System.out.println();
		}

		// Bottom half
		for (int line = lines - 1; line >= 1; line--) {
			// Print spaces
			for (int space = 1; space <= lines - line; space++) {
				System.out.print(" ");
			}

			// Print stars for border only
			for (int star = 1; star <= line; star++) {
				if (star == 1 || star == line) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

}
