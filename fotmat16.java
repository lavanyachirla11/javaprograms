package formats;
import java.util.*;
public class fotmat16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter n value : ");
		int n = sc.nextInt();
		for(int i=n; i>=1;i--)
		{
			for(int j =1 ; j<=i; j++)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}

	}

}
/*Sample Output
Enter n value : 5
5 5 5 5 5 
4 4 4 4 
3 3 3 
2 2 
1 
*/