package areaProject;

import java.util.Iterator;

//책임(변경의 이유)
//1.연산 2.출력 - 두가지 변경의 이유 
//SRP를 만족하지 않음
//두 가지 변화 중 한가지는 변경되지 않는 경우 SRP 만족
public class AreaSumCalculator extends AreaCalculator {
	public void calculate() {
		Iterator<Shape> iter = shapes.iterator();
		areasum = 0.0;
		while (iter.hasNext()) {
			Shape curShape = iter.next();
			areasum += curShape.area();
		}
	}

}
