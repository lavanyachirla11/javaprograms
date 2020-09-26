package formats;
import java.util.*;
public class format1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number :");
		int n=sc.nextInt(); 
		int i = 1;
		while(n != 0) 
		{
			if(i<n) 
			{
				System.out.print(i+" ");   
				i++;  
			}
			else
				System.out.print(n--   +" "); 
		}

	}

}
/* Sample Output
-------------------
Enter number :5
1 2 3 4 5 4 3 2 1 
*/