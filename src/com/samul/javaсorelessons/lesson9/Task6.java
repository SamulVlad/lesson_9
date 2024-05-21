package com.samul.javaсorelessons.lesson9;

import java.util.Random;

//6. Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего.

public class Task6 {

	public static void main(String[] args) {
		int a[][] = new int[10][10];

		initArr(a);
		printArr("Array: \n", a);
		printOddCol("\nResult: \n", a);

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

	static void printOddCol(String message, int[][] param) {
		System.out.print(message);

		for (int i = 0; i < param.length; i++) {

			for (int j = 0; j < param[i].length; j = j + 2) {

				if (param[0][j] > param[param.length - 1][j]) {
					System.out.printf("[%2d] ", param[i][j]);
				}
			}

			System.out.println();
		}

	}

}
