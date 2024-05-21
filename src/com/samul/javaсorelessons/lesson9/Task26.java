package com.samul.javaсorelessons.lesson9;

import java.util.Random;
import java.util.Scanner;

/*26. С клавиатуры вводится двумерный массив чисел размерностью nxm. Выполнить с массивом следующие действия: 
а) вычислить сумму отрицательных элементов в каждой строке; 
б) определить максимальный элемент в каждой строке; 
в) переставить местами максимальный и минимальный элементы матрицы.
*/

public class Task26 {

	public static void main(String[] args) {
		int a[][] = new int[3][3];

		initArr(a);
		printArr("\nArray:\n", a);
		doChange(a);
		printArr("\nArray after change:\n", a);

	}

	static void initArr(int[][] param) {
		Scanner in = new Scanner(System.in);

		for (int i = 0; i < param.length; i++) {
			for (int j = 0; j < param[i].length; j++) {

				System.out.print("Введите элемент [" + i + "," + j + "]: ");
				while (!in.hasNextInt()) {
					System.out.print("Введите элемент [" + i + "," + j + "]: ");
					in.next();
				}
				
				param[i][j] = in.nextInt();

			}
		}

	}

	static void printArr(String message, int[][] param) {
		System.out.print(message);

		for (int i = 0; i < param.length; i++) {

			for (int j = 0; j < param[i].length; j++) {
				System.out.printf("[%2d] ", param[i][j]);
			}

			System.out.print(" Сумма отрицательных элементов: " + getNegativeSum(param[i]));
			System.out.print(", Максимальный элемент: " + getMax(param[i]));
			System.out.println();
		}
	}

	static int getNegativeSum(int[] param) {
		int sum = 0;

		for (int elem : param) {
			if (elem < 0) {
				sum += elem;
			}
		}

		return sum;
	}

	static int getMax(int[] param) {
		int max = 0;

		max = param[0];

		for (int i = 1; i < param.length; i++) {
			if (param[i] > max) {
				max = param[i];
			}
		}

		return max;
	}

	static void doChange(int[][] param) {
		int minIndA = 0, minIndB = 0;
		int maxIndA = 0, maxIndB = 0;
		int min, max;

		min = param[0][0];
		max = param[0][0];

		for (int i = 0; i < param.length; i++) {
			for (int j = 0; j < param[i].length; j++) {

				if (param[i][j] > max) {
					max = param[i][j];
					maxIndA = i;
					maxIndB = j;
				}

				if (param[i][j] < min) {
					min = param[i][j];
					minIndA = i;
					minIndB = j;
				}

			}
		}

		int temp = param[minIndA][minIndB];
		param[minIndA][minIndB] = param[maxIndA][maxIndB];
		param[maxIndA][maxIndB] = temp;
	}

}
