package Basic.array;

public class Array2DQuiz {

	public static void main(String[] args) {

		int[][] score = {
                {79, 80, 99}, //A학생
                {95, 85, 89}, //B학생
                {90, 65, 56}, //C학생
                {69, 78, 77}  //D학생
                //과목: 3과목
        };
        String[] stuName = {"A학생", "B학생", "C학생", "D학생"};
        String[] subName = {"국어", "영어", "수학"};
		
        /*
        1. 각 학생의 평균을 소수점 첫째 자리까지 출력해 보세요.
        2. 각 과목의 평균을 출력해 보세요.
        3. 반 평균을 출력해 보세요. (모든 학생들의 평균을 더해서 학생수로 나누기)
        */
        double total = 0.0;
        for(int i=0; i<score.length; i++) {
        	int[] student = score[i];
        	int sum = 0;
        	for(int j=0; j<student.length; j++) {
        		sum += student[j];
        		total += student[j];
        	}
        	System.out.printf("%s 평균: %.1f점\n",stuName[i], (double)sum / subName.length);
        }
        System.out.println();
        
        
        for(int j=0; j<subName.length; j++) {
        	int sum = 0;
        	for(int i=0; i<score.length; i++) {
            	sum += score[i][j];
            }
        	System.out.printf("%s 평균: %.1f점\n", subName[j], (double)sum / stuName.length);
        }
        System.out.println();
        
        

		System.out.printf("반 평균: %.1f점",total/(subName.length*stuName.length));
	}

}
