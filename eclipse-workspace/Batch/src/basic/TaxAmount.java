package basic;
import java.util.Scanner;
public class TaxAmount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float salary,tax;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter salary:");
		salary = sc.nextFloat();
		tax = salary*0.12f;
		System.out.println("tax = " +tax);
		
		}

}
