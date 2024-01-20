package basic;
import java.util.Scanner;

public class CircleRectangleTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float Length,Breadth,Radius,Height,AreaofTriangle,AreaofRectangle,AreaofCircle;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter Length,Breadth,Radius,Height:");
		Length= sc.nextFloat();
		Breadth= sc.nextFloat();
		Radius= sc.nextFloat();
		Height= sc.nextFloat();
		AreaofTriangle=(Height*Breadth)/2;
		AreaofRectangle=(Length*Breadth)/2;
		AreaofCircle=(Radius*Radius)/2;
		System.out.println("Area of Triangle:" +AreaofTriangle);
		System.out.println("Area of Rectangle:" +AreaofRectangle);
		System.out.println("Area of circle:" +AreaofCircle);
	}

}
