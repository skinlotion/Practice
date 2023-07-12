package exercise_class;

//클래스 생성
class Human1{
String name;
int age;
}

public class Review10_JVM {
	
	// 매서드를 생성
	static void function(int age1, Human1 you) {
		age1 =30;
		you.age = 30;
	}
	

	
	public static void main(String[] args) {
		
		Human1 you = new Human1();
		you.name = "홍길동";
		you.age = 20;
		
		String name = "홍길순";
		int age = 20;
		
		
		function(age, you);
		System.out.println(name);
		System.out.println(age);
		System.out.println(you.age);
		

	}

}
