package basic;

import java.util.Scanner;

public class MultiArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][] = {{1,2,4}, {10,3,2}};
		int i,j;
		for(i=0; i<2; i++) {
			for(j=0; j<3; j++) {
				System.out.print(a[i][j]+"\t");
			}
			System.out.println();
		}
		
	}

}
