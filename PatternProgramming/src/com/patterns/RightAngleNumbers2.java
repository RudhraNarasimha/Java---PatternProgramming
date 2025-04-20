package com.patterns;
import java.util.Scanner;

public class RightAngleNumbers2 {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter No of Lines in the pattern");

		int lines = scanner.nextInt();

		for (int line = 1; line <= lines; line++) {

			for (int number = 1; number <= line; number++) {
				System.out.print(line + " ");

			}

			System.out.println();
		}

	}

}
