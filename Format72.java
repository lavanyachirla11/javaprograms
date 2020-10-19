package formats;
import java.util.Scanner;
public class Format72 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter n value : ");
		int n = sc.nextInt();
		int x=1;
		for(int i=n; i>=-n; i--)
		{
			for(int j=1; j<=Math.abs(i); j++)
				System.out.print(" ");
			for(int k=n; k>=Math.abs(i); k--)
				System.out.print((char)(64+x)+" ");
			System.out.println();
			if(i>0)
			x=x+1;
			else
			x=x-1;
		}

	}

}
/*Sample Output:
Enter n value : 5
     A 
    B B 
   C C C 
  D D D D 
 E E E E E 
F F F F F F 
 E E E E E 
  D D D D 
   C C C 
    B B 
     A 

*/