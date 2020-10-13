package formats;

import java.util.Scanner;

public class Format56 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter n value : ");
		Scanner sc=new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = n; i >= -n; i--) 
		{
			for(int j=1; j<=Math.abs(i); j++)
			 System.out.print(" "); 
			
			for(int k= Math.abs(i); k<=n;k++)
				System.out.print((char)(k+65)); 
			System.out.println();
		}


	}

}
/*Sample Output:
Enter n value : 3
   D
  CD
 BCD
ABCD
 BCD
  CD
   D
*/