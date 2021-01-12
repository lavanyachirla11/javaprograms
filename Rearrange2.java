/*Rearrange array such that arr[i]>= arr[j]  if i as even and arr[i]<=arr[j] if i is odd.

Elements at even position are greater than all elements before it, and
Elements at odd position are less than all elements before it.

Ex: 
Input :   a[] = {1,2,3,4,5,6,7}

output: 1 2 3 4 5 6 7 - positions
                4 5 3 6 2 7 1  - array values

Algorithm:
----------------
First create temp array of the original array ,copy data and sort temp array.
Now find total even position in array n/2 = 7/2 = 3
Remaining will be number of odd positions n-(n/2) = 7 - 3 = 4

Start array (n-(n/2) ) -4th position and copy the element to 1st position in array.
start traversing the array values from above 4th position towards left and keep filling in the odd position.
Start traversing array(n-(n/2) +1 ) - 5th position towards right and keep filling in 
the even position.
*/
import java.util.*;
public class Rearrange2 {

	public static void Re_Array(int arr[] , int n)
	{
		int[] temparr = new int[n];		
		int evenpos = n/2 ;  		
		int oddpos = n - evenpos; 
		for(int i=0; i<n;i++)
			temparr[i] = arr[i];
		
		Arrays.sort(temparr);
				
		int j = oddpos - 1 ; 
		
		
		for(int i=0;i<n; i+= 2)
		{
			arr[i] = temparr[j]; 
			j--;  
		}
		
		j = oddpos;  
		for(int i=1; i<7; i+=2)
		{
		   arr[i] = temparr[j]; 
		   j++;
		}
		System.out.println("Reaaranged Array :");
		for(int i=0;i<n; i++)
			System.out.print(arr[i]+" ");			
	}
	
	public static void main(String[] args) {
	int[] arr = new int[7];
	Scanner sc = new Scanner(System.in);
	System.out.println("enter 7 values:");
	for(int i =0; i<7;i++)
		arr[i] = sc.nextInt();
	Re_Array(arr,7);
	}  }
