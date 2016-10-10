package areaProject;

public class Triangle extends Shape {
	private double w;
	private double h;
	
	public Triangle(double w, double h){
		this.w=w;
		this.h=h;
	}
	
	@Override
	public double area() {
		// TODO Auto-generated method stub
		return 0.5 *w*h;
	}

}