import java.util.Scanner;

public class ClosetNumber 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
	/*	int T=sc.nextInt();
		for(int i=0;i<T;i++)
		{  */
			System.out.println("Enter A Value ?");
			int A=sc.nextInt();
			System.out.println("Enter B value ?");
			
			int B=sc.nextInt();
			System.out.println("Enter X Value ?");
			int X=sc.nextInt();
			int result=closestNumber(A,B,X);	
			System.out.println("Result will be : " +result);
	//	}
	}

	private static int closestNumber(int a, int b, int x)
	{
		 int power=(int)Math.pow(a,b);
	        int reminder=power%x;
	        if(reminder<=x/2)
	        return power-reminder;
	        return power+x-reminder;
	}

}
/*
Enter A Value ?
349
Enter B value ?
1
Enter X Value ?
4
Result will be : 348
*/