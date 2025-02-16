package ch05.sec12;

import java.time.DayOfWeek;
import java.util.Calendar;

public class WeekExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 열거타입 변수를 선언
		Week today = null;

		// 열거값 대입
		today = Week.THURSDAY;

		// 컴퓨터의 요일 정보 얻기
		Calendar now = Calendar.getInstance();

		// 오늘의 요일 얻기(1~7)
		int day = now.get(Calendar.DAY_OF_WEEK);

		// 숫자를 열거 상수로 변환해서 변수에 대입
		switch (day) {
		case 1:
			today = Week.SUNDAY;
			break;
		case 2:
			today = Week.MONDAY;
			break;
		case 3:
			today = Week.TUESDAY;
			break;
		case 4:
			today = Week.WEDNEDAY;
			break;
		case 5:
			today = Week.THURSDAY;
			break;
		case 6:
			today = Week.FRIDAY;
			break;
		case 7:
			today = Week.SATURDAY;
			break;
		}

		// 열거값 비교
		System.out.println("오늘은 " + today + " 입니다.");
		if (today == Week.FRIDAY) {
			System.out.println("오늘은 신나는 금요일 입니다");
		} else {
			System.out.println("오늘은 불금이 아닙니다.");
		}
	}

}
