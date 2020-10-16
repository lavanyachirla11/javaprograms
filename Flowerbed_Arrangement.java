import java.util.*;
public class Flowebed_Arrangement {
	public static void main(String[] args) {
	   Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();       
         int a[]=new int[n];
     
       for(int i=0;i<n;i++)
       {
     	  a[i]=sc.nextInt();
       }
       
       int num=sc.nextInt();
       int c=0;
       for(int i=0;i<n;i++)
       {
    	   if(a[i]==0 && (i==0||a[i-1]==0) && (i==n-1||a[i+1]==0))
    	   {
    		   c++;
    	   }
       }
       if(c >= num)
         System.out.println("True");
       else
    	  System.out.println("False");
	}

}