package formats;
import java.util.Scanner;
public class format2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter n value : ");
		int n = sc.nextInt();
		for(int i =1; i<=n;i++) 
		{
			for(int j=1; j<=n;j++) 
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
/*Sample Output
 ---------------
Enter n value : 5
*****
*****
*****
*****
*****
 */

