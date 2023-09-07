package etc.api.lang.wrapper;

import java.time.LocalDateTime;
import java.util.Scanner;

public class ParseQuiz {

	public static boolean isValid(String idNum){
		try {
			if(idNum.length() != 14 || idNum.charAt(6) != '-') throw new Exception();
			idNum = idNum.replace("-", "");
			long checkNum = Long.parseLong(idNum);
			checkNum = Long.parseLong(idNum.substring(6, 7));
			if(checkNum == 0 || checkNum > 4) throw new Exception();
			return true;
		}catch(Exception e){
			System.out.println("다시 입력해 주세요.");
			return false;
		}
	}
	
	
	private static String[] processNum(String idNum) {
		String[] info = new String[5];
		
		char gender = idNum.charAt(7);
		
		switch(gender) {
		case '1': case '3':
			info[4] = "남자";
			break;
		case '2' : case '4':
			info[4] = "여자";
			break;
		}
		
		String year = idNum.substring(0,2);
		int y = Integer.parseInt(year);
		int now = LocalDateTime.now().getYear();
		int age = 0;
		switch(gender) {
		case '1': case '2':
			info[0] = "19" + year;
			age = now - (1900 + y);
			info[3] = Integer.toString(age);
			break;
		case '3': case '4':
			info[0] = "20" + year;
			age = now - (2000 + y);
			info[3] = Integer.toString(age);
			break;
		}
		
		info[1] = idNum.substring(2, 4);
		info[2] = idNum.substring(4, 6);
		
		return info;
	}
	
	public static void printInfo(String idNum) {
		
		String[] info = processNum(idNum);
		
		System.out.printf("출력값: %s년 %s월 %s일 %s세 %s",
				info[0],
				info[1],
				info[2],
				info[3],
				info[4]);
		
	}


	public static void main(String[] args) {
		/*
			주민등록번호를 입력받아서 다음과 같은 정보를 추출하여 출력합니다.

			ex) 입력값: 921013-1234567
			출력값: 1992년 10월 13일 31세 남자 

			입력값: 040906-4123456
			출력값: 2004년 9월 6일 19세 여자 

			입력값은 하이픈이 포함된 문자열이어야 합니다. 
			하이픈이 포함되어 있지 않거나, 주민등록번호 뒷자리 첫번째 숫자가 1,2,3,4가 아닐 시에는 다시 입력받아야 합니다.
			또한 하이픈을 제외한 값이 숫자가 아닐 시에도 다시 입력받아 주시면 됩니다.
		 */

		Scanner sc = new Scanner(System.in);


		while(true) {

			System.out.print("주민등록번호(-포함): ");
			String idNum = sc.next();
			
			if(isValid(idNum)) {
				printInfo(idNum);
				break;
			}
			

		}

		sc.close();

	}
}
