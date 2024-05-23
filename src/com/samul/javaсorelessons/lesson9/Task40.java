package com.samul.javaсorelessons.lesson9;

import java.util.Random;

/*40. Магическим квадратом порядка n называется квадратная матрица размера nxn, составленная из чисел 1, 2, 3, ...,n
2
так, что суммы по каждому столбцу, каждой строке и каждой из двух больших диагоналей равны между собой.
Построить такой квадрат. Пример магического квадрата порядка 3:
*/
public class Task40 {

	public static void main(String[] args) {
		int[][] a;

		a = generateMagicSquare(3);
		printArr("Magic square: \n", a);

	}

	public static int[][] generateMagicSquare(int n) {
		int[][] magicSquare = new int[n][n];

		int number = 1;
		int i = 0, j = n / 2;

		while (number <= n * n) {
			magicSquare[i][j] = number++;
			int newi = (i - 1 + n) % n;
			int newj = (j + 1) % n;

			if (magicSquare[newi][newj] != 0) {
				i = (i + 1) % n;
			} else {
				i = newi;
				j = newj;
			}
		}

		return magicSquare;
	}


	static void printArr(String message, int[][] param) {
		System.out.print(message);

		for (int i = 0; i < param.length; i++) {

			for (int j = 0; j < param[i].length; j++) {
				System.out.printf("[%2d] ", param[i][j]);
			}

			System.out.println();
		}
	}
}
