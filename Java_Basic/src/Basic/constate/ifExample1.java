package Basic.constate;

import java.util.Scanner;

public class ifExample1 {

	public static void main(String[] args) {
		
		//Scanner 불러오기
		Scanner sc = new Scanner(System.in);
		
		//점수 입력받기
		System.out.print("점수를 입력하세요: ");
		int point = sc.nextInt();
		System.out.println("내 점수: " + point + "점");
		System.out.println("--------------------------");
		
		//if문 시작
		if(point >= 70) {
			System.out.println("70점 이상입니다.");
			System.out.println("합격하셨습니다!");
		} else {
			System.out.println("70점 미만입니다.");
			System.out.println("불합격하셨습니다 ㅜㅜ");
		}
		
		//if문 밖에서 출력 -> if문 여부와 상관없이 출력됨.
		System.out.println("시험 치르느라 수고하셨습니다!");
		
		//Scanner 닫기
		sc.close();
	}
}
