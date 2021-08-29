package practiceString;

public class SecondRepeated
{
	@SuppressWarnings("unused")
	public static void main(String[] args) 
	{
		String name ="vandanmishraismyname";
	    char[] name2= name.toCharArray();
		
	    String name3="";
	    //char[] name4= name3.toCharArray();
	    int flag=0;
	    int count=0;
	    for(int i=0;i<name.length();i++)
	    {
	    	      flag=0;
	    	      char [] name4=name3.toCharArray();
	    	      for(int j=0;j<name4.length;j++)
	              {
	            	  if(name2[i]==name4[j])
	            	  {
	            		 // System.out.println("first repeated character is"+name2[i]);
	            		  flag=1;
	            		  count++;
	            		  break;
	            	  }
	              }
	    	      if(flag==1 && count==5)
	    	      {
	    	    	  System.out.println("second repeated character is "+name2[i]);
	    	    	  break;
	    	      }
	    	      
	    	      name3=name3+name2[i];
	    } 
	}
}
