package studio7;

public class Rectangle {

	private double length;
	private double width;
	private double perimeter;
	private double area;

	public Rectangle(double recLength, double recWidth){
	
	length = recLength; 
	width = recWidth; 

	perimeter = (2*recLength)+(2*recWidth);
	area = recLength*recWidth;
	}
	
	public void Comparison(Rectangle r) {
		double area1 = r.area;
		double area2 = this.area;
		
		if(area1>area2) {
			System.out.println("Rectangle 1 is larger than rectangle 2");
		}
		
		else if(area1==area2) {
			System.out.println("The rectsangles are the same size");
		}
		
		else{
			System.out.println("Rectangle 2 is larger than rectangle 1");
			
		}
		
		
	}
	
	public void isSquare(Rectangle r) {
		double length = this.length;
		double width = this.width;

		if(length==width) {
			System.out.println("The rectangle is a square");
			
		}
		
		else {
			System.out.println("The rectangle is not a square");
		}

}
}
