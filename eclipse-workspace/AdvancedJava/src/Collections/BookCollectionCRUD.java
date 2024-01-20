package Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookCollectionCRUD {
	
	
	List<Book> bookCollection =new ArrayList<Book>();
	Scanner sc = new Scanner(System.in);
	int bId;
	String bTitle;
	String bAuthor;
	//Accept data from user at run-time
	void Accept() 
	{
		System.out.println("Enter bId : ");
		bId=sc.nextInt();
		System.out.println("Enter bTitle : ");
		bTitle=sc.next();
		System.out.println("Enter bAuthor : ");
		bAuthor=sc.next();
		
		Book book1 = new Book(bId,bTitle,bAuthor);
		bookCollection.add(book1);
		
		//Read
		
		System.out.println("List of Books : ");
		for(Book book :bookCollection) {
			System.out.println(book);
		}
	}
	
	//create
	
	void create() {
		Book book1= new Book(1,"java programming "," john Doe");
		Book book2= new Book(2,"Data Structures "," jane Saith");
		bookCollection.add(book1);
		bookCollection.add(book2);
		
		//Read
		
		System.out.println("List of books: ");
		for(Book book : bookCollection) {
			System.out.println(book);
		}
	
	}
	
	//update
	void update()
	{
		//update
		
		int bookToUpdateIndex = 0;
		if (bookToUpdateIndex >=0 && bookToUpdateIndex <bookCollection.size())
		{
			Book updatedBook = bookCollection.get(bookToUpdateIndex);
			updatedBook.setTitle("updated java programming BOook");
			System.out.println("book of index" +bookToUpdateIndex + "updated.");
			
		}
		else
		{
			System.out.println("Invalid index for update:");
			
		}
		
		//reAD AFTER update
		System.out.println("\nList of books for updating");
		for (Book book : bookCollection)
		{
			System.out.println(book);
		}
	}
	//DElete
	void Delete()
	{
		int bookToDeleteIndex =1;
		if (bookToDeleteIndex >=0 && bookToDeleteIndex < bookCollection.size())
		{
			bookCollection.remove(bookToDeleteIndex);
			System.out.println("\nBook at index " + bookToDeleteIndex + "deleted.");
			
		}
		else
		{
			System.out.println("Invalid index for deleteion");
			
		}
		
		//read after delete
		
		System.out.println("\nList of books after deletion");
		for(Book book : bookCollection)
		{
			System.out.println(book);
		}
	}

	public static void main(String[] args) 
	{
		BookCollectionCRUD b1 = new BookCollectionCRUD();
		b1.Accept();
		b1.create();
		b1.update();
		b1.Delete();
	
		
		

	}

}
