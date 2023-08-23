package Basic.constate;

import java.util.Scanner;

public class SwitchExample2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
	
		 //90이상 A, 80이상 B, 70이상 C, 60이상 D, 나머지 F
		
		System.out.println("점수를 입력하세요: ");
		int point = sc.nextInt();
		
		switch(point / 10) {//100개의 case를 모두 지정하기는 힘들기 때문에
							//10으로 나누어서 십의 자리수로 판별
		case 10: // 100이외에 (point/8)값도 포함하므로 if문을 통해 분리
			if(point > 100) {
				System.out.println("잘못된 점수입니다.");
				break;
			}//내용이 없으면 굳이 else문 작성하지 않아도 넘어감.
			 //출력값이 같기 때문에 break해서 나가지 않고 case 9로넘어감.
		case 9:
			System.out.println("당신의 학점은 A입니다.");
			break;
		case 8:
			System.out.println("당신의 학점은 B입니다.");
			break;
		case 7:
			System.out.println("당신의 학점은 C입니다.");
			break;
		case 6:
			System.out.println("당신의 학점은 D입니다.");
			break;
		
		default:
			if(point > 100 || point < 0) {
				System.out.println("점수를 잘못입력하셨습니다.");
			} else {
				System.out.println("당신의 학점은 F입니다.");
			}
		
		}
		
		sc.close();
		
		
	}

}
