package oop.obj_arr;

import java.util.Arrays;

public class MainClass {

	public static void main(String[] args) {

//		Person kim = new Person("김철수", 32, "남자");
//		Person lee = new Person("이명희", 25, "여자");
//		Person park = new Person("박뽀삐", 50, "남자");
//		
//		kim.personInfo();
//		lee.personInfo();
//		park.personInfo();
		
//		Person[] ppl = new Person[3];
//		ppl[0] = new Person("김철수", 32, "남자");
//		ppl[1] = new Person("이명희", 25, "여자");
//		ppl[2] = new Person("박뽀삐", 50, "남자");
		
//		int[] arr = {1, 2, 3, 4, 5};
		Person[] ppl = {
				new Person("김철수", 32, "남자"),
				new Person("이명희", 25, "여자"),
				new Person("박뽀삐", 50, "남자")
		};
		
//		System.out.println(Arrays.toString(ppl)); //객체의 주소값이 들어있음.
		
//		for(int i=0; i<ppl.length; i++) {
//			ppl[i].personInfo();
//		}
		
		for(Person p : ppl) {
			p.personInfo();
		}
	}

}
