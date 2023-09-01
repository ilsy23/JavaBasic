package oop.obj_arr;


/*
     - 이름, 국어, 영어, 수학, 총점, 평균(double)을
      담을 수 있는 객체를 디자인하세요.
      
     - 학생의 모든 정보를 한 눈에 확인할 수 있게
      scoreInfo() 메서드를 선언해 주세요.
      메서드 내부에는 출력문을 이용해서 모든 정보를 출력해 주세요.
      
     - 캡슐화를 구현해서 작성해 주세요. (생성자는 맘대로 하세요.)
    */

public class Score {

	String name;
	int scoreKor;
	int scoreEng;
	int scoreMath;
	int scoreTotal;
	double scoreAvrg;
	
	public void scoreInfo(){
		System.out.printf("***** %s의 성적표 *****\n", name);
		System.out.printf("국어: %d점\n", scoreKor);
		System.out.printf("영어: %d점\n", scoreEng);
		System.out.printf("수학: %d점\n", scoreMath);
		System.out.printf("총점: %d점\n", scoreTotal = scoreKor + scoreEng + scoreMath);
		System.out.printf("평균: %.1f점\n", scoreAvrg = scoreTotal / 3.0);
		
		System.out.println("--------------------");
		
	}
	
}
