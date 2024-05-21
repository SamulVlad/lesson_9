package com.samul.javaсorelessons.lesson9;

import java.util.Random;

//5. Дана матрица. Вывести на экран все четные строки, то есть с четными номерами.

public class Task5 {

	public static void main(String[] args) {
		int a[][] = new int[5][10];

		initArr(a);
		printArr("Array: \n", a);
		printOddStr("\nResult: \n", a);

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

	static void printOddStr(String message, int[][] param) {
		System.out.print(message);

		for (int i = 1; i < param.length; i = i + 2) {
			for (int j = 0; j < param[i].length; j++) {
				System.out.printf("[%2d] ", param[i][j]);
			}
			System.out.println();
		}

	}

}
