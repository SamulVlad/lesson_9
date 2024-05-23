package com.samul.javaсorelessons.lesson9;

import java.util.Random;

//13. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):

public class Task13 {

	public static void main(String[] args) {
		int[][] a = new int[10][10];

		initArr(a);
		printArr("Array: \n", a);

	}

	static void initArr(int[][] param) {

		for (int i = 0; i < param.length; i = i + 2) {
			for (int j = 0; j < param[i].length; j++) {
				param[i][j] = j + 1;
				param[i + 1][j] = param[i].length - j;
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

}
