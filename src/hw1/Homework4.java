package hw1;
import java.util.Scanner;
public class Homework4 {
	
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
		
//		請建立一個字串，經過程式執行後，輸入結果是反過來的
//		例如String s = “Hello World”，執行結果即為dlroW olleH
		System.out.println(reverse("Hello World"));
		
//		有個字串陣列如下 (八大行星)：
//		{"mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune"}
//		請用程式計算出這陣列裡面共有多少個母音(a, e, i, o, u)
		String	[]planets ={"mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune"};
		System.out.println(count(planets));
	
//		請設計一個程式,可以讓小華輸入欲借的金額後,便會顯示哪些員工編號的同事有錢可借他;
//		並且統計有錢可借的總人數:例如輸入 1000 就顯示「有錢可借的員工編號: 25 19 27 共 3 人!」
		int emp[][]= {{25, 32,8,19,27},{2500, 800, 500, 1000, 1200}};
		Scanner borrowMoney = new Scanner(System.in);
		System.out.println("輸入想借的金額");
		int money = borrowMoney.nextInt();
		int empno =0;
		int num =0;		
		for(int i =0;i<emp.length;i++) {	
			if(emp[1][i]>=money) {
				empno+=emp[0][i];
			}			
			for(int j =0;j<emp[i].length;j++) {					
				if(money<=emp[i][j]) {
					num++;					
				}				
			}
			
		}
		System.out.println("有錢可借的員工編號:"+empno);
		System.out.println("共"+num+"人");
	}
	

	
	
}
