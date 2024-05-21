package com.samul.javaсorelessons.lesson9;

import java.util.Random;
import java.util.Scanner;

/*27. В числовой матрице поменять местами два столбца любых столбца, 
т. е. все элементы одного столбца поставить на соответствующие им позиции другого, а его элементы второго переместить в первый. 
Номера столбцов вводит пользователь с клавиатуры.
*/
public class Task27 {

	public static void main(String[] args) {
		int a[][] = new int[10][10];
		int m, n;

		initArr(a);
		m = getColNum("Введите номер колонки m: ");
		n = getColNum("\nВведите номер колонки n: ");

		printArr("\nArray:\n", a);
		doChange(a, m, n);
		printArr("\nArray after change:\n", a);

	}

	static int getColNum(String str) {
		Scanner in = new Scanner(System.in);

		System.out.print(str);
		while (!in.hasNextInt()) {
			System.out.print(str);
			in.next();
		}

		return in.nextInt();

	}

	static void initArr(int[][] param) {
		Random rnd = new Random();

		for (int i = 0; i < param.length; i++) {
			for (int j = 0; j < param[i].length; j++) {
				param[i][j] = rnd.nextInt(100);
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

	static void doChange(int[][] param, int a, int b) {
		int temp;

		for (int i = 0; i < param.length; i++) {
			temp = param[i][a];
			param[i][a] = param[i][b];
			param[i][b] = temp;
		}

	}

}
