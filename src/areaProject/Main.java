package areaProject;

public class Main {

	public static void main(String[] args) {

		Rect r1 = new Rect(10, 20);
		Rect r2 = new Rect(100, 200);

		Circle c1 = new Circle(20);
		
		AreaProdCalculator ac = new AreaProdCalculator();
		ac.addShape(r1);
		ac.addShape(r2);
		ac.addShape(c1);
	
		ac.calculate();

		ConsolePrinter pr1 = new ConsolePrinter();
		pr1.setAreaCalculator(ac);
		pr1.print();
	}
}
