import java.util.Scanner;

public class BurgerSoda 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Burger Selling price  ?  ?" );
		int burger=sc.nextInt();
		System.out.println("Enter Soda Selling Price ?   ?");
		int soda=sc.nextInt();
		System.out.println("Enter Combo Selling Price ?   ?");
		int combo=sc.nextInt();
		int result=fixedProfit(burger,soda,combo);
		System.out.println("Fixed Profit is : " +result);
	}

	private static int fixedProfit(int burger, int soda, int combo)
	{
	 return (burger+soda)-combo;
	}
}
/*
Enter Burger Selling price  ?  ?
199
Enter Soda Selling Price ?   ?
199
Enter Combo Selling Price ?   ?
255
Fixed Profit is : 143
*/

