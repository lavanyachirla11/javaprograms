/*
Given an array of elements of length N.
All elements may not be present in an array.
If the elements is not present then there will be -1.

Ex:     i = 0 ,1 , 
Input arr[j] = {  -1, -1, 6 , 1, 9 ,3,2,-1,4,-1 }  
Output: [-1, 1,2,3,4,-1,6,-1,-1,9 ]

Algorithm:
-------------------
Navigate from 0 to n-1 numbers in an array.
if(  i == a[j] ) , then replace  the element at i position with a[j]
If there no matching element , then replace with -1.
*/
import java.util.*;
public class Rearrange {
	static void rearrange(int ar[], int n)
	{
		int i,j,temp;
		for(i = 0; i < n ; i++)  // i = 0,1,2
		{
			for(j =0; j<n ; j++) // 10 times
			{
				if(ar[j] == i) // ar[j] == 1
				{
					temp = ar[j];
					ar[j] = ar[i];
					ar[i] = temp;
					break;
				}
			}
		}
		for( i = 0; i<n; i++)
		{
			if (ar[i] != i)
				ar[i] = -1;
		}		
		System.out.println("rearranged data :");
		for(i =0; i<n;i++)
			System.out.print(ar[i]+" ");
	}	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ar[] = new int[10];
		System.out.println("enter 10 numbers :");
		for(int i = 0;i<10;i++)
			ar[i] = sc.nextInt();
		int n = 10;
		rearrange(ar,n);
	}
}

