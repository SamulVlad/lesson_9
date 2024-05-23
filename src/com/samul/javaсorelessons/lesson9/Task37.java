package com.samul.javaсorelessons.lesson9;

import java.util.Random;

//37. Переставить строки матрицы случайным образом.

public class Task37 {

	public static void main(String[] args) {
		int[][] a = new int[10][15];

		initArr(a);
		printArr("Array: \n", a);

		doReplace(a);
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

	static void doReplace(int[][] param) {
		Random rnd = new Random();

		for (int i = 0; i < param.length; i++) {
			int[] tempRow;
			int randomIndex = rnd.nextInt(param.length);

			tempRow = param[i];
			param[i] = param[randomIndex];
			param[randomIndex] = tempRow;

		}

	}

}
