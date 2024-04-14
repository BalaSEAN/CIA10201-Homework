package hw1;
import java.util.Scanner;
public class Homework4 {
	public static int totalDayOfYear(int y, int m, int d) {	//計算該年第幾天的方法
		int dayOfMonth[]= {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		if((y%4==0 && y%100 != 0) || (y%400 == 0)){	//若是閏年時2月改為29天
			dayOfMonth[1]=29;
		}	
		if(d>dayOfMonth[m-1]) {			
			System.out.println("日期不該超過 "+dayOfMonth[m-1] +"天");
			return -1;	//超過合理天數時回傳-1
		}
		int dayOfYear = 0;					
		for(int i=0;i<(m-1);i++) {
			dayOfYear += dayOfMonth[i];
		}
		dayOfYear+=d;		
		return dayOfYear;
	}
	
	public static int count(String []array) {	//計算出八大行星母音的方法		
		int sum =0;
		for(int i=0;i<array.length;i++) {	//每個字串母音數量的總和
			for(int j=0;j<array[i].length();j++) {	//字串中母音的字元數量總和
				char w = array[i].charAt(j);
				if(w=='a' || w=='e' || w=='i' || w=='o' || w=='u') {
					sum++;
				}
			}
		}
		return sum;
	}
	
	public static String reverse(String hw) {	//反轉字串排列的方法
		String s1 ="";
		for(int i= hw.length()-1;i>=0;i-- ) {
			s1+=hw.charAt(i); 
		}
		return s1;
	}
	
	public static void main(String[]args) {
//		有個一維陣列如下：
//		{29, 100, 39, 41, 50, 8, 66, 77, 95, 15}
//		請寫出一隻程式能輸出此陣列所有元素的平均值與大於平均值的元素
		int array[] = {29, 100, 39, 41, 50, 8, 66, 77, 95, 15};
		int sum =0;
		for(int i=0;i<array.length;i++) {	//算出陣列內所有元素的總和
			sum+=array[i];				
		}
		double avg =sum/array.length;	//總和除以陣列長度=平均值
		System.out.println(avg);
		for(int i=0;i<array.length;i++) {	//
			if(array[i]>avg) {
				System.out.print(array[i]+" ");
			}
		}
		System.out.println();

//		請建立一個字串，經過程式執行後，輸入結果是反過來的
//		例如String s = “Hello World”，執行結果即為dlroW olleH
		System.out.println(reverse("Hello World"));
		
//		有個字串陣列如下 (八大行星)：
//		{"mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune"}
//		請用程式計算出這陣列裡面共有多少個母音(a, e, i, o, u)
		String []planets ={"mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune"};
		System.out.println(count(planets));
	
//		請設計一個程式,可以讓小華輸入欲借的金額後,便會顯示哪些員工編號的同事有錢可借他;
//		並且統計有錢可借的總人數:例如輸入 1000 就顯示「有錢可借的員工編號: 25 19 27 共 3 人!」		
		int emp[][]= {{25, 32,8,19,27},{2500, 800, 500, 1000, 1200}};
		Scanner borrowMoney = new Scanner(System.in);	
		System.out.println("輸入想借的金額");
		int money = borrowMoney.nextInt();
		int empno[] = new int[5];
		int num =0;		
		for(int i = 0; i < emp[0].length; i++) {    
		    if(money <= emp[1][i]) {
		    	empno[num]= emp[0][i]; // 找到符合條件的員工編號
		        num++; // 增加符合條件的員工數量
		    }
		}
		System.out.print("有錢可借的員工編號:");
		for(int i = 0; i < num; i++) {	//取出員工編號
	        System.out.print(empno[i] + " ");
	    }
		System.out.println("共 "+num+" 人");
		
		//請設計由鍵盤輸入三個整數，分別代表西元yyyy年，mm月，dd日，執行後會顯示是該年的第幾天		
		Scanner year = new Scanner(System.in);
		Scanner month = new Scanner(System.in);
		Scanner day = new Scanner(System.in);
		System.out.println("請輸入三個整數，分別代表西元yyyy年，mm月，dd日");
		int y = year.nextInt();
		int m = month.nextInt();
		int d = day.nextInt();
			
		int totalDay = totalDayOfYear(y, m, d);
		if(totalDay != -1) {
			System.out.println("輸入的日期為該年的第 "+totalDay+"天");
		} 
		
		//班上有8位同學，他們進行了6次考試結果如下：請算出每位同學考最高分的次數
			int [][] score= {{10, 37,100, 77, 98, 90},
							 {35, 75, 70, 95, 70, 80},
							 {40, 77, 79, 70, 89,100},
							 {100,89, 90, 89, 90, 75},
							 {90, 64, 75, 60, 75, 50},
							 {85, 75, 70, 75, 90, 20},
							 {75, 70, 79, 85, 89, 99},
							 {70, 95, 90, 89, 90, 75}};
			int []student =new int[8];	//保存每個學生得最高分次數的陣列
			for(int i=0; i<6;i++) {
				int maxScore = score[0][i];
				for(int j=1; j<8; j++ ) {	
					if(score[j][i]>maxScore) {	//第二次之後的成績如果大於第一次
						maxScore = score[j][i];	//每一次考試的最高分
					}
				}
				for(int j=0; j<8;j++) {
					if(score[j][i] == maxScore) {
						student[j]++;	//累加最高分次數
					}
				}			
			}
			for(int j=0; j<8; j++) {
				System.out.println((j+1)+" 號同學最高分次數為 "+ student[j]);
			}
	}	
}
