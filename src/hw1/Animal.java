package hw1;

public class Animal {
	private int age;
	private float weight;
	//再把無參數建構子宣告回來
	public Animal() {
		//1.保留給子類別super呼叫的彈性
		//2.無參數建構子也是Java Bean 的規範之一
		//3.給日後搭配的框架呼叫使用(框架幫我們建立物件就是呼叫此建構子)
	}
	public Animal(int age, float weight) {
		this.age=age;
		this.weight=weight;
	}
	
	public void speak() {
		System.out.println("年齡:"+age+"\n體重:"+weight);
	}
	public void setAge(int age) {	//用getter/setter存取私人的變數
		this.age= age;	//實體變數前要加this.讓java可以區分跟實體變數命名一樣的區域變數		
	}
	public void setWeight(float weight) {
		this.weight= weight;		
	}
	public int getAge() {
		return age;
	}
	public float getWeight() {
		return weight;
	}
}
