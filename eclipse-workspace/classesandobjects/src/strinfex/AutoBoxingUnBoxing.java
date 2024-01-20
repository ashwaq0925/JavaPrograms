package strinfex;

public class AutoBoxingUnBoxing {

	public static void main(String[] args) {
		int a = 10;
		Integer obj1 = a;  //autoboxing
		
		Integer obj2 = Integer.valueOf(a); //prior java s
		System.out.println(obj1 +" " +obj2);
		
		//unboxing
		Integer i =  20;
		int b = i; //unboxing
		int c = i.intValue();  //prior java5
		System.out.println(b+" " +c);
		
	}

}
