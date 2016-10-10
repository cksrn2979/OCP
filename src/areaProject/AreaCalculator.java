package areaProject;

import java.util.ArrayList;
import java.util.Iterator;

public class AreaCalculator {
		private ArrayList<Shape> shapes= new ArrayList<Shape>();
		private double areasum;
		
		public double getAreasum() {
			return areasum;
		}

		public void calcuate(){
				Iterator<Shape> iter= shapes.iterator();
				areasum=0.0;
				while(iter.hasNext()){
					Shape curShape=iter.next();
					areasum += curShape.area();
				}
		}
				
		public void addShape(Shape s){
			shapes.add(s);
		}
}
