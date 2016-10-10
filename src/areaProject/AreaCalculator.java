package areaProject;

import java.util.ArrayList;

public abstract class AreaCalculator {
	protected ArrayList<Shape> shapes = new ArrayList<Shape>();
	protected double areasum;

	public abstract void calculate();

	public double getAreasum() {
		return areasum;
	}

	public void addShape(Shape s) {
		shapes.add(s);
	}
}
