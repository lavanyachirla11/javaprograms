package formats;

import java.util.Scanner;

public class Format64 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter n value : ");
		int n = sc.nextInt();
		for(int i=n; i>=1; i--)
		{
			for(int j=n-1; j>=i; j--)
				System.out.print(" ");
			for(int k=i; k>=1; k--)
				System.out.print((char)(k+64)+" ");
			System.out.println();
		}


	}

}
/*Sample Output:
Enter n value : 5
E D C B A 
 D C B A 
  C B A 
   B A 
    A 
 */