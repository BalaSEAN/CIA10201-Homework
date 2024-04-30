package hw1;

import java.io.File;

public class Homework7 {
	public static void main(String[]args) {
		File f1 = new File("c:\\Sample.txt");
		System.out.println(
				f1.getName()+"檔案共有"+f1.length()+"個位元組");
	}
}
