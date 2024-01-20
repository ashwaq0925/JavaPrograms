package basic;

public class DescArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rollno[]= {1,2,3,4,5};
		int marks[]= {65,58,89,42,76};
		
		
		int i,j,temp,temp2;
		for(i=0; i<rollno.length-1; i++) {
			for(j=i+1; j<rollno.length; j++) {
				if(marks[i]<marks[j]) {
					temp= marks[i];
					marks[i]=marks[j];
					marks[j]=temp;
					
					temp2=rollno[i];
					rollno[i]=rollno[j];
					rollno[j]=temp2;
				}
			}
		}
		System.out.print("rollno:");
		for(i=0;i<rollno.length;i++) {
			System.out.print("  " +rollno[i]);
		}
		System.out.print("\nmarks:");
		for(i=0;i<marks.length;i++) {
			System.out.print(" " +marks[i]);
		}
	}

}
