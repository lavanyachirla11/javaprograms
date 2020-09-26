package formats;
import java.util.*;
public class Format11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter n value : ");
		int n = sc.nextInt();
		for(int i =1; i<=n;i++) 
		{
			for(int j=1; j<=i;j++) 
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
1
22
333
4444
55555
*/
	