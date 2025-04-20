package com.patterns;

import java.util.Scanner;

public class TriangleNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter Any Number : ");

		int lines = scanner.nextInt();

		for (int line = 1; line <= lines; line++) {

			for (int space = 1; space <= lines - line; space++) {
				System.out.print(" ");
			}

			for (int n = 1; n <= line; n++) {
				System.out.print(n + " ");
			}
			System.out.println();
		}
	}

}
