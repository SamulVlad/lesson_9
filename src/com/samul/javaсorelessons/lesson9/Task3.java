package com.samul.javaсorelessons.lesson9;

import java.util.Random;

//3. Дана матрица.Вывести на экран первый и последний столбцы.

public class Task3 {

	public static void main(String[] args) {
		int a[][] = new int[10][10];

		initArr(a);
		printArr("Array: \n", a);
		printArr("\nResult: \n", a, 0, a[0].length - 1);

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

	static void printArr(String message, int[][] param, int idxA, int idxB) {
		System.out.print(message);

		for (int i = 0; i < param.length; i++) {
			System.out.printf("[%2d] [%2d]\n", param[i][idxA], param[i][idxB]);
		}

	}

}
