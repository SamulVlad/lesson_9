package com.samul.javaсorelessons.lesson9;

import java.util.Random;

//28. Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом столбце. Определить, какой столбец содержит максимальную сумму.

public class Task28 {

	public static void main(String[] args) {
		int a[][] = new int[10][15];

		initArr(a);
		printArr("Array: \n", a);
		int sums[] = getSums(a);
		printArr("\nArray of sums:", sums);
		
		System.out.println("\nМаксимальная сумма содержится в столбце с индексом: " + findMax(sums));
		

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

	static void printArr(String message, int[]param) {
		System.out.print(message);

		for (int i = 0; i < param.length; i++) {
				System.out.printf("[%2d] ", param[i]);
			}

	}

	static int[] getSums(int[][] param) {
		int[] sums = new int[param[0].length];
		
		for (int j = 0; j < param[0].length; j++) {

			for (int i = 0; i < param.length; i++) {
				sums[j] += param[i][j];
			}

		}
		
		return sums;
	}
	
	static int findMax(int[] param) {
		int res;
		int maxIdx = 0;
		
		res = param[0];
		
		for (int i = 1; i < param.length; i++) {
			if (param[i] > res) {
				res = param[i];
				maxIdx = i;
			}
		}
		
		return maxIdx;

	}

	
}
