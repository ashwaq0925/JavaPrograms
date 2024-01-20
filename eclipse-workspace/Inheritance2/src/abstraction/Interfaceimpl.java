package abstraction;

public class Interfaceimpl implements Drawable, Printable {

	public static void main(String[] args)
	{
		Interfaceimpl drawable = new Interfaceimpl();  // compile-time = runtime
		drawable.calculate();
		drawable.cube(4);
		System.out.println("square:"+Drawable.square(5));
		

	}

	@Override
	public void calculate() 
	{
		int radius = 10;
		
		System.out.println("Area :" +(PI*radius*radius));
		
	}

	@Override
	public void print() {
		System.out.println("achievied interface inheritance");
	}

}
