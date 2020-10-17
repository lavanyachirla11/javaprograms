package formats;
import java.util.Scanner;
public class Format70 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter n value : ");
		int n = sc.nextInt();
		int x=1;
		int j;
		for(int i=n; i>=-n; i--)
		{
			for( j=1; j<=Math.abs(i); j++)
				System.out.print(" ");
			x=(i>0)?1:j;
			for(int k=n; k>=Math.abs(i); k--)
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
 2 3 4 5 6 
  3 4 5 6 
   4 5 6 
    5 6 
     6 

*/