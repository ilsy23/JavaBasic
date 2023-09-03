package oop.abs.quiz;

public class Rect extends Shape {

	int length1;
	int length2;
	
	Rect(String name, int length){
		super(name);
		this.length1 = length;
	}
	
	Rect(String name, int length1, int length2){
		super(name);
		this.length1 = length1;
		this.length2 = length2;
	}

	@Override
	public double getArea() {
		double rectArea;
		if(length2 == 0) {
			rectArea = length1 * length1;
		}else {
			rectArea = length1 * length2;
		}
		return rectArea;
	}

}
