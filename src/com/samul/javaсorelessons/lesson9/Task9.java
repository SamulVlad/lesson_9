package com.samul.javaсorelessons.lesson9;

import java.util.Random;

//9. Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.

public class Task9 {

	public static void main(String[] args) {
		int a[][] = new int[10][10];

		initArr(a);
		printArr("Array: \n", a);
		printDiagonal("\nDiagonal: \n", a);

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

	static void printDiagonal(String message, int[][] param) {
		System.out.print(message);

		for (int i = 0; i < param.length; i++) {

			for (int j = 0; j < param[i].length; j++) {

				if (i == j) {
					System.out.printf("[%2d] ", param[i][j]);
				} else {
					System.out.printf("[%2s] ", "");
				}
			}

			System.out.println();
		}

	}

}
