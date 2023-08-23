package Basic.loop;

public class WhileExample2 {

	public static void main(String[] args) {

		//48 ~150사이의 정수 중 8의 배수만가로로 출력해 보세요.
		
		int n = 48; //begin
		
		while(n <= 150) {//end
			if(n % 8 == 0) {
				System.out.print(n + " ");
			}
			n++;//step
		}
		
		System.out.println(); //단순 줄 개행
		
		int i = 48;
		while(i <= 150) {
			System.out.print(i + " ");
			i += 8;
		}
		
		System.out.println();
		
		//1~100까지의 정수 중 4의 배수이면서
		//8의 배수는 아닌 수를 가로로 출력해 보세요.
		
		/*int x = 1;
		while(x <= 100) {
			if(x % 4 == 0) {
				if(x % 8 != 0) {
					System.out.print(x + " ");
				}
			}
			x++;
		}*/
		
		//간결하게 표현하려면 if중첩문보다 논리연산자 활용
		int x = 1;
		while(x <= 100) {
			if(x % 4 == 0 && x % 8 != 0) {
					System.out.print(x + " ");
			}
			x++;
		}
		
		System.out.println();
		
		//1~30000까지의 정수 중 258의 배수의 개수를 출력.
		int y = 1;
		int count = 0;
		while(y <= 30000) {
			if(y % 258 == 0) {
				count++;
			}
			y++;
		}
		System.out.println("1 ~ 30000중 258의 배수의 개수:" + count +"개");
		
		int z = 30000 / 258;
		System.out.println(z);
		
		//1000의 약수의 개수를 구하세요.
		int m = 1;
		int cnt = 0;
		while(m <= 1000) {
			if(1000 % m == 0) {
				cnt++;
			}
			m++;
		}
		System.out.println("1000의 약수의 개수:" + cnt +"개");
		
	}

}
