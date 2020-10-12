package formats;
import java.util.*;
public class Format15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter n value : ");
		int n = sc.nextInt();
		for(int i =n; i>=1; i--) 
		{
			for(int j=1; j<=i; j++) 
			{
				System.out.print(j); 
			}
			System.out.println();
		}

	}

}
/*Sample output
--------------------
Enter n value : 5
12345
1234
123
12
1
*/
