package hw1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Homework7 {
	public static void main(String[]args) {		
		int countChar = 0;
		int countLine = 0;		
		try {
			File sp = new File("Sample.txt");
			FileReader fr = new FileReader(sp);
			BufferedReader br = new BufferedReader(fr);
			String data;
			
			while((data=br.readLine())!=null) {			
				countChar += data.length();
				countLine++;
				
			}
			
			System.out.println(
					sp.getName()+"檔案共有"+sp.length()+"個位元組"
					+countChar+"個字元"+countLine+"列資料"
					);
			
			br.close();
			fr.close();
		}catch(IOException e){
			
		}
	}
}
