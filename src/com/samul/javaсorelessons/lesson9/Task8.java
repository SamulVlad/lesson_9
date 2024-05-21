package com.samul.javaсorelessons.lesson9;

import java.util.Random;

//8. Дан двумерный массив n×m элементов. Определить, сколько раз встречается число 7 среди элементов массива.

public class Task8 {

	public static void main(String[] args) {
		int a[][] = new int[5][10];
		int sum = 0;

		initArr(a);
		printArr("Array: \n", a);

		sum = findSevens(a);

		System.out.println("\nSevens = " + sum);

	}

	static void initArr(int[][] param) {
		Random rnd = new Random();

		for (int i = 0; i < param.length; i++) {
			for (int j = 0; j < param[i].length; j++) {
				param[i][j] = rnd.nextInt(10);
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

	static int findSevens(int[][] param) {
		int sum = 0;

		for (int i = 0; i < param.length; i++) {

			for (int j = 0; j < param[i].length; j++) {

				if (param[i][j] == 7) {
					sum++;
				}

			}

		}

		return sum;

	}

}
