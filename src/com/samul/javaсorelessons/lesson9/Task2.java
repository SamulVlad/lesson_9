package com.samul.javaсorelessons.lesson9;

import java.util.Random;

//2. Создать и вывести на экран матрицу 2 x 3, заполненную случайными числами из [0, 9].

public class Task2 {

	public static void main(String[] args) {
		int a[][] = new int[2][3];

		initArr(a);
		printArr("Result: \n", a);

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
				System.out.printf("[%1d] ", param[i][j]);
			}
			
			System.out.println();
		}

	}

}
