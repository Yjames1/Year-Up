
public class CaculateCircleAverage {

	public static void main(String[] args) 
	{
		int radius = 9, length = 6, breadth = 3;
		double circleArea = CalculateCircleArea(radius);
		double rectangleArea = CalculateRectangleArea(length, breadth);
		System.out.println("The area of the circle is: " + circleArea);
		System.out.println("The area of the cirlce is: "+ rectangleArea);
	}
	
	static double CalculateCircleArea( int radius)
	{
		double area = 3.14*radius*radius;
		return area;
	}
	
	static double CalculateRectangleArea (int length, int breadth )
	{
		double area = length* breadth;
		return area;
	}
}
