package com.samul.javaсorelessons.lesson9;

import java.util.Random;

//32. Отсортировать строки матрицы по возрастанию и убыванию значений элементов.

public class Task32 {

	public static void main(String[] args) {
		int[][] a = new int[10][10];
		int count;

		initArr(a);
		printArr("Array: \n", a);
		
		ascSort(a);
		printArr("\nArray after asc sort: \n", a);

		dscSort(a);
		printArr("\nArray after dsc sort: \n", a);
		
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

	static void ascSort(int[][] param) {
		for (int i = 0; i < param.length; i++) {
			for (int j = 1; j < param[i].length; j++) {

				int currElem = param[i][j];
				int ind = j - 1;

				while (ind >= 0 && currElem < param[i][ind]) {
					param[i][ind + 1] = param[i][ind];
					param[i][ind] = currElem;
					ind--;
				}
			}

		}

	}

	static void dscSort(int[][] param) {
		for (int i = 0; i < param.length; i++) {
			for (int j = 1; j < param[i].length; j++) {

				int currElem = param[i][j];
				int ind = j - 1;

				while (ind >= 0 && currElem > param[i][ind]) {
					param[i][ind + 1] = param[i][ind];
					param[i][ind] = currElem;
					ind--;
				}
			}

		}

	}

}
