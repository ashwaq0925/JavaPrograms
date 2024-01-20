package basic;
import java.util.Scanner;

public class SimpleInterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float p,n,r,si;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number of years, principle amount, rae of interest ");
		p = sc.nextFloat();
		n = sc.nextFloat();
		r = sc.nextFloat();
		si = (n*p*r)/100;
		System.out.println("simple interest "+n+" and "+p+" and "+r+" : " +si);
		}

}
