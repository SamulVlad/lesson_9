package com.samul.javaсorelessons.lesson9;

import java.util.Random;

//39. Найдите произведение двух матриц.

public class Task39 {

	public static void main(String[] args) {
		int[][] a = new int[5][5];
		int[][] b = new int[5][5];
		int[][] prod = new int[5][5];

		initArr(a);
		printArr("Array a: \n", a);

		initArr(b);
		printArr("\n\nArray b: \n", b);

		prod = doMult(a, b);
		printArr("\n\nProduction of a and b: \n", prod);

	}

	static void initArr(int[][] param) {
		Random rnd = new Random();

		for (int i = 0; i < param.length; i++) {
			for (int j = 0; j < param[i].length; j++) {
				param[i][j] = rnd.nextInt(10);
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

	static int[][] doMult(int[][] a, int[][] b) {
		int[][] res = new int[5][5];

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {

				int elemIJ = 0;
				for (int r = 0; r < a.length; r++) {
					elemIJ += a[i][r] * b[r][j];
				}

				res[i][j] = elemIJ;
			}
		}
		return res;
	}

}
