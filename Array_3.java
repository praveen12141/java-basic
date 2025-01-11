package Array;

public class Array_3 
{
	public static void main(String[] args) 
	{
			int sum=0;
	        // Define a 3x3 array
	        int[][] array = {
	            {1, 2, 3},
	            {4, 5, 6},
	            {7, 8, 9}
	        };

	        // Print the diagonal elements
	        System.out.println("Diagonal elements:");
	        for (int i = 0; i < 3; i++) 
	        {
	            System.out.println(array[i][i]);
		        sum=sum+array[i][i];

	        }
	        System.out.println("Diagonal elements:"+sum);
 
	}
	
}

