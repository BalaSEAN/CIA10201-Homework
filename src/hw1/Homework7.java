package hw1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Homework7 {
	public static void main(String[]args) {
		//1.
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
			e.printStackTrace();
		}
		
		//2.
		try {
			File data = new File("Data.txt");
			FileWriter fw = new FileWriter(data, true);
			BufferedWriter bw = new BufferedWriter(fw);
			for(int i = 0; i<10; i++) {
				int num = (int)((Math.random()*1000)+1);				
				bw.write(Integer.toString(num));
				bw.newLine();
		}
			
		bw.close();
		fw.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		//3.
		String inputFile = "input.txt";
		String outputFile = "output.txt";		
		copyFile(inputFile, outputFile);
		
		//4.
		File dir = new File("C:\\data");
		if (!dir.exists()) {
			dir.mkdir();
		}
		File file = new File("C:\\data\\Object.ser");
		Dog dog1 = new Dog("AA");
		Dog dog2 = new Dog("BB");
		Cat cat1 = new Cat("CC");
		Cat cat2 = new Cat("DD");
		try {
		FileOutputStream fos = new FileOutputStream(file);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(dog1);
		oos.writeObject(dog2);
		oos.writeObject(cat1);
		oos.writeObject(cat2);
		
		oos.close();
		fos.close();
				
		FileInputStream fis = new FileInputStream(file);
		ObjectInputStream ois = new ObjectInputStream(fis);
		try {
			while (true) {
				((Animal) ois.readObject()).speak();
				System.out.println("--------------------");
			}
		}catch (EOFException e) {
			System.out.println("資料讀取完畢！");
		}catch (ClassNotFoundException e) {			
			e.printStackTrace();
		}
		
		ois.close();
		fis.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	//For 3.
	public static void copyFile(String a, String b) {
		File A = new File(a);
		File B = new File(b);		
		try {
			FileReader fr = new FileReader(A);			
			FileWriter fw = new FileWriter(B);		
			int c;
			while ((c = fr.read()) != -1) {
				fw.write(c);
			}
			fr.close();
			fw.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	
}
//For 4.
class Dog extends Animal {
	private String name;
	
	public Dog(String name) {
		this.name = name;
	}
	
	public void speak() {
		System.out.println("This is Dog " + name + " speaking.");
	}
}
class Cat extends Animal {
	private String name;
	
	public Cat(String name) {
		this.name = name;
	}
	
	public void speak() {
		System.out.println("This is Cat " + name + " speaking!");
	}
	
}
abstract class Animal implements Serializable{
	abstract void speak();
}