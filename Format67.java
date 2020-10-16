package formats;
import java.util.Scanner;
public class Format67 {

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
				System.out.print("* ");
			System.out.println();
		}

	}

}
/* Sample Output:
Enter n value : 5
     * 
    * * 
   * * * 
  * * * * 
 * * * * * 
* * * * * * 
 * * * * * 
  * * * * 
   * * * 
    * * 
     * 

*/