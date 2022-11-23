package assignement;

import java.util.Scanner;
import operation.bankOperation;

//main class
public class BankDetails {

	//main function
	public static void main(String[] args)  {
		//another class created for operations
		bankOperation BO=new bankOperation();
		int number;
		boolean exit=true;
		//scanner used to accept user input
		Scanner sc=new Scanner(System.in);
		do
		{
			System.out.print("\n");
			System.out.println("			\033[1mWelcome to the Jade-Finance\033[0m	 ");
			System.out.println("	1. Enter \"1\" to create account. ");
			System.out.println("	2. Enter \"2\" to deposit money. ");
			System.out.println("	3. Enter \"3\" to withdraw money. ");
			System.out.println("	4. Enter \"4\" to check balance. ");
			System.out.println("	5. Enter \"5\" to terminate process. ");
			number=sc.nextInt();
		switch(number)
				{
				case 1:
					BO.new_account();
					break;
				case 2:
					BO.add_money();
					break;
				case 3:
					BO.withdraw_money();
					break;
				case 4:
					BO.show_balance();
					break;
				case 5:
					exit(0);
					exit=false;
					break;
				default:
					System.out.println("You entered wrong choice.");
					main(null);
				}
			}while(exit=true);
		
	}
	private static void exit(int i) {
		// TODO Auto-generated method stub
		System.out.println("exit....");
		System.exit(0);
	}
}
