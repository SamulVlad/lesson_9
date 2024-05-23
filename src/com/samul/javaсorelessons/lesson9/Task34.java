package com.samul.javaсorelessons.lesson9;

import java.util.Random;

//34. Сформировать случайную матрицу m x n, состоящую из нулей и единиц, причем в каждом столбце число
//единиц равно номеру столбца.

public class Task34 {

	public static void main(String[] args) {
		int[][] a = new int[10][10];

		initArr(a);
		printArr("Array: \n", a);

	}

	static void initArr(int[][] param) {
		Random rnd = new Random();

		for (int j = 0; j < param[0].length; j++) {
			int count = j + 1;
			while (count > 0) {
				int ind = rnd.nextInt(param.length);
				if (param[ind][j] == 0) {
					param[ind][j] = 1;
					count--;
				}
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
