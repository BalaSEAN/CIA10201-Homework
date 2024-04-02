package hw1;

public class Homework4 {
//	有個一維陣列如下：
//	{29, 100, 39, 41, 50, 8, 66, 77, 95, 15}
//	請寫出一隻程式能輸出此陣列所有元素的平均值與大於平均值的元素
	public static void main(String[]args) {
		int array[] = {29, 100, 39, 41, 50, 8, 66, 77, 95, 15};
		int sum =0;
		for(int i=0;i<array.length;i++) {
			sum+=array[i];	
			
		}
		double avg =sum/array.length;
		System.out.println(avg);
		for(int i=0;i<array.length;i++) {
			if(array[i]>avg) {
				System.out.print(array[i]+" ");
			}
		}
//		請建立一個字串，經過程式執行後，輸入結果是反過來的
//		例如String s = “Hello World”，執行結果即為dlroW olleH
		
	}

	
}
