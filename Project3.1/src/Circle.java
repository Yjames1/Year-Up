
public class Circle 
{
	String m_color= null;
	double m_radius= -1;
	
	Circle(double radius)
	{
		m_radius= radius;
		m_color= "grey";
	}
	
Circle(double radius, String color)
{
	m_radius= radius;
	m_color= color;
}

double CaculateArea()
{
	double area= 3.14 *m_radius *m_radius;
	return area;
}

void PrintColor()
{
	System.out.println("my color is " + m_color);
}


	public static void main(String[] args) 
	{
		Circle bigCircle = new Circle(10);
		double bigCirlceArea= bigCircle.CaculateArea();
		bigCircle.PrintColor();
		System.out.println("big circle's area is " + bigCirlceArea);
		
		
		Circle smallCircle = new Circle ( 5,"purple");
		double smallCircleArea= smallCircle.CaculateArea();
		smallCircle.PrintColor();
		System.out.println("The small circle is"+ "and the area is " + smallCircleArea  );
	}

}
