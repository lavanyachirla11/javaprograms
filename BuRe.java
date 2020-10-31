package files;
import java.io.*;
public class BuRe {
	

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		char c;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Characters,q to quit");
		do
		{
			c=(char)(br.read());
			System.out.println(c);
		}while(c!='q');

	}

}
