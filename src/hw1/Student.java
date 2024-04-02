package hw1;

public class Student {
	int score = 90;
	
	public void play(int hours) {
		score -= hours;		
	}
	
	public void study(int hours) {
		score += hours;		
	}	
	public static void main(String[] args) {
		
		Student student1 = new Student();
		Student student2 = new Student();
		
		student1.play(10);
		student1.study(2);
		
		student2.study(5);
		student2.play(1);
		
		System.out.println(student1.score);
		System.out.println(student2.score);
		
		
	}

}
