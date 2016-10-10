package areaProject;

import java.util.Iterator;

public class AreaProdCalculator extends AreaCalculator {

	public void calculate() {
		Iterator<Shape> iter = shapes.iterator();
		areasum = 1.0;
		while (iter.hasNext()) {
			Shape curShape = iter.next();
			areasum *= curShape.area();
		}
	}
}
