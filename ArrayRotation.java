/*
rotating the array by two position............................................................................................................................................
*/

public class ArrayRotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,5,6,7};
		int n=arr.length;
		int d=2;//array will be rotated by two position
		int p=1;
    //loop will be executed if p is less or equal to d
		while(p<=d) {
			int last=arr[0];//store the value at 0 index of array at the temporary variable last
			for(int i=0;i<n-1;i++) {
				arr[i]=arr[i+1];//shift all the elements of array 
			}
			arr[n-1]=last;//now insert back the element stored inside the last to the last of the array
			p++;//increase the counter variable p by 1
		}
    //loop to print the new array.............................................................................................................................................
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]+" ");
		}

	}

}
