package com.samul.javaсorelessons.lesson9;

//19. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):

public class Task19 {

	public static void main(String[] args) {
		int[][] a = new int[10][10];

		initArr(a);
		printArr("Array: \n", a);

	}

	static void initArr(int[][] param) {

		for (int i = 0; i < param.length / 2; i++) {
			for (int j = i; j < param[i].length - i; j++) {
				param[i][j] = 1;
				param[param.length - i - 1][j] = 1;
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
