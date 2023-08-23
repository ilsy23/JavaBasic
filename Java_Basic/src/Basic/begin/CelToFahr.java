package Basic.begin;

import java.util.Scanner;

public class CelToFahr {

	public static void main(String[] args) {

		/*
        사용자에게 섭씨온도를 입력받아서
        화씨온도로 변환하여 출력하는 로직을 작성하세요.
        화씨 온도는 소수점 첫째 자리까지 표현해 주시기 바랍니다.
        # ㄹ 한자 7 -> (℃),   ㄹ 한자 다음장 4 -> (℉)
        */
		
		//scanner 호출
		Scanner sc = new Scanner(System.in);
		
		//온도 입력 받기
		System.out.print("온도를 입력하세요(℃): ");
		double cel = sc.nextDouble();
		
		//화씨 변환 공식
		double fahr = cel * 9 / 5 + 32; //양변 데이터 타입 주의해서 살펴보기
		
		//출력
		System.out.println("---------------------");
		System.out.printf("섭씨온도: %.1f ℃\n화씨온도: %.1f ℉\n", 
				cel, fahr);// 포맷팅 서식 문자: %d(정수) %f(실수) %s(문자열)
						   //소수점 자릿수 지정: %.N(자릿수)f
		System.out.println("---------------------");
		
		sc.close();
		
	}

}
