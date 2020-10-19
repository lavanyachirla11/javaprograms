package formats;

import java.util.Scanner;

public class Format74 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter n value : ");
		int n = sc.nextInt();
		int x=1;
		for(int i=n; i>= -n; i--) 
		{
		  for(int j=1 ; j <= Math.abs(i); j++)
			  System.out.print(" "); 
		  
		  x = 1;
		  for(int k= n; k>=Math.abs(i); k--)
		  {
			  System.out.print((char)(x+64)+" "); 
		      x=x+1; 
		  }
		  System.out.println();
		}


	}

}
/*Sample Output:
Enter n value : 5
     A 
    A B 
   A B C 
  A B C D 
 A B C D E 
A B C D E F 
 A B C D E 
  A B C D 
   A B C 
    A B 
     A 
*/
