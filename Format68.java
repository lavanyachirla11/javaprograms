package formats;
import java.util.Scanner;
public class Format68 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter n value : ");
		int n = sc.nextInt();
		for(int i=n; i>=-n; i--)
		{
			for(int j=1; j<=Math.abs(i); j++)
				System.out.print(" ");
			for(int k=n; k>=Math.abs(i); k--)
				System.out.print(k+" ");
			System.out.println();
		}

	}

}
/* Sample Output:
Enter n value : 5
     5 
    5 4 
   5 4 3 
  5 4 3 2 
 5 4 3 2 1 
5 4 3 2 1 0 
 5 4 3 2 1 
  5 4 3 2 
   5 4 3 
    5 4 
     5 

*/