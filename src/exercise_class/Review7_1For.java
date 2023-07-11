package exercise_class;

public class Review7_1For {

	public static void main(String[] args) {

		// 반복 for문
		// 1) for은 반복횟수가 정해져 있을 때 사용한다.
		// 2) index기분으로 접근하는 for문
		// 		- 배열을 초기화 할 때
		//		- 배열에 접근 할 때
		
		// <for문 사용방법>
		// for (조건에 사용될 변수 초기화; 조건문; 변수 증감식) { 반복할 구문 (실행문) }
		
		// * foreach문 (향상된 for문)
		// for(반복할 배열의 요소타입 변수명 : 반복할 배열) {...}
		// 요소를 기준으로 접근하는 for문
		// foreach구문은 읽기 전용이다.
		// 배열을 초기화하여 사용하는게 아니라 배열을 불러와서 숫자를 대입하는 형태로 사용된다.
		
		
		// 실습1
		/*
		 * 2단
		 * 2 X 1 = 2
		 * 2 X 2 = 4
		 * .
		 * .
		 * .
		 * 2 X 9 = 18
		 * 3단
		 * 3 X 1 =3
		 * .
		 * .
		 * .
		 * 9단
		 *.
		 *.
		 * 9 X 9 = 81
		 */

		
		for (int dan = 0; dan < 9; dan++) {
			System.out.println((dan+2) + "단");
			for (int i = 0; i < 9; i++) {
				int result = (dan+2) * (i+1);
				System.out.println((dan+2) + "X" + (i+1) + "=" + result);
			}
		}
		
		// 실습2
		/* 
		 * str = abcdefghijk
		 * 
		 * str글자들을 짤라서 출력되게해라
		 * a
		 * b
		 * c
		 * d
		 * f
		 * g
		 * h
		 * i
		 * j
		 * k
		 * 
		 */
		String str = "abcdefghijk";
		
		for (int i = 0; i < str.length(); i++) {
			System.out.println(str.substring(i, i+1));
		}
				
		
	}
}
