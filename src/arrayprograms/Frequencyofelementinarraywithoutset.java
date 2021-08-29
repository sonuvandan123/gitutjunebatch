package arrayprograms;

public class Frequencyofelementinarraywithoutset {

	public static void main(String[] args) {
		int num[] =new int[] {1,2,3,4,4,3,2,1,4};
		//System.out.print(num.length);
		
        int arr2[] =new int[num.length];
        int count[] =new int[num.length]; 
        for(int i=0;i<num.length;i++)
        {
        	
        	for(int j=0;j<arr2.length;j++)
        	{
        		if(num[i]==arr2[j])
        		{
        			for(int k=0;k<num.length;k++)
        			{
        				count[k]++;
                		
        			}
        		}
        		else
        		{
        			arr2[j]=num[i];
        		}
        	}
        }
        for(int i=0;i<num.length;i++)
        {
        	System.out.println(num[i] +" || "+count[i] );
        }
		
		
		
	}

}
