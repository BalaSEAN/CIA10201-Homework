package hw1;

import java.util.Scanner;
public class aaa {
	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        // 讓使用者輸入不想要的數字
	        System.out.print("請輸入不想要的一個數字（1～9其中之一）：");
	        int unwantedNumber = scanner.nextInt();

	        // 顯示可選擇的號碼與總數
	        System.out.println("可選擇的號碼有：");
	        int totalCount = 0;
	        for (int i = 1; i <= 49; i++) {
	            int tensDigit = i / 10; // 十位數
	            int unitsDigit = i % 10; // 個位數
	            if (tensDigit != unwantedNumber && unitsDigit != unwantedNumber) {
	                System.out.print(i + " ");
	                totalCount++;
	            }
	        }
	        System.out.println("\n總數：" + totalCount);
    }
}
