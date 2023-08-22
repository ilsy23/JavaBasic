package Basic.casting;

public class CastingExample2 {

	public static void main(String[] args) {

		/*
        - 크기가 큰 데이터 타입의 값을 작은 데이터 타입으로 변환하려면
         반드시 형 변환 연산자: (type)를 사용하여 명시적으로
         형 변환을 진행해 주셔야 합니다. (DownCasting)
         (type: 들어가려는 데이터 타입)
         
        - 명시적으로 형 변환을 해야 하는 이유는, DownCasting의 경우
         저장 공간이 줄어들어 데이터 손실의 가능성이 항상 존재하기 때문입니다.
         (overflow, underflow)
        */
		
		int i = 72;
		char c = (char) i;
		System.out.println("72의 문자값:" + c);
		
		double d = 4.98765;
		int j = (int) d;
		System.out.println("여러분들의 이번 달 월급:" + j*1000000);
		
		int k = 1000;
		byte b = (byte) k;
		System.out.println(b); 
		//-24 -> 넘치는 앞의 4자리는 삭제하고 남은 8자리 수의 값
		//		맨 앞자리는 0(양수)/1(음수) 표시
	}

}
