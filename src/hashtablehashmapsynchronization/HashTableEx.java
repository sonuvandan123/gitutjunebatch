package hashtablehashmapsynchronization;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class HashTableEx {

	public static void main(String[] args) 
	{
		HashMap<Integer,String> obj1=new HashMap<>();
		HashMap<Integer,String> obj2=new HashMap<>();
		
		obj1.put(1,"vandan");
		obj2.put(2,"sati");
		obj1.put(2,"mishra");
		
		obj2.put(1,"anil");
		obj1.put(3,"sumit");
		obj1.put(4,"goyal");
		
		obj2.put(3,"anjali");
		obj2.put(4,"singhal");
	
	    Set<Integer> obj=obj1.keySet();
		for (Integer integer : obj) {
			System.out.println("key ->" +integer +" Value " +obj1.get(integer));
			
		}
	}

}
