package com.patterns;

import java.util.Scanner;

public class PrintA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Print A

		for (int i = 0; i <= 6; i++) {
			for (int j = 0; j <= 6; j++) {
				if ((i == 0 & (j != 0 & j != 6)) || ((j == 0 || j == 6) & (i != 0)) || i == 3) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}

			}
			System.out.println();
		}

		System.out.println();

		// Print N

		for (int i = 0; i <= 6; i++) {
			for (int j = 0; j <= 6; j++) {
				if ((j == 0) || (j == 6) || (i == j)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}

			}
			System.out.println();

		}

		System.out.println();

		for (int i = 0; i <= 6; i++) {
			for (int j = 0; j <= 6; j++) {
				if ((i == 0 & (j != 0 & j != 6)) || ((j == 0 || j == 6) & (i != 0)) || i == 3) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}

			}
			System.out.println();
		}

		System.out.println();

		// Print N

		for (int i = 0; i <= 6; i++) {
			for (int j = 0; j <= 6; j++) {
				if ((j == 0) || (j == 6) || (i == j)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}

			}
			System.out.println();

		}

		for (int i = 0; i <= 6; i++) {
			for (int j = 0; j <= 6; j++) {
				if (j == 0 || ((i == 0 || i == 6) & (j != 6)) || (j == 6 & (i != 0 & i != 6))) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}

			}
			System.out.println();

		}

	}
}
