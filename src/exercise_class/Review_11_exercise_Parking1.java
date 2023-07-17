package exercise_class;

import java.util.Scanner;

//실습1

//주차장 관리 프로그램 만들기

//1기능 : 주차 등록
//2기능 : 주차 확인
//3기능 : 출차
//4기능 : 여유공간 확인

//<정보>
//관리 데이터 : 차량번호, 주차공간, 층수, 차종, 입차 시간, 출차 시간, 요금
//층수 10층, 층 당 30대 추가 공간, 차종 : 경차, 중대형, SUV  
//요금 : 경차: 1000, 중대형: 1500, SUV: 2000

//차량높이, 장애인(임산부, 노약자, 유공자) 주차공간, 장기주차, 전기차, 주차시간당 할인, 제휴할인, 무료 조건

class ParkingSpace{

	String registNumber;
	String type;
	int getInTime;
	int layer;
	int space;
}

public class Review_11_exercise_Parking1 {
	
	ParkingSpace[][] PARKIN_SPACES = new ParkingSpace[10][30];

	public static void main(String[] args) {
		
		while (true) {
			int selctMethod = input();
			if (selctMethod == -1) continue;
			if (selctMethod == 0) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			if (selctMethod == 1) {}
			if (selctMethod == 2) {}
			if (selctMethod == 3) {}
			if (selctMethod == 4) {}
			if (selctMethod == 5) {}				
		}
		
	}
	
	// 검색기능
	static int input() {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("작업을 선택하세요 (1.전체 주차공간 2.층 별 주차공간, 3.입차, 4.차량확인, 5.출차, 0.종료) : ");

		int selctMethod = -1;
		
		try {
			selctMethod = scanner.nextInt();
		} catch (Exception e) {
			System.out.println("잘못된 출력 입니다.");
			return -1;
		}
		boolean vaildInput = selctMethod < 0 || selctMethod > 5 ;
		
		if(vaildInput) {
			System.out.println("잘못된 출력 입니다.");
			return -1;
		}
		return selctMethod;
	}
	
	//1번 기능_전체 주차공간 확인
	static void getAllFreeSpace() {
		
	}
	
}