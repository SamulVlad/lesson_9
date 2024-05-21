package com.samul.javaсorelessons.lesson9;

import java.util.Random;

/*30. Матрицу 10x20 заполнить случайными числами от 0 до 15. 
Вывести на экран саму матрицу и номера строк, в которых число 5 встречается три и более раз.
*/
public class Task30 {

	public static void main(String[] args) {
		int a[][] = new int[10][20];

		initArr(a);
		printArr("Array: \n", a);
		printFivesStringNumbers("\nВ следующих строках число 5 встречается три и более раз: ", a);

	}

	static void initArr(int[][] param) {
		Random rnd = new Random();

		for (int i = 0; i < param.length; i++) {
			for (int j = 0; j < param[i].length; j++) {
				param[i][j] = rnd.nextInt(16);
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

	static void printFivesStringNumbers(String message, int[][] param) {
		System.out.print(message);

		for (int i = 0; i < param.length; i++) {
			int fivesCount = 0;

			for (int j = 0; j < param[i].length; j++) {

				if (param[i][j] == 5) {
					fivesCount++;
				}
			}

			if (fivesCount >= 3) {
				System.out.print(" " + i);
			}
		}

	}

}
