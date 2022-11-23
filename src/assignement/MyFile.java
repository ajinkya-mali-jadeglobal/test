package assignement;

import java.io.*;
import java.util.*;
import java.util.regex.MatchResult;
import java.util.stream.Stream;


public class MyFile {

	public static void main(String[] args) throws IOException,FileNotFoundException  {
		// TODO Auto-generated method stub
		System.out.println("\n\"\033[1mA program is to search entered word through the file\033[0m\"\n");
	String string;
	 boolean flag = false;
	String string_1; 
	File myFile=new File("TestFile.txt");
	FileWriter mywrite=new FileWriter("TestFile.txt");
	mywrite.write("Java Create Excel File\r\n"
			+ "In Java, read excel file and write excel file is a bit"
			+ " tricky because excel worksheet has cells to store data."
			+ " Java does not provide direct API to read or write Microsoft "
			+ "Excel or Word documents. We have to rely on the third-party library "
			+ "that is Apache POI. In this section, we will learn how to create an excel"
			+ " file in Java and how to write or insert data in the excel file using the "
			+ "Apache POI Java library.");
	mywrite.close();
		if(myFile.createNewFile())
		{
			System.out.println("File created :- \n"+myFile.getName());
		}
		else
		{
			System.out.println("File is already created.\n");
				System.out.println("Enter String to search through the file.\n");
				System.out.print("Enter string : ");
				Scanner scanner=new Scanner(System.in);
				string=scanner.next();
				FileReader fileread=new FileReader("TestFile.txt");
				Scanner obj=new Scanner(fileread);
				while(obj.hasNextLine())
				{
				
					 string_1=obj.nextLine();
					if(string_1.indexOf(string)!=(-1))
						
					{
						flag=true;
					}	
				}
				
				  if(flag) 
				  {
				         System.out.println("\nThe entered string is \""+"\033[1m"+string+"\033[0m"+"\" and, File contains entered string");
				         
				   }
				  else 
				  {
					  System.out.println("\nThe entered string is \""+string+"\" and, File does not contain entered string");
				  }
			}
	}

}
