package formats;
import java.util.Scanner;
public class Format84 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter n value : ");
		int n = sc.nextInt();
		int x = 1; 
		int y = (n*2)-1; 
		
		for(int i = n; i >= 1; i--)
		{
			for(int j = 1; j<= (n*2)-1; j++)
			{
				if(j==x || j==y) 
					System.out.print((char)(i+64));  
				else
					System.out.print(" ");
			}
			System.out.println();
			x = x+1; 
			y = y-1;
		}

	}

}
/*Sample Output:
Enter n value : 5
E       E
 D     D 
  C   C  
   B B   
    A    
*/