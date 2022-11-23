package assignement;

import java.util.*;

public class IncomeTax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("\n\"\033[1mA program is calculate incpme tax based on salary\033[0m\"\n");
		float income,income_tax;
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter your income: ");
		income=scanner.nextFloat();
		System.out.print("\n");
		if(income>=0.0 && income<=50000.00)
		{
			System.out.println("Just relax, you don't need to pay any kind of income tax.");
		}
		else if(income>50000.00 && income<=60000.00)
		{
			income_tax=(((income-50000)*10)/100);
			System.out.println("Opps!! your income is beyond limit, you need to pay income tax Rs."+"\033[1m"+income_tax+"\033[0m");
		}
		else if(income>60000.00 && income<=150000.00)
		{
			income_tax=(((income-50000)*20)/100);
			System.out.println("Opps!! your income is beyond limit, you need to pay income tax Rs."+"\033[1m"+income_tax+"\033[0m");
		}
		else if(income>150000.00)
		{
			income_tax=(((income-50000)*30)/100);
			System.out.println("Opps!! your income is beyond limit, you need to pay income tax Rs."+"\033[1m"+income_tax+"\033[0m");
		}
	
	}

}
