package exercise_class;

public class Review1_Operation {
	
	public static void main(String[] args) {
	
// Q1. 50부터 51, 52 53 출력하기
		
// Sol)
		
		int num1 = 50;
		
		System.out.println(++num1);
		System.out.println(++num1);
		System.out.println(++num1);
		
System.out.println();
// Q2. 50부터 50, 51 52 출력하기

// Sol) 
		int num2 = 50;
		
		System.out.println(num2++);
		System.out.println(++num2);
		System.out.println(num2++);
		System.out.println(num2);
		

System.out.println();
// Q3. 50부터 49, 49, 48, 47 출력하기
		
		int num3 = 50;
		
// Sol) 
		System.out.println(--num3);
		System.out.println(num3--);
		System.out.println(num3--);
		System.out.println(num3);
		
System.out.println();		
// Q4. 48, 47 출력하기
		
		int num4 = 50;
				
// Sol) 
		--num4;
		--num4;
		System.out.println(num4--);
		System.out.println(num4);
				
	}
}
