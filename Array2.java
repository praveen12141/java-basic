package Array;
import  java.util.Scanner;

public class Array2 {


		public static void main(String[] args) 
		{
//			int arr[] = { 2, 3, 4, 6, 33, 7 };
			Scanner sc = new Scanner(System.in);

			int arr[] = new int[5];

			for (int j = 0; j < arr.length; j++) {
				System.out.print("Enter for arr[" + j + "]: ");
				arr[j] = sc.nextInt();
			}
			int sum = 0;
			for (int j = 0; j < arr.length; j++) {
				sum = sum + arr[j];
				System.out.print(arr[j] + "  ");
			}
			
			System.out.println("\n sum is: "+sum);

		}

	}


