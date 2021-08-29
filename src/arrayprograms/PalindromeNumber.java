package arrayprograms;

public class PalindromeNumber {

	public static void main(String[] args)
	{
		int num=707;
		int revNum = 0;
		int sum=0,r;
		while(num>0)
		{
			r=num%10;
			revNum=(revNum*10)+r;
			num=num/10;
		}
		System.out.println(revNum);
	}

}
