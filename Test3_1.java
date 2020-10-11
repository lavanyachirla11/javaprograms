import java.util.Scanner;
public class Test3_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
                System.out.println("Enter array Size : ");
		int n1=sc.nextInt();
		int arr[]=new int[n1];
		int count=0;
                System.out.println("Enter "+n1+" elements : ");
		for(int i=0;i<n1;i++)
		{
		   arr[i]=sc.nextInt();
		}
                System.out.println("Enter the key element which is not to be counted : ");
		int n2=sc.nextInt();
		for(int i=0;i<n1;i++)
		{
		   if(arr[i]!=n2)
		   count++;
		}
		System.out.println("The total elements are "+count);

	}

}
