package abstraction;

public abstract class shapes 
{
	public shapes() {
		System.out.println("constructor inside abstract class");
	}
	
	
	public abstract int sides();
	
	public void print() {
		System.out.println("drawing shapes:");
	}
}
