import java.util.Arrays;

public class Array1D2DExample {

	public static void array1D2DExample() {
//		1D Array declaration
		//way 1
		int a1[] = {2,3,4,5};
		
		//way 2
		int b1[] = new int[]{2,3,4,5};
		
		// way 2 
		int c1[] = new int[4];
		c1[0] = 1;
		c1[1] = 3;
		
		// enhanced for loop;
		System.out.println(" **** enhanced for loop");
		for(int i:a1) {
			System.out.println(i);
		}
		
//		2D Array declaration
		//way 1		
		int a2[][] = {{2,3,4},{4,5,6,7}};
		//way 2 
		int arr2D[][] = new int[3][];
//		b2[0] = {2,3,4,5};   // incorrect way
		arr2D[0] = new int[] {2,3,4,5,9,1};
		arr2D[1] = new int[] {2,3};
		arr2D[2] = new int[] {1};
		
		System.out.println(" ***** b2 Array address : ");
		System.out.println(arr2D);
		
		System.out.println(" ***** b2 Array values ( which is address of sub arrays addresses ) : ");
		System.out.println(Arrays.toString(arr2D));
		
		System.out.println(" ***** b2 length : ");
		System.out.println(arr2D.length);
		
		System.out.println(" ***** b2 arrays row 1 address : ");
		System.out.println(arr2D[0]);
		
		System.out.println(" ***** b2 arrays row 1 length : ");
		System.out.println(arr2D[0].length);
		
		System.out.println(" ***** b2 arrays row 1 values : ");
		for(int i=0;i<arr2D[0].length;i++) {
			System.out.println(arr2D[0][i]);
		}
		
		//  Print 2D array
		
		System.out.println(" ***** print 2d array");
		for(int i=0; i<arr2D.length;i++) {
			System.out.println("row " + i);
			for(int j=0; j < arr2D[i].length;j++ ) {
				System.out.println(arr2D[i][j]);
			}
		}
		
	}
	
}
