package com.samul.javaсorelessons.lesson9;

import java.util.Random;

//29. Найти положительные элементы главной диагонали квадратной матрицы.

public class Task29 {

	public static void main(String[] args) {
		int a[][] = new int[10][10];

		initArr(a);
		printArr("Array: \n", a);
		printPosDiagonal("\nPositive diagonal: \n", a);

	}

	static void initArr(int[][] param) {
		Random rnd = new Random();

		for (int i = 0; i < param.length; i++) {
			for (int j = 0; j < param[i].length; j++) {
				param[i][j] = rnd.nextInt(100) - 50;
			}
		}

	}

	static void printArr(String message, int[][] param) {
		System.out.print(message);

		for (int i = 0; i < param.length; i++) {

			for (int j = 0; j < param[i].length; j++) {
				System.out.printf("[%3d] ", param[i][j]);
			}

			System.out.println();
		}
	}

	static void printPosDiagonal(String message, int[][] param) {
		System.out.print(message);

		for (int i = 0; i < param.length; i++) {

			for (int j = 0; j < param[i].length; j++) {

				if ((i == j) && param[i][j] > 0) {
					System.out.printf("[%3d] ", param[i][j]);
				} else {
					System.out.printf("[%3s] ", "");
				}
			}

			System.out.println();
		}

	}

}
