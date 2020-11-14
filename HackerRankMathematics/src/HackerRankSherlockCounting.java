import java.util.Scanner;
public class HackerRankSherlockCounting 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The n and K Value ? ?");
		int n1=sc.nextInt();
		int k1=sc.nextInt();
		sherlockCounting(n1,k1);
	}
	private static void sherlockCounting(int n, int k)
	{
		int count=0;
		for(int i=1;i<n;i++)
		{
			if(i*(n-i)<=n*k)
			{
				count++;
			}
		}
		System.out.println(count);	
	}
}
