package classesandobjects;

public class InheritanceEx extends Sports  //child class
{
	public void play() //method 
	{
		System.out.println("child want to play cricket"); 
	
	}
	


	public static void main(String[] args) //method
	{
		// TODO Auto-generated method stub
		//className obj  = new className();
		
	 InheritanceEx obj = new InheritanceEx();
	 Sports obj2 = new Sports();
	 obj.cricket();
	 obj.play();
	 obj2.cricket();
	// obj2.play();

	}



}
class Sports // parent class
{
	public void cricket()  //method or function
	{
		System.out.println("parents want to play cricket ");
	}
}

