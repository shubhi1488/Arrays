/*
Basic implementation of arrays in java.........................................................................................................................................
*/
import java.util.*;
public class Array1 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner s=new Scanner(System.in);
		System.out.println("enter size");
		n=s.nextInt();
		int arr[]=new int[n];
		System.out.println("enter elements:");
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		System.out.print("elements of array are:");
		for(int x:arr) {
			System.out.println(x);
		}
		

	}

}
