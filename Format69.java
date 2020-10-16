/*package formats;
import java.util.Scanner;
public class Format69 {

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
				System.out.print(Math.abs(Math.abs(i)-(n+1))+" ");
			System.out.println();
		}

	}

}
Sample Output:
Enter n value : 5
     1 
    2 2 
   3 3 3 
  4 4 4 4 
 5 5 5 5 5 
6 6 6 6 6 6 
 5 5 5 5 5 
  4 4 4 4 
   3 3 3 
    2 2 
     1 


*/
/*Method2

package formats;
import java.util.Scanner;
public class Format69 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter n value : ");
		int n = sc.nextInt();
		int x=1;
		for(int i=n; i>=-n; i--)
		{
			for(int j=1; j<=Math.abs(i); j++)
				System.out.print(" ");
			for(int k=n; k>=Math.abs(i); k--)
				System.out.print(x+" ");
			System.out.println();
			if(i>0)
			x=x+1;
			else
			x=x-1;
		}

	}

}
*/
