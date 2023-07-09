package exercise_class;

public class Review2_Method {

	
	
	public static int add(int n1, int n2) {
	int result = n1 + n2;
	return result;
	}
	

	public static void test1() {
		System.out.println("test1 메소드 출력");
	}
	
	public static void test2(int num) {
		System.out.println("test2 메소드 출력");
		System.out.println("num : " + num);
	}
	
	public static void test3(int num1, int num2) {
		System.out.println("test2 메소드 출력");
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
	}	
	
	public static int test4() {
		System.out.println("test4 메소드 출력");
		return 100;
		
	}
	public static String test5(String name, int index) {
		System.out.println("test5 메소드 출력");
		System.out.println("name : " + name);
		System.out.println("index : " + index);
		return name + index;
	}	
	
	public static String juice(String fruit, String fruit2) {
		System.out.println("과일 생성 중1");
		return fruit +"+"+ fruit2 + "주스";
	}
	
	public static String juice(int num, String fruit2) {
		System.out.println("과일 생성 중2");
		return num + fruit2 + "주스";
	}
	
	public static String juice(String fruit, int num) {
		System.out.println("과일 생성 중3");
		return num + fruit + "주스";
	}
	
	public static String juice(String fruit, int num, String fruit2, int num2 ) {
		System.out.println("과일 생성 중4");
		System.out.println("과일 생성 중4");
		return "1번 주스 : " + fruit + "주스"+ num + "\n" + "2번 주스 : " + fruit2 + "주스" + num2;
	}

	public static int calculator(int num1, int num2) {
		System.out.println("계산중 입니다.");
		return num1 + num2;
	}

	
	public static void main(String[] args) {

System.out.println("Q1. add 메소드 생성");		
// Q1. add 라는 새로운 매소드를 만들고 두 수를 더해라
		
		int num1 = 10;
		int num2 = 20;
		
		int sum = add(num1, num2);
		
		System.out.println(num1 + "+" + num2 + "=" + sum);	

		
System.out.println("\nQ2. 메소드를 추가하여 문자 출력");
//Q2. 메소드를 추가하여 문자 출력
//	  *리턴값이 없는 메소드 => void
//	  *리턴값이 없는 메소드 => void

		test1();
		test2(30);
		test3(20,50);
		test4();
		System.out.println(test4());
		test5("박진우", 1);
		System.out.println(test5("박진우", 1));
		

System.out.println("\nQ3. 메소드 오버로딩");		
//Q3. 메소드 오버로딩		
		
	System.out.println(juice(1, "오렌지"));
	System.out.println(juice("오렌지", 1));
	System.out.println(juice("오렌지", "키위"));
	System.out.println(juice("오렌지", 2, "키위",3));

System.out.println("\nQ3. 메소드 연산");
//Q4. 메소드 연산
	System.out.println(calculator(2, 3));
	

	}
	
} 
