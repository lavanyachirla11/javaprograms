package formats;
import java.util.Scanner;
public class Format4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter n value : ");
		int n = sc.nextInt();
		for(int i =1; i<=n; i++) 
		{
			for(int j=1; j<=n; j++) 
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
12345
12345
12345
12345
*/
