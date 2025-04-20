package com.patterns;

public class CodegnanItSolutions {

	public static void main(String[] args) {

		// C

		for (int i = 0; i <= 6; i++) {

			for (int j = 0; j <= 6; j++) {

				if ((j == 0) & (i != 0 & i != 6) || (i == 0) & (j != 0 & i == 0) || (i == 6 & (j != 0)))

				{
					System.out.print("*");
				} else {
					System.out.print(" ");
				}

			}

			System.out.print("  ");

			// O

			for (int j = 0; j <= 6; j++) {
				if (j == 0 & (i != 0 & i != 6) || (i == 0) & (j != 0 & j != 6) || i == 6 & j != 0 & j != 6
						|| j == 6 & i != 0 & i != 6) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}

			}

			System.out.print("  ");

			// D

			for (int j = 0; j <= 6; j++) {
				if (j == 0 || ((i == 0 || i == 6) & (j != 6)) || (j == 6 & (i != 0 & i != 6))) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}

			}

			System.out.print("  ");

			// E

			for (int j = 0; j <= 6; j++) {
				if (j == 0 || i == 0 || i == 3 || i == 6) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}

			}

			System.out.print("  ");
			// G

			for (int j = 0; j <= 6; j++) {
				if (j == 0 || // left vertical line
						i == 0 && j > 0 && j < 6 || // top row (excluding corners)
						i == 3 && j > 2 || // middle horizontal line (open part)
						i == 6 && j > 0 && j < 6 || // bottom row (excluding corners)
						j == 6 && i >= 3 && i < 6 // right vertical line (lower part only)
				) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.print("  ");
			// N

			for (int j = 0; j <= 6; j++) {
				if ((j == 0) || (j == 6) || (i == j)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}

			}

			System.out.print("  ");

			// A

			for (int j = 0; j <= 6; j++) {
				if ((i == 0 & (j != 0 & j != 6)) || ((j == 0 || j == 6) & (i != 0)) || i == 3) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}

			}
			System.out.print("  ");

			// N

			for (int j = 0; j <= 6; j++) {
				if ((j == 0) || (j == 6) || (i == j)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}

			}
			System.out.print("        ");
			// I 

			for (int j = 0; j <= 6; j++) {
				if (((i == 0) || j == 3) || i == 6) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}

			}
			System.out.print("  ");
			// T

			for (int j = 0; j <= 6; j++) {
				if (((i == 0) || j == 3)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}

			}
			System.out.print("        ");

			// S

			for (int j = 0; j <= 6; j++) {
				if (i == 0 || // Top
						i == 3 || // Middle
						i == 6 || // Bottom
						(j == 0 && i > 0 && i < 3) || // Left top side
						(j == 6 && i > 3 && i < 6) // Right bottom side
				) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.print("  ");
			// O

			for (int j = 0; j <= 6; j++) {
				if (j == 0 & (i != 0 & i != 6) || (i == 0) & (j != 0 & j != 6) || i == 6 & j != 0 & j != 6
						|| j == 6 & i != 0 & i != 6) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}

			}

			System.out.print("  ");

			// O

			for (int j = 0; j <= 6; j++) {
				if (j == 0 || i == 6) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}

			}

			System.out.print("  ");
			// O

			for (int j = 0; j <= 6; j++) {
				if ((j == 0) & (i != 0 || i != 6) || (j == 6) & (i != 0 || i != 6) || i == 6) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}

			}

			System.out.print("  ");
			// T

			for (int j = 0; j <= 6; j++) {
				if (((i == 0) || j == 3)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}

			}
			System.out.print("  ");
			// I

			for (int j = 0; j <= 6; j++) {
				if (((i == 0) || j == 3) || i == 6) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}

			}
			System.out.print("  ");

			// O

			for (int j = 0; j <= 6; j++) {
				if (j == 0 & (i != 0 & i != 6) || (i == 0) & (j != 0 & j != 6) || i == 6 & j != 0 & j != 6
						|| j == 6 & i != 0 & i != 6) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}

			}
			System.out.print("  ");

			// N

			for (int j = 0; j <= 6; j++) {
				if ((j == 0) || (j == 6) || (i == j)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}

			}

			System.out.print("  ");

			// S

			for (int j = 0; j <= 6; j++) {
				if (i == 0 || // Top
						i == 3 || // Middle
						i == 6 || // Bottom
						(j == 0 && i > 0 && i < 3) || // Left top side
						(j == 6 && i > 3 && i < 6) // Right bottom side
				) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}

			System.out.println();

		}

	}

}
