package formats;
import java.util.*;
public class Format17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter n value : ");
		int n = sc.nextInt();
		for(int i=1; i<=n; i++) 
		{
			for(int j=n-1; j>=i; j--) 
				System.out.print(" "); 
		    for(int k=1; k<=i; k++)
					System.out.print(i); 
			System.out.println();
		}

	}

}
/*Sample Output-
Enter n value : 4
   1
  22
 333
4444
*/
