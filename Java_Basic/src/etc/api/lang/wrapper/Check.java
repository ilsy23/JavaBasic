package etc.api.lang.wrapper;

import java.time.LocalDateTime;

public class Check {

	public static void main(String[] args) {

			String idNum = "123456-2234567";
			String year = idNum.substring(0,2);
			int y = Integer.parseInt(year);
			int now = LocalDateTime.now().getYear();
			System.out.println(now);
		
			

		
	}

}
