package formats;
import java.util.Scanner;
public class Format7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter n value : ");
		int n = sc.nextInt();
		for(int i=n; i>=1; i--) 
		{
			for(int j=1; j<=n; j++) 
			{
				System.out.print(i); 
			}
			System.out.println();
		}

	}

}
/*Sample output
--------------------
Enter n value : 5
55555
44444
33333
22222
11111
*/
