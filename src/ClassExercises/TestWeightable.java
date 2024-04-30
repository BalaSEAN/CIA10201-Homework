package hw1;

public class TestWeightable {
	public static void main(String[] args) {
		Weightable[] w = new Weightable[3];
		w[0] = new Dog("Dog", 10);
		w[1] = new Plane("747", 2000);
		w[2] = new Powder("blue", 0.1);
		
		for(int i=0; i<w.length;i++) {
			w[i].printWeightTool();
			System.out.println("===");
		}
		
	}
}
