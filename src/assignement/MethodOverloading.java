package assignement;

import java.util.*;
import java.io.*;

public class MethodOverloading {
	
	 void calculate(int a, int b) {
		int x;
		int y;
		int z;
		x=a;
		y=b;
		z=x*y;
		System.out.println("\nCalculation of "+x+" and "+y+" is "+z);
		
		//System.out.println("Calculation is:-  "+z);
		
		
	}
	 
	 void calculate(String name)
	 {
		 String myName;
		 myName=name;
		 System.out.println(myName);
	 }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("\n\033[1mA program is to illustrate method overloading.\033[0m\n");
		MethodOverloading m=new MethodOverloading();
		System.out.println("\033[1mFirst method output:\033[0m");
		m.calculate(2, 3);
		System.out.println("\n\033[1mSecond method output:\033[0m");
		m.calculate("\nAbove calculation is an multiplication operation.");
	}

}
