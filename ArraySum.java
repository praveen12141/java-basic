package Array;
import java.util.Scanner;

public class ArraySum 
{

	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		
		//System.out.println("add a no");
		//int b = sc.nextInt();
		int a[] = {10,20,30};
		int sum=0;
		int avg =0;
		for(int i=0;i<a.length;i++)
		{
			System.out.println("array is  :"  +a[i]);
			sum =sum+a[i];
			avg =sum/a.length;
				
		}
		System.out.println("-------------------------------");

		System.out.println("sum of array  :" + sum);
		System.out.println("avg of array  :" + avg);


		
	}

}
