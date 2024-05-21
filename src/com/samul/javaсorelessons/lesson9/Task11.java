package com.samul.javaсorelessons.lesson9;

import java.util.Random;

//11. Дана матрица размера m x n. 
//Вывести ее элементы в следующем порядке: первая строка справа налево, вторая строка слева направо, третья строка справа налево и так далее.

public class Task11 {

	public static void main(String[] args) {
		int a[][] = new int[10][15];
		int k = 3, p = 5;

		initArr(a);
		printArr("Array: \n", a);
		printResult("\nResult: \n", a);

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

	static void printResult(String message, int[][] param) {
		System.out.print(message);

		for (int i = 0; i < param.length; i++) {

			if (i % 2 == 0) {
				for (int j = 0; j < param[i].length; j++) {
					System.out.printf("[%2d] ", param[i][j]);
				}
			} else {
				for (int j = param[i].length - 1; j >= 0; j--) {
					System.out.printf("[%2d] ", param[i][j]);
				}
			}

			System.out.println();
		}

	}

}
