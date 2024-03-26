package hw1;

public class Training1 {
	public static void main(String[] args) {
//		請設計一隻Java程式，計算200顆蛋共是幾打幾顆？ (一打為12顆)	
		int egg = 200;
		System.out.println("蛋總共是 " + egg/ 12 + " 打又 " + egg% 12 + "顆"  );
		
		System.out.println();
//		請由程式算出256559秒為多少天、多少小時、多少分與多少秒
		int totalSec = 256559;
		int remainSec = totalSec% (3600* 24);
		
		int day = totalSec/ (3600* 24);
		int hour = remainSec/ 3600;
		remainSec %= 3600;
		
		int min = remainSec/ 60;
		int sec = remainSec% 60;
		
		System.out.println("256559秒 等於 " + day + "天 " + hour + "小時 " + min + "分 " + sec + "秒 ");
		
		System.out.println();
		//		請定義一個常數為3.1415(圓周率)，並計算半徑為5的圓面積與圓周長
		final double PI = 3.1415;
		int r = 5;
		double area = r* r*PI;
		double cir = r* 2* PI;
		System.out.println("圓面積等於 " + area + " 圓周長等於 " + cir);
		
		System.out.println();
	//		某人在銀行存入150萬，銀行利率為2%，如果每年利息都繼續存入銀行，請用程式計算10年後，本金加利息共有多少錢 (用複利計算，公式請自行google)
		int cost = 1500000;
		double total = cost* Math.pow(1.002, 10);
		System.out.println(String.format("%.3f", total));
		
		System.out.println();
//		請寫一隻程式，利用System.out.println()印出以下三個運算式結果：
//		5 + 5
//		5 + ‘5’
//		5 + “5”
//		並請用註解各別說明答案的產生原因
		System.out.println(5+5);	//兩個5的型別都為整數，所以會輸出相加後的結果。
		System.out.println(5+'5');	//'5'型別為一般字元，所以會先轉換成ASCII碼對應的值(53)與整數的(5)相加後，再輸出運算結果。
		System.out.println(5+"5");  //"5"型別為字串，所以直接會輸出數字的5+字串的5。	
	}

}
