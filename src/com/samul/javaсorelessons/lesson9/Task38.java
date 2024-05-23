package com.samul.javaсorelessons.lesson9;

import java.util.Random;

//38. Найдите сумму двух матриц

public class Task38 {

	public static void main(String[] args) {
		int[][] a = new int[5][5];
		int[][] b = new int[5][5];
		int[][] sum = new int[5][5];

		initArr(a);
		printArr("Array a: \n", a);

		initArr(b);
		printArr("\n\nArray b: \n", b);

		sum = doAddition(a, b);
		printArr("\n\nSum of a and b: \n", sum);

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
				System.out.printf("[%2d] ", param[i][j]);
			}

			System.out.println();
		}
	}

	static int[][] doAddition(int[][] a, int[][] b) {
		int[][] res = new int[5][5];
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				res[i][j] = a[i][j] + b[i][j];
			}
		}
		return res;
	}

}
