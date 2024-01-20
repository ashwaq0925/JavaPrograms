package ExceptionEx;

public class CustomExceptionImolDemo {
	
	public static void checkFruit(String fruitName) throws BadFruitEx {
		if(fruitName.equalsIgnoreCase("mango"))
			System.out.println("I like :" +fruitName);
		else
			throw new BadFruitEx("i don't like " +fruitName);
	}

	public static void main(String[] args) {
		try {
			CustomExceptionImolDemo.checkFruit("grapes");
		} catch (BadFruitEx e) {
			e.printStackTrace();
		}
		System.out.println("rest of code...."); 
		
	}

}
