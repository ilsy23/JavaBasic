package oop.encap.good;

public class MainClass {

	public static void main(String[] args) {

		MyBirth my = new MyBirth();
//		my.year = 1992; (x)
		my.setYear(12345682);
		my.setYear(1992);
		my.setMonth(10);
		my.setDay(13);
		System.out.printf("내 생일은 %d년 %d월 %d일 입니다.\n"
				, my.getYear(), my.getMonth(), my.getDay());
		
		System.out.println();
		
		my.setYear(2023);
		my.setMonth(1);
		my.setDay(31);
		
		my.birthInfo();
		my.isValidateMonth();
		my.setDay(31);
		my.isValidateMonth();
		my.birthInfo();
		
		
	}

}
