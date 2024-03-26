package hw1;

public class Training2 {
	
	public static boolean badNum(int num) {
            int remain = num % 10;
            int dnum = num / 4;
            if (remain == 4 || dnum >=10) {
                return true;
            }       
		return false;
	}
	public static void main(String[] args) {
		System.out.println("\n題目1");
//		1.請設計一隻Java程式，計算1～1000的偶數和 (2+4+6+8+…+1000)
		int total = 0;
		for(int i=2;i<=1000;i+=2) {
			total += i;
			}
		System.out.print(total+" ");	
		
		System.out.println("\n\n題目2");
//		2.請設計一隻Java程式，計算1～10的連乘積 (1*2*3*…*10) (用for迴圈)	
		int total1 = 1;
		for(int j=1;j<=10;j++) {
			total1 *= j;			
			}
		System.out.print(total1+" ");
		
		System.out.println("\n\n題目3");
//		3.請設計一隻Java程式，計算1～10的連乘積 (1*2*3*…*10) (用while迴圈)
		int x = 1;
		int total2 = 1;
		while(x<=10) {
			total2*=x;			
			x++;
		}
		System.out.print(total2+" ");
		
		System.out.println("\n\n題目4");
//		4.請設計一隻Java程式，輸出結果為以下：
//		1 4 9 16 25 36 49 64 81 100
		int total3 = 1;
		for(int y=1;y<=10;y++) {
			total3 = y*y;
			System.out.print(total3+" ");
		}
		System.out.println("\n\n題目5");
//		阿文很熱衷大樂透 (1 ～ 49)，但他不喜歡有4的數字，不論是個位數或是十位數。
//		請設計一隻程式，輸出結果為阿文可以選擇的數字有哪些？總共有幾個？
		
		for(int i = 1;i<=49;i++) {
			if(badNum(i)) {
				continue;
			}
			System.out.print(i+" ");
		}
		
		System.out.println("\n\n題目6");
//		請設計一隻Java程式，輸出結果為以下：
//		1 2 3 4 5 6 7 8 9 10
//		1 2 3 4 5 6 7 8 9
//		1 2 3 4 5 6 7 8
//		1 2 3 4 5 6 7
//		1 2 3 4 5 6
//		1 2 3 4 5
//		1 2 3 4
//		1 2 3
//		1 2
//		1
		for(int i=10;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		System.out.println("\n\n題目7");
//		請設計一隻Java程式，輸出結果為以下：
//		A
//		BB 
//		CCC 
//		DDDD 
//		EEEEE 
//		FFFFFF
		char eng ='A';
		for(int y=1;y<=6;y++) {
			for(int z=1;z<=y;z++){
				System.out.print(eng);
			}
			eng++;
			System.out.println();
		}
	}
}
	
		
		
	



