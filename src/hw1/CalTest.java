package hw1;

import java.util.Scanner;

public class CalTest {
	public static void main(String[]args) throws CalException {
		Scanner sc =new Scanner(System.in);
		Calculator c = new Calculator();
		int ary[] = new int [2];
		int i = 0;
		while(i<=0) {
			try {
			System.out.println("請輸入x的值");
			ary[0] = sc.nextInt();
			System.out.println("請輸入y的值");
			ary[1] = sc.nextInt();
			System.out.println(ary[0]+"的"+ary[1]+"次方等於"+c.powerXY(ary[0], ary[1]));
			i++;			
			}catch(Exception e) {
				System.out.println("輸入格式不正確");
				sc.next();
			}			
		}		
	}
}
