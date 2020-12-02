package stringprgms;
import java.util.*;
public class Toggle_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter String : ");
		String str = sc.nextLine(); 
		
		String words[] = str.split("\\s");
		
		String toggle = "";
		 for(String w : words)
		 {
			 String first = w.substring(0,1);
			 String afterfirst = w.substring(1);
			 
			 toggle = toggle + first.toLowerCase()+
					 afterfirst.toUpperCase()+" ";
		 }
		 System.out.println(toggle);
	}

}
