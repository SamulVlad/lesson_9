package com.samul.javaсorelessons.lesson9;

import java.util.Random;

//7. Дан двухмерный массив 5×5. Найти сумму модулей отрицательных нечетных элементов.

public class Task7 {

	public static void main(String[] args) {
		int a[][] = new int[5][5];
		int sum = 0;

		initArr(a);
		printArr("Array: \n", a);

		sum = findSum(a);

		System.out.println("\nSum = " + sum);

	}

	static void initArr(int[][] param) {
		Random rnd = new Random();

		for (int i = 0; i < param.length; i++) {
			for (int j = 0; j < param[i].length; j++) {
				param[i][j] = rnd.nextInt(10) - 5;
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

	static int findSum(int[][] param) {
		int sum = 0;

		for (int i = 0; i < param.length; i++) {

			for (int j = 0; j < param[i].length; j++) {

				if ((param[i][j] % 2 != 0) && (param[i][j] < 0)) {
					sum += Math.abs(param[i][j]);
				}

			}

		}

		return sum;

	}

}
