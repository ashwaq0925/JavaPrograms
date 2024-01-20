package Collections;

import java.util.HashMap;

public class HashMapCRUD {
	void CRUD()
	{
		HashMap<Integer ,Book > bookMap =new HashMap<Integer,Book>();
		
		//create Books
		
		Book b1 = new Book(101,"hi, bro","how are you");
		Book b2 = new Book(102,"python prograamming" , "java programming");
		Book b3 = new Book(103,"database","is easy");
		
		//Add books
		bookMap.put(b1.getID(),b1);
		bookMap.put(b2.getID(),b2);
		bookMap.put(b3.getID(),b3);
		
		//Read Books
		Book read1 = bookMap.get(101);
		Book read2 = bookMap.get(102);
		Book read3 = bookMap.get(103);
		
		//display on console
		System.out.println("*************** BOOKS LIST***************");
		System.out.println(read1);
		System.out.println("------------------------------------------");
		System.out.println(read2);
		System.out.println("------------------------------------------");
		System.out.println(read3);
		
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
