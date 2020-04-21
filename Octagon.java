
public class Octagon extends Shape{
	
	//declare variable
	private double side;
	
	
	public Octagon (double side) {
		
		this.side=side; 
	}
	
	public double getLength() {
		return side;
	
	}
	
	public void setLength(double side) {
		
		this.side=side;
		
	}

	@Override
	public double calculateArea() {
		//calcuate the area of an octagon
		return (2*(1+(Math.sqrt(2)))*side*side);
	}

	@Override
	public double calculatePerimeter() {
		//claculate the perimeter of an octogon 
		return 8*side;
	}
	}
