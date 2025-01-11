package Array;
import java.util.Scanner; 
 		
   
public class BubbleSort 
{
  static void Shorting(int [] a)
  {
	 	  int temp=0;
	 	  boolean b= false;
	  for(int pass =0;pass<a.length;pass++) //10,20,40,60,80,30
	  {
	  
		  	for(int i=0;i<a.length-1;i++)
		  	{
		  		if(a[i]>a[i+1])
		  		{
		  			temp=a[i];
		  			a[i]=a[i+1];
		  			a[i+1]=temp;
			  
		  			
		  			b= true;
		  		}  		
		  	}
		  	if(b==false) 
	  		{
	  			break;
	  		}
	  }
	 
	  		for(int i=0;i<a.length;i++)
	  		{
			  System.out.println(a[i]); 
	  		}
	   
  	}

	
	public static void main(String[] args)   
	{  
			int [] a= {10,20,40,60,80,30};
			BubbleSort.Shorting(a);
	}
}



