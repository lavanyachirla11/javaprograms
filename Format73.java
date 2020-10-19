package formats;
import java.util.Scanner;
public class Format73 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter n value : ");
		int n = sc.nextInt();
		int x=1;
		int j;
		for(int i=n; i>=-n; i--)
		{
			for( j=1; j<=Math.abs(i); j++)
				System.out.print(" ");
			x=(i>0)?1:j;
			for(int k=n; k>=Math.abs(i); k--)
			{
				System.out.print((char)(64+x)+" ");
				x=x+1;
			}
			System.out.println();
			
		}

	}

}
/*Sample Output:
Enter n value : 5
     A 
    A B 
   A B C 
  A B C D 
 A B C D E 
A B C D E F 
 B C D E F 
  C D E F 
   D E F 
    E F 
     F 

*/