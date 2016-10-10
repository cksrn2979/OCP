package areaProject;

public class Rect extends Shape {
	
	private double w;
	private double h;
	
	public Rect(double w, double h){
		this.w=w;
		this.h=h;
	}
	
	@Override
	public double area() {
		// TODO Auto-generated method stub
		return this.w*this.h;
	}

}
