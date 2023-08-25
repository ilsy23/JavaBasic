package Basic.constate;

import java.util.Scanner;

public class IfQuiz03 {

	public static void main(String[] args) {

		/*
         - 정수 3개를 입력 받습니다.
         - 가장 큰 값, 가장 작은 값, 중간값을 구해서 출력해 보세요.

         # max, mid, min이라는 변수를 미리 선언하셔서
          판별이 될 때마다 각각의 변수에 값을 넣어줍니다.
          마지막에 한번에 출력하시면 되겠습니다.
		 */

		Scanner sc = new Scanner(System.in);

		System.out.println("정수 1: ");
		int num1 = sc.nextInt();
		System.out.println("정수 2: ");
		int num2 = sc.nextInt();
		System.out.println("정수 3: ");
		int num3 = sc.nextInt();

		int max, mid, min;
		

		if(num1>num2 && num1>num3) {
			max = num1;
		}else if(num2>num3) {
			max = num2;
		}else {
			max = num3;
		}
		if(num1<num2 && num1<num3) {
			min = num1;
		}else if(num2<num3) {
			min = num2;
		}else {
			min = num3;
		}
		mid = num1 + num2 + num3 - max -min;



		/*
		 if(num1 > num2 && num1 > num3) {
			max = num1;
			if(num2 > num3) {
				mid = num2; min = num3;
			} else {
				mid = num3; min = num2;
			}
		}else if(num2 > num1 && num2 > num3) {
			max = num2;
			if(num1 > num3) {
				mid = num1;
				min = num3;
			} else {
				mid = num3;
				min = num1;
			}
		} else {
			max = num3;
			if(num1 > num2){
				mid = num1; min = num2;
			} else {
				mid = num2; min = num1;
			}

		}
		 */

		System.out.printf("가장 큰 값: %d\n가장 작은 값: %d\n중간값: %d",
				max, min, mid);


		sc.close();


	}

}
