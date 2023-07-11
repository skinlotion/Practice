package exercise_class;

import java.util.Scanner;

public class Review8_Method_practice {

	public static int calculator(String name, int num1, int num2) {
		System.out.println("계산중 입니다.");
		int result = 0;
		if(name.equals("+")) {
			result = num1 + num2;
		}else if(name.equals("-")) {
			result = num1 - num2;
		}else if(name.equals("/")) {
			result = num1 / num2;
		}else if(name.equals("*")) {
			result = num1 * num2;
		}else {
			System.out.println("올바르지 않는 계산입니다.");
		}
		return result;
	}
	
	public static void main(String[] args) {

		
		/*
		 * 문제1_계산기를 만들어라
		 * 
		 * 매소드 claculator를 만들고
		 * 
		 * claculator ("기호:, 숫자, 숫자)를 입력하면 연산되게해라
		 * 
		 */
		System.out.println(calculator("+", 1, 7));
		System.out.println(calculator("*", 134, 7));
		System.out.println(calculator("-", 100, 7));
		System.out.println(calculator("/", 100, 7));
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("숫자를 입력하시오 : ");
		int a = 0;
		
	}

}
