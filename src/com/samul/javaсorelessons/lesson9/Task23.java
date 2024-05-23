package com.samul.javaсorelessons.lesson9;

//23. Сформировать квадратную матрицу порядка N по правилу:

public class Task23 {

	public static void main(String[] args) {
		double[][] a = new double[10][10];

		initArr(a);
		printArr("Array: \n", a);

	}

	static void initArr(double[][] param) {

		for (int i = 0; i < param.length; i++) {
			for (int j = 0; j < param.length; j++) {
				param[i][j] = getArrayElement(i, j, param.length);
			}
		}

	}

	static void printArr(String message, double[][] param) {
		System.out.print(message);

		for (int i = 0; i < param.length; i++) {

			for (int j = 0; j < param[i].length; j++) {
				System.out.printf("[%5.2f] ", param[i][j]);
			}

			System.out.println();
		}
	}

	static double getArrayElement(int indA, int indB, int dim) {
		return Math.sin((indA * indA - indB * indB)/ dim);
	}

}
