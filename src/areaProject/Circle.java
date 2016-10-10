package areaProject;

public class Circle extends Shape {
	private double r;
	
	public Circle(double r){
		this.r=r;
	}
	
	@Override
	public double area() {
		// TODO Auto-generated method stub
		return 3.14*r*r;
	}

}
