package basic;
import java.util.Scanner;
public class Percentage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter 4 subjects");
		
		float maths = sc.nextFloat();
		float science = sc.nextFloat();
		float history = sc.nextFloat();
		float biology = sc.nextFloat();
		
		
		float total = (maths+science+history+biology);
		
		float percentage= total/4;
		System.out.println("total percentage is : " +percentage);
		
		
	}

}
