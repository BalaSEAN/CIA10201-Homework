package hw1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Homework5 {	
	//1.
	public static void starSquare(int width, int height) {
		int s[][] =new int[height][width];
		for(int i=0;i<s.length;i++) {
			for(int j=0; j<s[i].length;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	//2.
	public static void randAvg() {
		int num[] = new int[10];
		int sum = 0;
		for(int i=0;i<10;i++) {
			num[i]=(int)(Math.random()*101);
			System.out.print(num[i]+" ");
			sum+=num[i];
		}
		double avrNum = (double) sum/10;
		System.out.println("\n"+avrNum);
	}
	//3.
	public int maxElement(int x[][]) {
		int maxSum = 0;
		for(int i = 0; i < 2 ; i++) {			
			for(int j = 0; j < 3; j++) {
				if(x[i][j] > maxSum) {
					maxSum = x[i][j];
				}
			}
		}
		return maxSum;
	}
	public double maxElement(double x[][]) {
		double maxSum = 0;
		for(int i = 0; i < 2 ; i++) {			
			for(int j = 0; j < 3; j++) {
				if(x[i][j] > maxSum) {
					maxSum = x[i][j];
				}
			}
		}
		return maxSum;
	}
	
	public static void main(String[] args) {
//		1.請設計一個方法為starSquare(int width, int height)，
//		當使用者鍵盤輸入寬與高時，即會印出對應的*長方形		
		Scanner p =new Scanner(System.in);
		System.out.println("請輸入寬與高");
		int width = p.nextInt();
		int height = p.nextInt();
		starSquare(width, height);
		
//		2.請設計一個方法為randAvg()，從10個0～100(含100)的整數亂數中取平均值並印出這10個亂數與平均值\
		randAvg();
		
//		3.利用Overloading，設計兩個方法int maxElement(int x[][])與
//		double maxElement(double x[][])，可以找出二維陣列的最大值並回傳
		int[][] intArray = {
				{1, 6, 3},
				{9, 5, 2}
		};
		
		double[][] doubleArray = {
				{1.2, 3.5, 2.2}, 
				{7.4, 2.1, 8.2}
		};
		
		Homework5 w = new Homework5();
		System.out.println(w.maxElement(intArray));
		System.out.println(w.maxElement(doubleArray));
		
	}
	

		

}
