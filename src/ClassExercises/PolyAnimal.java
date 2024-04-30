package hw1;

public class PolyAnimal {
	public static void main(String[] args) {
		Animal[] a = new Animal [3];
		
		a[0]= new Animal(3, 50.0f);
		a[1]= new Elephant(10, 1000.0f, "aaa");
		a[2]= new Elephant(20, 2000.0f, "bbb");
		
		for(int i=0;i<a.length;i++) {
			a[i].speak();
			System.out.println("==========");
			
		}		
	}
}
