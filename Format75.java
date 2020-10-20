package formats;
import java.util.*;
public class Format75 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter n value : ");
		int n = sc.nextInt();
		int x = n; 
		int y = n; 
		
		for(int i = 1; i <= n; i++)
		{
			for(int j= 1; j<= (n*2)-1; j++)
			{
				if(j==x || j==y) 
					System.out.print("*");  
				else
					System.out.print(" ");
			}
			System.out.println();
			x = x-1; 
			y = y+1;
		}

	}

}
/*Sample Output:
Enter n value : 4
   *   
  * *  
 *   * 
*     *    
*/
