package Basic.constate;

import java.util.Scanner;

public class SwitchExample1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("성별을 입력하세요.(M/F)");
		System.out.print("> ");
		String gender = sc.next();
		
		switch(gender) {
		
		/*
        switch(기준값) 괄호 안에 지정한 기준값에 따라 
        만족하는 case문을 순서대로 탐색합니다.
        적합한 case가 존재하는 경우에는 해당 case에
        종속된 문장을 실행합니다.
        따로 조치가 없다면 나머지 케이스들이 연속적으로 실행됩니다.
        */
		
		case "ㅡ": case "m": case "M":
			System.out.println("남성입니다.");
			break; //해당 케이스만 실행하고 switch문을 종료합니다.
				   //break를 하지 않으면 switch문을 나오지 않고 계속 진행됩니다.
		
		case "F": case "f": case "ㄹ":
			System.out.println("여성입니다.");
			break;
			
		default: //case를 설정하지 않은 값들은 모두 default로 빠집니다.
			System.out.println("잘못된 입력입니다.");
			
		}
		
		sc.close();
	}

}
