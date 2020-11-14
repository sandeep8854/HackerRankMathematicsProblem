import java.util.Scanner;

public class ChoosenOne 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Array Length ? ");
		int N=sc.nextInt();
		int arr[]=new int[N];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		thechoseone(arr);
	}
	private static void thechoseone(int[] arr) 
	{
		int count=0;
		int j=2;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%j==0)
			{
				count++;
				j++;
			}
		}
		System.out.println(count);	
	}
}
