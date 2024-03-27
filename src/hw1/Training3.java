package hw1;

public class Training3 {
//	請分別建立x, y, z三個3x3的int陣列，然後把x和y陣列的加總存放到z陣列裡，
//	再將結果顯示於螢幕上
//	x和y陣列中的數字：
//	• 請用亂數產生介於0～30之間的整數
//	• 亂數之取得可參考 java.lang.Math的靜態方法 random()
//	• public static double random()	傳回亂數值其範圍為0.0～1.0
//	step 1.建立三個3x3二維陣列
//	step 2.將亂數資料填入到x陣列裡
//	step 3.將亂數資料填入到y陣列裡
//	step 4.將x, y對應位置的元素加總後，填入到z陣列對應的位置
//	step 5.將三個陣列的元素各別顯示出來
	
	public static void main(String[] args) {
		Training3 testArray = new Training3();
		
		int x[][]= testArray.getrandomArray();
		int y[][]= testArray.getrandomArray();			
		int z[][] = new int[3][3];
		
		for(int i =0; i<x.length; i++) {	//i要小於x的列數
			for(int j =0; j<x[i].length; j++) {		//j要小於第x[i]列中整數的數量
				z[i][j]=x[i][j] + y[i][j];
				}		
		}
		testArray.printArray(x);
		testArray.printArray(y);
		testArray.printArray(z);
	}
	public int[][] getrandomArray(){	//產生亂數元素陣列的方法
		int data[][]= new int[3][3];
		for(int i=0;i<data.length;i++) {
			for(int j=0;j<data[i].length;j++) {
				data[i][j]+=(int)(Math.random()*31);
			}
		}
		return data;
	}
	public void printArray(int z[][]) {
		for(int i=0;i<z.length;i++) {
			for(int j=0;j<z[i].length;j++) {
				System.out.print(z[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println("===================");
	}
}
