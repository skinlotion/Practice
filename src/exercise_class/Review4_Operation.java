package exercise_class;

import java.util.Scanner;

public class Review4_Operation {
	
	public static void main(String[] args) {
	
		System.out.println( 5 < 3);
		boolean result1 = 10 > 5;
		System.out.println(result1);
		
		boolean result2 = 10 == 5;
		System.out.println(result2);
		
		boolean result3 = 10 < 5;
		System.out.println(result3);
		
		
		// 논리연산
		// - boolean 끼리 연산하는 것
		
		// 1) AND 연산 (곱) *&&으로 표현
		//	예) true && true => true
		//	예) true && false => false
		//	예) flase && false => false
		
		// 2) OR 연산 (합) *||으로 표현
		//	예) true || true => true
		//	예) true || false => false
		//	예) flase || false => false

		
		// 3) NOT 연산 (부정) * !으로 표현
		//	예) !true = false
		//	예) !false = true

		
		System.out.println();
		System.out.println(true && false);
		System.out.println(2000 % 4 == 0 && 2000 % 5 == 0 || 2000 % 3 == 0);
		
		int result4 = 10;
		System.out.println(result4);
		result4 = result4 + 10;
		System.out.println(result4);
		result4 += 10;
		System.out.println(result4);
		result4 -= 10;
		System.out.println(result4);
		result4 /= 10;
		System.out.println(result4);
		System.out.println();
		
		//실습1
		
		// 게임 동전 넣기
		// 300원에 목숨 3개인 게임에서 
		
		int money = 1000;
		int life = (money / 300) * 3;
		
		int userLife = 0;
		userLife += life ;
		System.out.println(userLife);
		
		//실습2
		
		// 해당 년이 윤년이면 "윤년이 맞습니다 출력" 아니면 "윤년이 아닙니다" 출력
		// *윤년 = 4의 배수이거나 100의 배수가 아니거나 400의 배수일때 운년이라 한다.
		
		Scanner scanner = new Scanner(System.in);
		
		int year = 0;
	
		
		System.out.print("해당년 : ");
		year = scanner.nextInt();
		
		
		if(year % 4 == 0 && year % 100 == 0) {
			System.out.println("윤년이 맞습니다.");
		}else if (year % 400 == 0 ) {
			System.out.println("윤년이 맞습니다");
		}else {
			System.out.println("윤년이 아닙니다");
		}

		System.out.println();
		int year2 = 0;
		System.out.print("다른방법 해당년 : ");
		year2 = scanner.nextInt();
		
		String result = year2 % 4 == 0 && (year2 % 400 == 0 || year2 % 400 == 0)? "윤년" : "윤년 아님";  
		
		
		
	}

}
