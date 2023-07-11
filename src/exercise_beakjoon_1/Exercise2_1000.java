package exercise_beakjoon_1;

import java.util.Scanner;

public class Exercise2_1000 {

	public static void main(String[] args) {

		/*
		 * 문제번호 1000번
		 * 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 만드시오.
		 * 
		 * 
		 */
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("첫 번째 숫자를 입력하세요 : ");
		int A = scanner.nextInt();
		System.out.print("두 번째 숫자를 입력하세요 : ");
		int B = scanner.nextInt();
		
		int result = A + B;
		System.out.println(result);
		
		
		
		
		
	}

}
