//program to search an element in the sorted and rotated array.
/*
Algorithm-
1)Find the middle point int mid=(l+h)/2;
2)if the key is present at mid position than return mid;
3)Else If arr[l..mid] is sorted
    a) If key to be searched lies in range from arr[l]
       to arr[mid], recur for arr[l..mid].
    b) Else recur for arr[mid+1..h]
 4)Else (arr[mid+1..h] must be sorted)
    a) If key to be searched lies in range from arr[mid+1]
       to arr[h], recur for arr[mid+1..h].
    b) Else recur for arr[l..mid] 
*/

public class Array1 {
    static int search(int arr[],int l,int h,int key){
        if (l > h)
            return -1;

        int mid = (l + h) / 2;
        if (arr[mid] == key)
            return mid;


        if (arr[l] <= arr[mid]) {

            if (key >= arr[l] && key <= arr[mid])
                return search(arr, l, mid - 1, key);


            return search(arr, mid + 1, h, key);
        }


        if (key >= arr[mid] && key <= arr[h])
            return search(arr, mid + 1, h, key);

        return search(arr, l, mid - 1, key);

    }

    public static void main(String[] args) {
        int arr[] = { 4, 5, 6, 7, 8, 9, 1, 2, 3 };
        int n = arr.length;
        int key = 3;
        int i = search(arr, 0, n - 1, key);
        if (i != -1)
            System.out.println("Index: " + i);
        else
            System.out.println("Key not found");
    }
}
