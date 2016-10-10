package areaProject;

import java.util.ArrayList;
import java.util.Iterator;

public class AreaCalculator {
		private ArrayList<Shape> shapes= new ArrayList<Shape>();
		
		public void calcuate(){
				Iterator<Shape> iter= shapes.iterator();
				double areasum=0.0;
				while(iter.hasNext()){
					Shape curShape=iter.next();
					areasum += curShape.area();
				}
				System.out.println(areasum);
		}
		
		public void addShape(Shape s){
			shapes.add(s);
		}
}
