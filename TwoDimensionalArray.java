/*
baisc implementation of two dimensional array.................................................................................................................................
*/
import java.util.Scanner;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,m;
		Scanner s=new Scanner(System.in);
		System.out.println("enter n:");
		n=s.nextInt();
		System.out.println("enter m");
		m=s.nextInt();
		int arr[][]=new int[n][m];
		int row,col;
		System.out.println("enter n*m values");
		for(row=0;row<n;row++) {
			for(col=0;col<m;col++) {
				arr[row][col]=s.nextInt();
			}
		}
		System.out.println("values are:");
		for(row=0;row<n;row++) {
			for(col=0;col<m;col++) {
				System.out.println(arr[row][col]+"\t");
			}
			System.out.println();
		}
		

	}

}
