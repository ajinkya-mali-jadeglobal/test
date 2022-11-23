package assignement;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//printing output statement about the program
		System.out.println("\n\"\033[1mA program to print only prime numbers between 1 and 100.\033[0m\"\n ");
		System.out.println("Prime numbers are:- \n");
		int number,divisible_number,temp;
		for( number = 2 ; number <= 100; number++)
		{
			temp=0;
			for(divisible_number = 2 ;divisible_number < number; divisible_number++)
			{
				if(number%divisible_number==0)
				{
					temp=1;
					break;
				}
				
				
			
			}
			
			
			if(temp==0)
			{
				System.out.print( " " +number);
			
			}
				
				
		}
	
		
	
		
	}

}
