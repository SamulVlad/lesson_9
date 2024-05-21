package com.samul.javaсorelessons.lesson9;

import java.util.Random;

//4. Дана матрица. Вывести на экран первую и последнюю строки.

public class Task4 {

	public static void main(String[] args) {
		int a[][] = new int[10][10];

		initArr(a);
		printArr("Array: \n", a);
		printArr("\nResult: \n", a, 0, a.length - 1);

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
			System.out.printf("[%2d] ", param[idxA][i]);
		}

		System.out.println();

		for (int i = 0; i < param.length; i++) {
			System.out.printf("[%2d] ", param[idxB][i]);
		}

	}

}
