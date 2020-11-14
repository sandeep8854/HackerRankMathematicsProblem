import java.util.Scanner;

public class Combination 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		for(int i=1;i<T;i++)
		{
			int N=sc.nextInt();
	    	for(int j=0;j<N;j++)
	    	{
	    		int result=factorial(N)/(factorial(j)*factorial(N-j));	
	    		System.out.println(result);
	    	}
		}
	}

	private static int factorial(int n)
	{
		int fact=1;
		int i=1;
		while(i<=n)
		{
			fact=fact*i;
			i++;
		}
		return fact;
	}
}
