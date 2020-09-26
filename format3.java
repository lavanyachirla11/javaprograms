package formats;
import java.util.Scanner;
public class format3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter n value : ");
		int n = sc.nextInt();
		for(int i =1; i<=n; i++) 
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
 ------------------
Enter n value : 6
111111
222222
333333
444444
555555
666666
*/

