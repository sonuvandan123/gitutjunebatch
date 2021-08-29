package arrayprograms;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfElement 
{

	public static void main(String[] args)
	{
		int num[] =new int[] {1,2,3,4,4,3,2,1,4};
		//System.out.print(num.length);
		
		Map<Integer,Integer> map=new HashMap<>();
		for(int i=0;i<num.length;i++)
		{
			if(map.containsKey(num[i]))
			{
				map.put(num[i],map.get(num[i])+1);
			}
			else
			{
				map.put(num[i],1);
			}
		}
		System.out.println(map);
	
	}

}
