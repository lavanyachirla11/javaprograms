/*
Algorithm:
---------------
1.Find middle point    m = (l + h)/2

2.if key is present at middle point, return middle position

3.else if  arr[l..m] is sorted
    a)if key is present in between arr[l] to arr[m], recur for arr[l..m]
    b)else recur for arr[m+1.. h]

4.else (arr[m+1..h] must be sorted)
    a)if key is present in between a[mid+1..h], recur for arr[m+1..h]
    b)else recur for arr[l..m]
*/
import java.util.*;
public class Array_BinarySearch {
	
	static int binary_search(int arr[],int l, int h, int key)
	{
		if (l>h)
			return - 1;
		
		int m = (l+h)/2;   
		if(arr[m] == key)  
			return m;
		
		if(arr[l] <= arr[m]) 
		{
		   if(key >= arr[l] && key <= arr[m])  
			{ return binary_search(arr,l,m-1,key); }
		
		return binary_search(arr,m+1, h,key);  
		}
		
		if (key >= arr[m] && key <= arr[h]) 
		 {return binary_search(arr,m+1, h, key); }
		return binary_search(arr,l,m-1,key);
				
		}
			
		
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter 9 values: ");
	int arr[] = new int[9];
	for(int i = 0; i<9;i++)
	{
		arr[i] = sc.nextInt(); 
	}
	
	int n = 9;
        System.out.print("Enter key required to be searched : ");
	int key = sc.nextInt();
	int i = binary_search(arr,0,n-1,key);
	if (i != -1)
		System.out.println("Position = "+ (i+1));
	else
		System.out.println("key not found");	
	} }
