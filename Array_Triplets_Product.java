package pack1;
import java.util.*;
public class Array_Triplets_Product {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter array size value : ");
		int n = sc.nextInt();
		System.out.print("Enter the required product value : ");
		int num = sc.nextInt();
		int arr[]=new int[n];
		System.out.print("Enter "+n+" values : ");
		for(int i=0 ;i<n; i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("The required triplets are : ");
		for(int i=0;i<n-2;i++)
		{
			for(int j=i+1;j<n-1;j++)
			{
				for(int k=j+1;k<n;k++)
				{
					if(arr[i]*arr[j]*arr[k]==num)
					  System.out.println(arr[i]+" "+arr[j]+" "+arr[k]);
					
				}
			}
		}

	}

}
