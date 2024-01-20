package basic;
import java.util.Scanner;
public class PhoneBill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int NumberofCalls,BillAmount;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter total number of calls:");
		NumberofCalls = sc.nextInt();
	
		if(NumberofCalls<200) {
			BillAmount= NumberofCalls*1;
				
			}
		else {
			BillAmount=NumberofCalls*3;
		}
		System.out.println("total amount :" +BillAmount);
	}

}
