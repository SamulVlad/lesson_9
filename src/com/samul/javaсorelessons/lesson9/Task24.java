package com.samul.javaсorelessons.lesson9;

import java.util.Random;

//24. Дан линейный массив x1, x2, ... , xn−1, xn. Получить действительную квадратную матрицу порядка n:

public class Task24 {

	public static void main(String[] args) {
		double[] raw = new double[10];
		double[][] a = new double[10][10];

		initArr(raw);
		initArr(a, raw);
		printArr("Array: \n", a);

	}

	static void initArr(double[] param) {
		Random rnd = new Random();

		for (int i = 0; i < param.length; i++) {
			for (int j = 0; j < param.length; j++) {
				param[i] = rnd.nextDouble(10);
			}
		}

	}

	static void initArr(double[][] param, double[] initRaw) {

		for (int i = 0; i < param.length; i++) {
			for (int j = 0; j < param.length; j++) {
				param[i][j] = Math.pow(initRaw[j], i + 1);
			}
		}

	}

	static void printArr(String message, double[][] param) {
		System.out.print(message);

		for (int i = 0; i < param.length; i++) {

			for (int j = 0; j < param[i].length; j++) {
				System.out.printf("[%.2f] ", param[i][j]);
			}

			System.out.println();
		}
	}

}
