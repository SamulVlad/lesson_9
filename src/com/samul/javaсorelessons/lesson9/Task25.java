package com.samul.javaсorelessons.lesson9;

//25. Получить квадратную матрицу порядка n:

public class Task25 {

	public static void main(String[] args) {
		int[][] a = new int[10][10];

		initArr(a);
		printArr("Array: \n", a);

	}

	static void initArr(int[][] param) {
		int dim = param.length;
		
		for (int i = 0; i < dim; i++) {
			for (int j = 0; j < dim; j++) {
				param[i][j] =  i * dim + j + 1;
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
