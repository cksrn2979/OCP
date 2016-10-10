package areaProject;

public class ConsolePrinter {
	private AreaCalculator calculator;
	
	public void setCalculator(AreaCalculator calculator){
		this.calculator=calculator;
	}
	
	public void print(){
		System.out.println("result : " +calculator.getAreasum());
	}
}
