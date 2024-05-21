package com.samul.javaсorelessons.lesson9;

import java.util.Random;

//31. Сформировать матрицу из чисел от 0 до 999, вывести ее на экран. Посчитать количество двузначных чисел в ней.

public class Task31 {

	public static void main(String[] args) {
		int a[][] = new int[10][10];
		int count;

		initArr(a);
		printArr("Array: \n", a);
		count = getTwoDigitNumbers(a);
		
		System.out.println("В матрице содержится " + count + " двузначных чисел");

	}

	static void initArr(int[][] param) {
		Random rnd = new Random();

		for (int i = 0; i < param.length; i++) {
			for (int j = 0; j < param[i].length; j++) {
				param[i][j] = rnd.nextInt(1000);
			}
		}

	}

	static void printArr(String message, int[][] param) {
		System.out.print(message);

		for (int i = 0; i < param.length; i++) {

			for (int j = 0; j < param[i].length; j++) {
				System.out.printf("[%3d] ", param[i][j]);
			}

			System.out.println();
		}
	}

	static int getTwoDigitNumbers(int[][] param) {
		int count = 0;

		for (int i = 0; i < param.length; i++) {

			for (int j = 0; j < param[i].length; j++) {

				if ((param[i][j] >= 10) && (param[i][j] <= 99)) {
					count++;
				}
			}
		}
		return count;
	}

}
