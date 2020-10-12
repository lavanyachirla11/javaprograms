package formats;
import java.util.Scanner;
public class Format49 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter n value : ");
		int n = sc.nextInt();
		for(int i=n; i>=-n; i--) 
		{
			for(int j =Math.abs(i); j<=n; j++)
				System.out.print(j+" "); 
			
		System.out.println();
		}

	}

}
/*Sample Output:
Enter n value : 4
4 
3 4 
2 3 4 
1 2 3 4 
0 1 2 3 4 
1 2 3 4 
2 3 4 
3 4 
4 
*/
