package com.samul.javaсorelessons.lesson9;

import java.util.Random;

/*36. Операция сглаживания матрицы дает новую матрицу того же размера, каждый элемент которой получается
как среднее арифметическое соседей соответствующего элемента исходной матрицы. Построить результат
сглаживания заданной матрицы
*/
public class Task36 {

	public static void main(String[] args) {
		int[][] a = new int[10][15];

		initArr(a);
		printArr("Array: \n", a);

		a = makeChange(a);
		printArr("\n\nArray after change: \n", a);

	}

	static void initArr(int[][] param) {
		Random rnd = new Random();

		for (int i = 0; i < param.length; i++) {
			for (int j = 0; j < param[i].length; j++) {
				param[i][j] = rnd.nextInt(100);
			}
		}

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

	static int[][] makeChange(int[][] param) {
		int[][] res = new int[param.length][param[0].length];

		for (int i = 0; i < param.length; i++) {

			for (int j = 0; j < param[i].length; j++) {

				if (i == 0 && j == 0) {
					res[i][j] = (param[i][j + 1] + param[i + 1][j] + param[i + 1][j + 1]) / 3;

				} else if (i == 0 && j == (param[i].length - 1)) {
					res[i][j] = (param[i][j - 1] + param[i + 1][j - 1] + param[i + 1][j]) / 3;

				} else if ((i == param.length - 1) && j == 0) {
					res[i][j] = (param[i - 1][j] + param[i - 1][j + 1] + param[i][j + 1]) / 3;

				} else if ((i == param.length - 1) && (j == param[i].length - 1)) {
					res[i][j] = (param[i - 1][j - 1] + param[i - 1][j] + param[i][j - 1]) / 3;

				} else if (i == 0 && j > 0) {
					res[i][j] = (param[i][j - 1] + param[i][j + 1] + param[i + 1][j - 1] + param[i + 1][j]
							+ param[i + 1][j + 1]) / 5;

				} else if (i > 0 && j == 0) {
					res[i][j] = (param[i - 1][j] + param[i - 1][j + 1] + param[i][j + 1] + param[i + 1][j]
							+ param[i + 1][j + 1]) / 5;

				} else if (i > 0 && (j == param[i].length - 1)) {
					res[i][j] = (param[i - 1][j - 1] + param[i - 1][j] + param[i][j - 1] + param[i + 1][j - 1]
							+ param[i + 1][j]) / 5;

				} else if ((i == param.length - 1) && j > 0) {
					res[i][j] = (param[i - 1][j - 1] + param[i - 1][j] + param[i - 1][j + 1] + param[i][j - 1]
							+ param[i][j + 1]) / 5;

				} else {
					res[i][j] = (param[i - 1][j - 1] + param[i - 1][j] + param[i - 1][j + 1] + param[i][j - 1]
							+ param[i][j + 1] + param[i + 1][j - 1] + param[i + 1][j] + param[i + 1][j + 1]) / 8;
				}
			}
		}

		return res;

	}

}
