package com.samul.javaсorelessons.lesson9;

import java.util.Random;

//35. Найдите наибольший элемент матрицы и заменить все нечетные элементы на него.

public class Task35 {

	public static void main(String[] args) {
		int[][] a = new int[10][15];
		int max;
		
		initArr(a);
		printArr("Array: \n", a);
		
		max = getMaxElement(a);
		System.out.println("\n\nMax element: " + max);
		
		makeChange(a, max);
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

	static int getMaxElement(int[][] param) {
		int max;
		
		max = param[0][0];
		
		for (int i = 0; i < param.length; i++) {

			for (int j = 0; j < param[i].length; j++) {
				if (param[i][j] > max) {
					max = param[i][j];
				}
			}
		}
		
		return max;

	}

	static void makeChange(int[][] param, int max) {

		for (int i = 0; i < param.length; i++) {

			for (int j = 0; j < param[i].length; j++) {
				if (param[i][j] % 2 != 0) {
					param[i][j] = max;
				}
			}
		}
		
	}
	
}
