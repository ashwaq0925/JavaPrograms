package Collections;
import java.util.*;


public class TestArrayListt {
	Scanner sc = new Scanner(System.in);
	void TestArrayList() 
	{
		//create object of Arraylist
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		a1.add(null);//adding element of arrayList
		a1.add(100);
		a1.add(20);
		a1.add(54);
		//traversing list using iterator a interface
		Iterator<Integer> itr =a1.iterator();
		System.out.println("ArrayList : ");
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("----------------------------");
	}
	
	void TestLinkedList() {
		LinkedList<String> l1=new LinkedList<String>();
		l1.add("red");
		l1.add("yellow");
		l1.add("green");
		l1.add("blue");
		l1.add("white");
		Iterator<String> itr=l1.iterator();
		System.out.println("Linked List: ");
		while(itr.hasNext());
		{
			System.out.println("-----------------------------");
		}
		
		
	}
	void AcceptArrayList() {
		ArrayList<String> list =new ArrayList();
		
		int n;
		
		System.out.print("Enter a element : ");
		n =sc.nextInt();
		sc.nextLine(); // consjume the new line character
		
		for(int i=0; i<n; i++) {
			System.out.println("enter elemenr " + (i +1) + ":");
			String element = sc.nextLine();
			}
	}
	
}
