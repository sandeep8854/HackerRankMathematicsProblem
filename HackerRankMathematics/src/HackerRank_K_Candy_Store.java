import java.util.Scanner;

public class HackerRank_K_Candy_Store
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		for(int i=0;i<T;i++)
		{
			int N=sc.nextInt();
		
				int K=sc.nextInt();
				
					int result=factorial(N)/(factorial(K)*factorial(N-K));
					System.out.println(result);
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
