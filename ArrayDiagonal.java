package Array;

public class ArrayDiagonal // right diangonal
{
	public static void main(String[] args)
	{
		int sum=0;
		int[][]a= {
				{1,2,3},
				{3,4,5},
				{6,7,8}
						};
		System.out.println("Right diagonal of array");
		for(int i=0;i<3;i++)
		{
			System.out.println(a[i][2-i]);
			sum=sum+a[i][2-i];
		}
		System.out.println("this is sum of diagonal : "+sum);

	}
}
