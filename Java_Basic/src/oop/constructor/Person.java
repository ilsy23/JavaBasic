package oop.constructor;

public class Person {

	String name;
	int age;
	double height;
	
	Person() {}
	
	Person(String pName, int pAge, double pHeight){
		name = pName;
		age = pAge;
		height = pHeight;
	}
	
	void info() {
		System.out.println("*** 인물 정보 ***");
		System.out.println("이름: " + name);
		System.out.printf("나이: %d세\n",age);
		System.out.printf("키: %.1fcm\n",height);
	}
	
}
