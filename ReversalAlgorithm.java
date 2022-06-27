//Rotate the array using reversal algorithm . 
//Time Complexity:-O(n)
//Space Complexity:- O(1)
import java.util.Scanner;

public class ReversalAlogorithm {
	static void leftRotate(int arr[],int d) {
		if(d==0)
			return;
		int n=arr.length;
		d=d%n;
		reverse(arr,0,d-1);
		reverse(arr,d,n-1);
		reverse(arr,0,n-1);
	}
	static void reverse(int arr[],int start,int end) {
		int temp;
		while(start<end) {
			temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
	}
	static void print(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]+" ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner s=new Scanner(System.in);
		System.out.println("enter size:");
		n=s.nextInt();
		int arr[]=new int[n];
		System.out.println("enter elements:");
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		int d=2;
		System.out.println("array before rotation");
		print(arr);
		System.out.println("array after rotation");
		leftRotate(arr,d);
		print(arr);
		

	}

}
