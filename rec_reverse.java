
/*

recursive java prg to reverse an array 

1.initialize start and end indexes 
2.swao
3.recursive
*/

import java.util.Scanner;

public class rec_reverse {
	static void reverse(int arr[],int start,int end)
	{
		int temp;
		if (start >= end) // 4>3
			return;
		
		temp = arr[start];
		arr[start] = arr[end];
		arr[end]=temp;
		reverse(arr,start+1, end-1);
	}
	
	static void print(int arr[],int size)
	{
		for(int i=0;i<6;i++)
			System.out.print(arr[i]+" ");
	}
	public static void main(String[] args) {
	Scanner obj = new Scanner(System.in);
	int arr[] = new int[6];
	System.out.println("enter 6 values:");
	for(int i=0;i<6;i++)
		arr[i] = obj.nextInt(); 
	reverse(arr,0,5);
	System.out.println("reverse value:");
	print(arr,6);
	}
}
