package com.samul.javaсorelessons.lesson9;

import java.util.Random;

//1. Создать матрицу 3 x 4, заполнить ее числами 0 и 1 так, чтобы в одной строке была ровно одна единица, и вывести на экран.

public class Task1 {

	public static void main(String[] args) {
		int a[][] = new int[3][4];

		initArr(a);
		printArr("Result: \n", a);

	}

	static void initArr(int[][] param) {
		Random rnd = new Random();

		for (int i = 0; i < param.length; i++) {
			param[i][rnd.nextInt(4)] = 1;
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
