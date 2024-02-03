import java.util.*;

public class array
{
	public static void main(String args[])
	     {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n : ");
		int n = sc.nextInt();
		int a[] = new int[n];
		int sum = 0;
		System.out.println("Enter your Elements : ");
		for(int i=0 ; i<n ; i++)
			{
				a[i] = sc.nextInt();
				sum = sum + a[i];
			}
				System.out.println("Sum of given array elements is "+sum);
		
		}
}