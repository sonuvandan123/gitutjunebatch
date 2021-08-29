package arrayprograms;

public class SumOfAlldigits 
{
	public static void main(String[] args)
	{
	      int num=458;
	      int r,sum=0;
	      while(num>0)
	      {
	    	  r=num%10;
	    	  sum=sum+r;
	    	  num=num/10;
	    	  
	      }
	      System.out.println(sum);
	}
}
