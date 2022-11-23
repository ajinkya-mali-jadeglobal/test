package operation;

import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import assignement.BankDetails;

public class bankOperation {
	
	public Random rand = new Random();
	//new_account() variables
	public String name,F_name="",L_name="";
	public float account_balance;
	public int account_number,acc_number;
	public int rand_int1;
	public float acc_balance;
	
	// withdraw_money() variables
	public float remaining_balance;
	public float with_money,temp_money;
	public int with_acc_number;
	
	//show_balance() variables
	public int show_acc_number;
	
	public int new_try;
	 
	
	
	//account creation function
	public void new_account()  {
		
		try
		{
		Scanner sc=new Scanner(System.in);
		System.out.println("Please, read it!!. After few sconds you will be redirected to the registration form.");
		
		
		System.out.println("1.For new user please deposite Rs.500 to open account.");
		System.out.println("2.Minimum account balance Rs.500.\n");
		TimeUnit.SECONDS.sleep(5); 
		System.out.println("		Thanks For Reading!!\n");
		
		System.out.println("		New account creation from!!!!\n");
		System.out.print(" Please, Enter Your First Name: "+F_name);
		F_name=sc.next();
		System.out.print("\n");
		System.out.print(" Please, Enter Your Last Name: "+L_name);
		L_name=sc.next();
		name=F_name+" "+L_name;
		System.out.print("\n");
		System.out.print(" Enter amount to deposit: ");
		account_balance=sc.nextFloat();
		if(account_balance<500)
		{
			System.out.println("Sorry, you enterned worng deposit amount.");
			System.out.println("If you want to continue,Please enter \"1\"");
			System.out.println("Else, enter any interger value only");
			new_try=sc.nextInt();
			if(new_try==1)
			{
			new_account();
			}
			
		}
		
		else
		{	
			System.out.println("\n");
			System.out.print("		Welcome, "+name+" ,Congradulations, Account created sucessfully!!!\n");
			account_number = rand.nextInt(1000);
			System.out.println("  Account number: "+account_number);
			System.out.println("  Account holder name: "+name);
			System.out.println("  Account balance : "+account_balance);
			System.out.println("\n");
			TimeUnit.SECONDS.sleep(3);   
		}
		
		}
		catch(InterruptedException ex)
		{
			  ex.printStackTrace();
		}
	}
	
	
	//Deposit money function
	public	void add_money()   {
		// TODO Auto-generated method stub
		try 
		{
			Scanner sc=new Scanner(System.in);
			//System.out.println(account_number);
			System.out.println("		Money deposit section.\n");
			System.out.print("  Enter account number: ");
			acc_number=sc.nextInt();
			System.out.println("\nJust wait for few seconds, we are validating your data.\n");
			TimeUnit.SECONDS.sleep(5); 
			if(account_number==acc_number && acc_number!=0)
			{
				System.out.println("		Welcome, "+name+		   " "+account_number+"\n");
				System.out.print(" Enter amount to deposit: ");
				acc_balance=sc.nextFloat();
				account_balance+=acc_balance;
				//TimeUnit.SECONDS.sleep(2); 
				System.out.println();
				System.out.println("	Amount deposited successflly.");
				System.out.println("	Current balance is:- "+account_balance);
				System.out.println("		Thank You!!");
				TimeUnit.SECONDS.sleep(4); 
				
			}
			else
			{
				
				System.out.println("Sorry, you entered wrong account number.");
				System.out.println("If you want to continue,Please enter \"1\"");
				System.out.println("Else, enter any interger value only");
				new_try=sc.nextInt();
				if(new_try==1)
				{
					//System.out.println(" Don't worry we are here for you,just wait\n2");
				//TimeUnit.SECONDS.sleep(3);
					System.out.println(" Do your transaction again,Now!!\n");
					add_money();
				}
			}
		}
		catch(InterruptedException ex)
		{
			  ex.printStackTrace();
		}
		
	}



		//withdraw money function
		public void withdraw_money()  {
		
			try
			{
				// TODO Auto-generated method stub
				Scanner sc=new Scanner(System.in);
				System.out.print("\n Enter account number: ");
				with_acc_number=sc.nextInt();
				if(with_acc_number==account_number && account_number!=0)
				{
					System.out.println(" \nJust wait for few seconds, we are validating your data.\n");
					TimeUnit.SECONDS.sleep(3); 
					System.out.println(" 			Welcome, "+name+		   " "+account_number);
					System.out.println(" 	Account balance is: "+account_balance);
					temp_money=account_balance-500;
					System.out.println(" 	You can withdraw amount upto Rs."+temp_money);
					if(temp_money==0.0)
					{
						System.out.print("	Account balance reached to minimum limit, Please, deposit money.\n");
						TimeUnit.SECONDS.sleep(3); 
					}
					else
					{
						System.out.print("  \n Enter amount to withdraw:- ");
						with_money=sc.nextFloat();
						if(account_balance>500)
						{
							if(with_money<=temp_money)
							{
								System.out.println();
								System.out.println("		Money withdrawl done!!");
								account_balance=account_balance-with_money;
								System.out.println("	Account balance is:- "+account_balance);
								System.out.println("		Thank You!!");
								TimeUnit.SECONDS.sleep(5); 
							}
							else
							{
								System.out.print("\n  You need to maintain account balance Rs.500");
								System.out.print("\n  Sorry, you can't withdraw money");
								TimeUnit.SECONDS.sleep(5); 
								
							}
						}
						else
						{
							System.out.println(" Your account balance is low, Rs. "+account_balance);
							System.out.println("\n Please, maintain balance more than Rs.500");
							TimeUnit.SECONDS.sleep(5); 
							
						}
					}
				}
				else
				{
					System.out.print("\n 	Entered account number is wrong!!\n\n");
					TimeUnit.SECONDS.sleep(3); 
					
				}
				
			}
			catch(InterruptedException ex)
			{
				  ex.printStackTrace();
			}
		}

		
		//check balance function
		public void show_balance()  {
			try
			{
				// TODO Auto-generated method stub
				Scanner sc=new Scanner(System.in);
				System.out.print(" Enter account number: ");
				show_acc_number=sc.nextInt();
				System.out.println("\nJust wait for few seconds, we are validating your data.");
				TimeUnit.SECONDS.sleep(3);
				if(account_number == show_acc_number && account_number!=0)
				{
					System.out.println("\n");
					
					System.out.println("		Welcome, "+name+" at Jade-Finance");
					System.out.println("Account number is:- "+account_number);
					System.out.println("Account holder name is:- "+name);
					System.out.println("Account balance is:- "+account_balance);
					TimeUnit.SECONDS.sleep(8); 
				}
				else
				{
					System.out.println("\nYour entered wrong account number.");
					System.out.println("If you want to continue,Please enter \"1\"");
					System.out.println("Else, enter any interger value only");
					new_try=sc.nextInt();
					if(new_try==1)
					{
						show_balance();
					}
					
				}
			}
			catch(InterruptedException ex)
			{
				  ex.printStackTrace();
			}
		
		}	
}
