package oop.abs.quiz;

public class Rect extends Shape {

	private int width;
	private int height;
	
	public Rect(String name, int length){
		super(name);
		this.width = length;
	}
	
	public Rect(String name, int width, int height){
		super(name);
		this.width = width;
		this.height = height;
	}

	@Override
	public double getArea() {
		double rectArea;
		if(height == 0) {
			rectArea = width * width;
		}else {
			rectArea = width * height;
		}
		return rectArea;
	}
	
	public int getLength1() {
		return width;
	}
	
	public int getLength2() {
		return height;
	}
	
	public void setLength1(int length1) {
		this.width = length1;
	}
	
	public void setLength2(int length2) {
		this.height = length2;
	}

}
