package Basic.constate;

import java.util.Scanner;

public class ifExample2 {

	public static void main(String[] args) {

		//Scanner 불러오기
		Scanner sc = new Scanner(System.in);
		
		//나이 입력받기
		System.out.print("나이를 입력하세요: ");
		int age = sc.nextInt();
		
		//if문
		if(age >= 20) {
			System.out.println("성인입니다.");
		} else if(age >= 17){
			System.out.println("고등학생입니다.");
		} else if(age >= 14) {
			System.out.println("중학생입니다.");
		} else if(age >= 8) {
			System.out.println("초등학생입니다.");
		} else {
			System.out.println("미취학 아동입니다.");
		}
		
		//Scanner 닫기
		sc.close();
		
	}

}
