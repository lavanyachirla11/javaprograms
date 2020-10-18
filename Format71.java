package formats;
import java.util.Scanner;
public class Format71 {

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
			  System.out.print(x+" "); 
		      x=x+1; 
		  }
		  System.out.println();
		}

	}

}
/* Sample Output:
Enter n value : 5
     1 
    1 2 
   1 2 3 
  1 2 3 4 
 1 2 3 4 5 
1 2 3 4 5 6 
 1 2 3 4 5 
  1 2 3 4 
   1 2 3 
    1 2 
     1 

*/