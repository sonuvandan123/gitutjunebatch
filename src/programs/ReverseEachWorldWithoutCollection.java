package programs;
public class ReverseEachWorldWithoutCollection 
{
	public static void main(String[] args)
	{
		String value="Reverse each word";
		ReverseEach obj=new ReverseEach();
		obj.reverse(value);
	}
}
class ReverseEach 
{
	 void reverse(String str)
	 {
		 String[] rev=	str.split(" ");
		 String finalRev="";
		 String revString="";
		 for(int i=rev.length-1;i>=0;i--)
		 {
			 for(int j=rev[i].length();j>=0;j--)
			 {
				 revString="";
				 char[] array1= rev[i].toCharArray();
				 for(int k=array1.length-1;k>=0;k--)
				 {
				      revString= revString+array1[k];   
				 }
			 }	 
			 finalRev=finalRev+revString+" ";
		 }
		 System.out.println(finalRev);
	 }
}
