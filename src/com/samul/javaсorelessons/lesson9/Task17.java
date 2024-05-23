package com.samul.javaсorelessons.lesson9;

//17. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):

public class Task17 {

	public static void main(String[] args) {
		int[][] a = new int[10][10];

		initArr(a);
		printArr("Array: \n", a);

	}

	static void initArr(int[][] param) {

		for (int i = 0; i < param.length; i++) {
			param[0][i] = 1;
			param[param.length - 1][i] = 1;
		}

		for (int i = 0; i < param.length; i++) {
			param[i][0] = 1;
			param[i][param[i].length - 1] = 1;
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
