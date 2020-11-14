import java.util.Scanner;

public class BirthdayGift 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any Length ");
		int N=sc.nextInt();
		System.out.println("Enter " +N+ " Length Of Array ");
		int arr[]=new int[N];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		bDay(arr);	
	}
	private static void bDay(int[] arr)
	{
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
		}
		System.out.println("Total Number of Step : " +sum/2 + ((sum%2==0) ? ".0" : ".5"));	
	}
}
/*
Enter any Length 
3
Enter 3 Length Of Array 
1
1
2
Total Number of Step : 2.0
*/
