package abstraction;

public interface Drawable 
{
	float PI = 3.14f;//public static final pi =3.14f;
	
	
	void calculate();  // public abstract void calculate();
	
	
	static int square(int a) 
	{
		return a*a;
		
	}
	
	
	default void cube(int x) 
	{
		System.out.println("cube : " +x*+x*x);
	}
}
