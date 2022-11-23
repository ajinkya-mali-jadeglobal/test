package assignement;

import java.util.*;
public class PerfectNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("\n\"\033[1mA program to find perfect number\033[0m\"\n");
		int number,temp,sum=0;
		int i;
		Scanner scanner=new Scanner(System.in);
		//Enter number to test number is perfect or not
		System.out.print("Enter number to test number is perfect or not.\n\n");
		System.out.print("Enter Number :- ");
		//user input using scanner object 
		number=scanner.nextInt();
		//we are storing our entered number to temp variable
		temp=number;
		for(i=1;i<number;i++)
		{
			if(number%i==0)
			{
				sum+=i;
			}
		}
		if(sum==temp)
		{
			System.out.println("\nNumber "+"\033[1m"+temp+"\033[0m"+" is a perfect number.");
		}
		else
		{
			System.out.println("\nNumber " +temp+" is not a perfect number.");
		}
			

	}

}
