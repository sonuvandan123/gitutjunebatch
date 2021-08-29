package arrayprograms;

public class FindLargestElement {

	public static void main(String[] args) 
	{
		int numbers[] = {10,15,5,23,17};
		int temp=0;
		for(int i=0;i<numbers.length;i++)
		{
		     for(int j=i+1;j<numbers.length;j++)
		     {
		    	 if(numbers[j]>numbers[i])
		    	 {
		    		 temp=numbers[i];
		    		 numbers[i]=numbers[j];
		    		 numbers[j]=temp;
		    	 }
		     }
		     for( i=0;i<numbers.length;i++)
		 		System.out.println(numbers[i]);
		}
		for(int i=0;i<numbers.length;i++);
		//System.out.println(numbers[i]);
	}

}
