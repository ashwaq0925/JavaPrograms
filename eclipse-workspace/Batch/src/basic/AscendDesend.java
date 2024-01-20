package basic;

public class AscendDesend {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= new int[]{10,2,4,64,6,22,45,12,23,34};
		int temp=0, temp2=0;
		int i,j;
		
		
		for(i=0; i<4; i++ ) {
			for(j=i+1; j<5; j++) {
				if(a[i]>a[j]) {
					temp=a[i];
				    a[i]=a[j];
				    a[j]=temp;
				}
					
			}
		}
		for(i=5;i<a.length-1; i++) {
			for(j=i+1; j<a.length;j++) {
				if(a[i]<a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					
				}
			}
		}
		System.out.print("Array elements: " );
		for(i=0;i<a.length; i++) {
			System.out.print(a[i]+ " ");
		}
		
	}

}
