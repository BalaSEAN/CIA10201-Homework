package hw1;

import java.util.Scanner;

public class CalTest {
	public static void main(String[]args) throws CalException {
		Scanner s =new Scanner(System.in);
		System.out.println("請輸入x的值");
		int x = s.nextInt();
		System.out.println("請輸入y的值");
		int y = s.nextInt();
		
		Calculator c = new Calculator();		
		System.out.println(c.powerXY(x, y));
	}
}
