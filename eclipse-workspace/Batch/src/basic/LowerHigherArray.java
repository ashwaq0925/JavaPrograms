package basic;

public class LowerHigherArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {4,12,3,19,6};
		int highest = a[0];
		int lowest = a[0];
		for(int i=1; i<a.length; i++)
		{
			if(a[i]>highest)
			{
				highest=a[i];
			}
			if(a[i]<lowest) {
				lowest = a[i];
			}
			}
		System.out.println("highest:" +highest);
		System.out.println("lowest :" +lowest);
	}

}
