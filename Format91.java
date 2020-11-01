package formats;
import java.util.Scanner;
public class Format91 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter n value : ");
		int n = sc.nextInt();

		for(int i=1; i<= n; i++) 
		{
			for(int j=1; j < n*2; j++)
			{
				if(j <=i|| j >=n*2-i) 
					System.out.print("*"); 
				else
					System.out.print(" ");
			}
			System.out.println();
		}

	}

}
/*Sample Output:
Enter n value : 5
*       *
**     **
***   ***
**** ****
*********
*/