package com.patterns;
import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter Your Number :");

		int n = scanner.nextInt();

		for (int line = n; line >= 1; line--) {

			for (int number = 1; number <= line; number++) {
				System.out.print(number);
			}

			System.out.println();
		}
	}

}
