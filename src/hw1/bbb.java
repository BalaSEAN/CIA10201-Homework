package hw1;

public class bbb {
	public static void main(String[] args) {
//		阿文很熱衷大樂透 (1 ～ 49)，但他不喜歡有4的數字，不論是個位數或是十位數。
//		請設計一隻程式，輸出結果為阿文可以選擇的數字有哪些？總共有幾個？
		int total = 0;
		for(int i=1;i<=49;i++) {
			int n1 = i/4;
			int n2 = i%10;
			if(n1>=10||n2==4) {
				continue;
			}
			System.out.print(i+" ");
			total++;
		}
		System.out.print("\n"+total);
	}
}
