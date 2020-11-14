import java.util.Arrays;
import java.util.Scanner;

public class MeanMediumMode 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Length ?");
		int length=sc.nextInt();
		int arr[]=new int[length];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		double result=means(arr);
		System.out.println("Mean is  " + result);
		double result1=median(arr);
		System.out.println("median  is " + result1);
		double result2=mode(arr);
		System.out.println("Mode is " + result2);
	}

	private static double mode(int[] c)
	{
		int maxValue = 0,maxCount = 0;
		for(int i=0;i<c.length;i++)
		{
			int count=0;
			for(int j=0;j<c.length;j++)
			{
				if(c[i]==c[j])
					count++;
			}
			if(count >maxCount)
			{
				maxCount=count;
				maxValue=c[i];
			}
		}	
		return maxValue;
	}

	private static double median(int[] b)
	{
		Arrays.sort(b);
		int size=b.length;
		int middle=size/2;
		if(b.length%2==1)
		{
			return b[middle];
		}else
		{
			return (double)(b[middle-1]+b[middle])/2;
		}
	}

	private static double means(int[] a)
	{
		double mean=0;
		int sum=0;
		int size=a.length;
		for(int i:a)
		{
			sum=sum+i;
		}
		mean=(double)sum/size;
		return mean;
	}
}
/*
Enter Any Length ?
9
3
7
8
5
12
14
21
13
18
Mean is  11.222222222222221
median  is 12.0
Mode is 3.0

*/
	


