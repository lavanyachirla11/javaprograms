package formats;

import java.util.Scanner;

public class Format88 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter n value : ");
		int n = sc.nextInt();
		int x = n/2+1;
		for(int i = 1; i <= n; i++) 
		{
			for(int j = 1; j <= n; j++) 
			{
				if( j == x || j == n-x+1) 		
				 System.out.print((char)(64+x)); 
				else
				 System.out.print(" ");
			}		
			System.out.println();
			
			if( i <= n/2)  
			{
				x=x-1;
			}
			else
			{
				x=x+1;
			}
		}


	}

}
/*Sample Output:
  C  
 B B 
A   A
 B B 
  C  
*/