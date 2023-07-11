package exercise_class;

public class Review7_3preactice {

	public static void main(String[] args) {
		/*실습
		 * 반복 횟수를 60이 되게해라
		 * 1교시
		 * 		1분
		 * 		2분
		 * 		...
		 * 		50분
		 * 		10분 쉬는시간
		 * 		1분
		 * 		...
		 * 		10분
		 * 2교시
		 *  	1분
		 * 		2분
		 * 		...
		 * 		50분
		 * 		10분 쉬는시간
		 * 		1분
		 * 		...
		 * 		10분
		 *3교시
		 *  	1분
		 * 		2분
		 * 		...
		 * 		50분
		 * 		10분 쉬는시간
		 * 		1분
		 * 		...
		 * 		10분 
		 * 4교시
		 *  	1분
		 * 		2분
		 * 		...
		 * 		50분
		 * 		10분 쉬는시간
		 * 		1분
		 * 		...
		 * 		10분
		 */
		
		//for 문을 통해서
		for (int classTime = 0; classTime < 4; classTime++) {
			System.out.println(classTime + 1 + "교시");
			for (int classMinute = 0; classMinute < 60; classMinute++) {
				System.out.println(classMinute + 1 + "분");
				if (classMinute == 50) {
					System.out.println("10분 쉬는시간");
				}
				if (classMinute > 50) {
					for (int restTime = 0; restTime < 10; restTime++) {
						System.out.println(restTime + 1 + "분");
					}
				}
			}
		}
		
		// while문을 통해

		
	}

}
