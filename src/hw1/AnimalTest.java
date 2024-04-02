package hw1;
//建立一個class，名為Animal.java
//• 此類別有兩個成員變數分別為age(年紀 - 型別int)、weight(體重 - 型別float)
//• 此類別需宣告有參數的建構子
//• 有一成員方法名為speak()，用以列印上述兩個值
//• 在main()裡藉由建構子產生一個Animal，同時初始化該物件的年紀和體重分別為2歲、5.0
//公斤，並呼叫speak方法得到此Animal的成員變數值

public class AnimalTest {
	public static void main(String[] args) {
		Animal aw = new Animal(2,5.0f);		
		aw.speak();
		System.out.println("=============");
		aw.setAge(3);
		aw.setWeight(8.0f);
		aw.speak();
		System.out.println("=============");
		Elephant e1 = new Elephant(10, 1000.0f, "大象");
		e1.speak();
		System.out.println("=============");
		e1.setAge(15);
		e1.setWeight(100);
		e1.setName("Monkey");
		e1.speak();
	}
}
