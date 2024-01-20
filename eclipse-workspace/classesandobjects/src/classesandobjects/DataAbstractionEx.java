package classesandobjects;

public interface DataAbstractionEx 
{
	abstract void print();
	 default void write()
	{
		System.out.println("hi,how are you");
	}
}
