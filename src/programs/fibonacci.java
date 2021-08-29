package programs;

public class fibonacci {

	public static void main(String[] args) {
	  // 0,1,1,2,3,5..
		int prev=0,next=1,value;
		System.out.println(prev+ "\n"+ next);
		for(int i=0;i<5;i++)
		{
			value=prev+next;
			prev=next;
			next=value;
			System.out.println(value);
		}
		
	}

}
