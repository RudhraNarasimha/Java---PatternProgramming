package com.patterns;

public class Rudhra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// R 
		for (int i = 0; i <= 6; i++) {

			for (int j = 0; j <= 6; j++) {

				if ((i == 0) || (j == 0) || (i == j & i != 1 & i != 2 & i != 3)
						|| (j == 6) & (i != 4) & (i != 5) & (i != 6) || (i == 3)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}

			}

			System.out.print("   ");
			// U

			for (int j = 0; j <= 6; j++) {

				if (j == 0 || i == 6 || j == 6) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}

			}
			System.out.print("   ");

			// D

			for (int j = 0; j <= 6; j++) {
				if (j == 0 || ((i == 0 || i == 6) & (j != 6)) || (j == 6 & (i != 0 & i != 6))) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}

			}
			System.out.print("   ");

			// H
			for (int j = 0; j <= 6; j++) {
				if (j == 0 || j == 6 || i == 3) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}

			}
			System.out.print("   ");
			// R
			for (int j = 0; j <= 6; j++) {

				if ((i == 0) || (j == 0) || (i == j & i != 1 & i != 2 & i != 3)
						|| (j == 6) & (i != 4) & (i != 5) & (i != 6) || (i == 3)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}

			}

			System.out.print("   ");

			// A
			for (int j = 0; j <= 6; j++) {
				if ((i == 0 & (j != 0 & j != 6)) || ((j == 0 || j == 6) & (i != 0)) || i == 3) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}

			}
			System.out.print("        ");

			// N

			for (int j = 0; j <= 6; j++) {
				if ((j == 0) || (j == 6) || (i == j)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}

			}
			System.out.print("   ");

			// A
			for (int j = 0; j <= 6; j++) {
				if ((i == 0 & (j != 0 & j != 6)) || ((j == 0 || j == 6) & (i != 0)) || i == 3) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}

			}
			System.out.print("   ");

			// R
			for (int j = 0; j <= 6; j++) {

				if ((i == 0) || (j == 0) || (i == j & i != 1 & i != 2 & i != 3)
						|| (j == 6) & (i != 4) & (i != 5) & (i != 6) || (i == 3)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}

			}

			System.out.print("   ");

			// A
			for (int j = 0; j <= 6; j++) {
				if ((i == 0 & (j != 0 & j != 6)) || ((j == 0 || j == 6) & (i != 0)) || i == 3) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}

			}
			System.out.print("   ");

			// S
			for (int j = 0; j <= 6; j++) {

				if (i == 0 || j == 0 & i != 4 & i != 5 & i != 6 || i == 3 || j == 6 & i != 0 & i != 1 & i != 2 & i != 3
						|| i == 6) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}

			}

			System.out.print("   ");

			// I

			for (int j = 0; j <= 6; j++) {
				if (((i == 0) || j == 3) || i == 6) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}

			}
			System.out.print("   ");

			// M

			for (int j = 0; j <= 6; j++) {
				if (j == 0 || i == j & i != 4 & i != 5 & i != 6 || i == 2 & j == 4 || i == 1 & j == 5 || j == 6) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}

			}
			System.out.print("   ");

			// H
			for (int j = 0; j <= 6; j++) {
				if (j == 0 || j == 6 || i == 3) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}

			}
			System.out.print("   ");

			// A
			for (int j = 0; j <= 6; j++) {
				if ((i == 0 & (j != 0 & j != 6)) || ((j == 0 || j == 6) & (i != 0)) || i == 3) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}

			}
			System.out.println();

		}

	}

}
