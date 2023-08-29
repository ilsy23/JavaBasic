package oop.string;

import java.util.Scanner;

public class StringQuiz02 {

	public static void main(String[] args) {

		/*
        1. 주민등록번호 13자리를 입력받습니다.
        2. 주민등록번호는 -을 포함해서 받을 예정입니다.
        3. 13자리가 아니라면 다시 입력받습니다.
        4. 남자인지 여자인지를 구분해서 출력해 주시면 됩니다.
        */
		Scanner sc = new Scanner(System.in);
		
		outer: while(true) {
			System.out.println("주민등록번호 13자리를 입력하세요.");
			System.out.println("-을 포함해서 입력하세요.");
			System.out.println("> ");
			String idNum = sc.next();
			
			idNum = idNum.replace("-", "");
			if(idNum.length() != 13) {
				System.out.println("잘못 입력하셨습니다.");
			}else {
				switch(idNum.charAt(6)){
				case '1': case '3':
					System.out.println("남자");
					break outer;
				case '2': case '4':
					System.out.println("여자");
					break outer;
				default:
					System.out.println("잘못 입력하셨습니다.");
				}
			}
			
		}
		
		sc.close();
	}

}
