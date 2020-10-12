package formats;
import java.util.Scanner;
public class Format51 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter n value : ");
		int n = sc.nextInt();
		for(int i=n; i>=-n; i--) 
		{
			for(int j = n; j>=Math.abs(i); j--)
				System.out.print((char)(j+65)+" "); 
			
		System.out.println();
		}
	}

}
/*Sample Output:
Enter n value : 3
D 
D C 
D C B 
D C B A 
D C B 
D C 
D 
*/