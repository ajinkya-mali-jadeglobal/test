package assignement;

import java.util.*;
public class RepeatWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str;
		int i,j;
		char last_char='a' ;
		Scanner scanner=new Scanner(System.in);
		System.out.println("\n\"\033[1mA program to check last non-repeating character from string.\033[0m\"");
		System.out.println("\nEnter string to check last non-repeating character from string.");
		System.out.print("\nEnter string :- ");
		str=scanner.next();
		str+=scanner.nextLine();
		scanner.close();
		System.out.println("\nEnterted string is:- "+str);
		for(i=0;i<=str.length()+1;i++)
		{
			for(j=i+1;j<str.length();j++)
			{
				if(str.charAt(i)!=str.charAt(j))
				{
				
					last_char=str.charAt(i);	
				}
			}
		}
		System.out.println("\nThe last non-repeating character of your enterted string is :- "+"\"" +"\033[1m"+last_char+"\033[0m"+"\"");	
	}
}
