package com.samul.javaсorelessons.lesson9;

import java.util.Random;

//10. Дана матрица. Вывести k-ю строку и p-й столбец матрицы.

public class Task10 {

	public static void main(String[] args) {
		int a[][] = new int[10][10];
		int k = 3, p = 5;

		initArr(a);
		printArr("Array: \n", a);
		printArr("\nResult: \n", a, k - 1, p - 1);

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

	static void printArr(String message, int[][] param, int k, int p) {
		System.out.print(message);

		for (int i = 0; i < param.length; i++) {

			for (int j = 0; j < param[i].length; j++) {

				if (i == k || j == p) {
					System.out.printf("[%2d] ", param[i][j]);
				} else {
					System.out.printf("[%2s] ", "");
				}
			}

			System.out.println();
		}

	}

}
