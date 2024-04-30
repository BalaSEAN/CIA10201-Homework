package hw1;

public class Elephant extends Animal{
	private String name;
	
//	public void speak() {
//		super.speak();
//		System.out.println("姓名:"+name);
//	}
	
	public Elephant(int age, float weight, String name) {
		super(age, weight);
		this.name= name;
	}
	// 不會報錯, 因為編譯器理解成overloading(多載)了
		// 1個是speak(int data), 另一個是父類別繼承來的speak()
	// JDK 5 Annotation (標註) : 給Java相關工具或是框架看的資訊
	
		@Override // 讓編譯器對此方法是以override規則去檢查, 只要一有違反規則就會編譯失敗
		public void speak() {
			super.speak();
			System.out.println("Name is " + name);
		}
		
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
}
