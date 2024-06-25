package PracticeJavaProgram;

import java.util.Scanner;

public class ArstromgNumber {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int no = sc.nextInt();
		int t1 = no;
		int rem;
		int lenght = 0;
		while(t1!=0)
		{
			t1 = t1/10;
			lenght = lenght+1;
		}
		int t2 = no;
		int arm = 0;
		while(t2!=0)
		{
			int mul = 1;
			rem = t2%10;
			for(int i=1;i<=lenght;i++)
			{
				mul = mul*rem;
			}
			arm = arm + mul;
			t2 = t2/10;
		}
		if(arm==no)
		{
			System.out.println(no + " is armstrong number");
		}
		else
		{
			System.out.println(no + " is not armstrong number");
		}
	}
}
