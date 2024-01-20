package classesandobjects;

public class ParameterizedEx {
	
	public static void rectsnglr(int length, int breadth) {
		System.out.println("Area of triangle: " +(length*breadth));
	}
	public void circle(double radius)
	{
		System.out.println("Area of circle ;" +(3.14*radius*radius));
	}
	public double triangle(double base, double height) //parameterized with return
	{
		double a = 0.5*base*height;
		return a;
		
		
	}
	static {
		System.out.println("invoke before main() at the time of class loading: ");
	}
}
