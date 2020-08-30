package pack1;
import java.util.Scanner;
public class Even_odd_count_in_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter array size : ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		int even_count=0,odd_count=0;
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			if(arr[i]%2==0)
			{
				even_count++;
			}
			else
			{
				odd_count++;
			}
		}
		System.out.println("Even number count = "+even_count+"\nOdd number count = "+odd_count);

	}

}
