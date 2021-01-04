/*
wap to find number of rotations in an array using binary search ?

input:   [15,18,2,3,6,12]
output: 2

Algorithm:
----------------
The minimum element is the only element whose previous is greater than it.
We check this condition for middle element by comparing it with (mid-1) and (mid+1) elements.
If the minimum element is not at the middle (neither mid nor mid+1),  then minimum
element lies in left side.
*/
import java.util.*;
public class No_Rotations {

	static int count(int arr[], int low, int high)
	{
		int mid = low + (high-low)/2;
		if( mid < high && arr[mid+1] < arr[mid] )
			return (mid+1); 
		if(mid > low   && arr[mid] < arr[mid-1])
			return mid;
		if(arr[high] > arr[mid])
			return count(arr, low,mid-1);  
		
		return count(arr,mid+1, high);  	
		
	}
	
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int arr[] = new int[6];
	System.out.println("enter 6 values: ");
	for(int i = 0; i<6; i++)
	{ 
		arr[i] = sc.nextInt();
	}
    int n = 6;
    System.out.println(count(arr,0,n-1));
    
	}

}
