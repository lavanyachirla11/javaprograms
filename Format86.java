package formats;

import java.util.Scanner;

public class Format86 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter n value : ");
		int n = sc.nextInt();
		int x = n/2+1;
		int p=1;
		for(int i = 1; i <= n; i++) 
		{
			for(int j = 1; j <= n; j++) 
			{
				if( j == x || j == n-x+1) 		
				 System.out.print(p); 
				else
				 System.out.print(" ");
			}		
			System.out.println();
			
			if( i <= n/2)  
			{
				x=x-1;
			    p=p+1;
			}
			else
			{
				x=x+1;
				p=p-1;
			}
			
		}


	}

}
/*Sample Output:
Enter n value : 5
  1  
 2 2 
3   3
 2 2 
  1  
*/