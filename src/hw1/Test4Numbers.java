package hw1;

public class Test4Numbers {
	public static void main(String[] args) {
		int count = 0;
		while(count<=100){
			if(count%4==0){
				System.out.print(count+" ");
			}
			count++;
		}
		
		System.out.println();
		
		for(int count1=0;count1<=100;count1++){
			if(count1%4==0){
				System.out.print(count1+" ");
			}
		}
		
		System.out.println();
		
		for(int count1=0;count1<=100;count1+=4){
				System.out.print(count1+" ");
		}
	}

}
