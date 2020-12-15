/*Given a binary array, find the maximum number of consecutive 1s in this array.

Example 1:

Input:

6

1 1 0 1 1 1

Output:

3

Explanation: The first two digits or the last three digits are consecutive 1s.

    The maximum number of consecutive 1s is 3.

Note:

The input array will only contain 0 and 1.
The length of input array is a positive integer and will not exceed 10,000
 */
import java.util.*;
public class Binary_Array
{
 static int findMaxConsecutiveOnes(int[] input) {
  int currentCount = 0;
  int max = 0;
  for (int n : input) {
   currentCount = n == 0 ? 0 : currentCount + 1;
   max = Math.max(max, currentCount);
  }
  return max;
 }
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int arr[]=new int[n];

for(int i=0;i<n;i++)
{
    arr[i]=sc.nextInt();
}
int count=findMaxConsecutiveOnes(arr);
System.out.println(count);
}
}
