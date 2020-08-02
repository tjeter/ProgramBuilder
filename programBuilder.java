/*
 * Programmer: Tre' Jeter
 * Assignment: CSCI 306 --> Programming Languages
 * Purpose: Write a program builder that outputs the code to develop a program in either 
 * 			Python, C++, or C. The user will decide which language(s) and 
 * 			determine what the program will do based on the code options.
 * Date: 29 April 2020
 */

import java.util.*;

public class programBuilder
{
	public static void main(String [] args)
	{   
	    Scanner scan = new Scanner(System.in); // Reading from System.in
	    System.out.println("Enter your filename");
	    String filename = scan.nextLine();
	    System.out.println();
	    System.out.println("Choose the language, by letter, in which you would like to write the program: A.) Python B.) C++ C.) C");
	  
	    char choice = scan.next().charAt(0);
	    if(choice == 'A')
	    {
        System.out.println(filename + ".py");
	      python();
	    }
	    if(choice == 'B')
	    {
        System.out.println(filename + ".cpp");
	      c_plus();
	    }
	    if(choice == 'C')
	    {
        System.out.println(filename + ".c");
	      c_lang();
	    }
      
	    scan.close();
	}
	  
	@SuppressWarnings("unchecked")
	public static void python()
	{
		@SuppressWarnings("rawtypes")
		ArrayList list = new ArrayList();
		String output = " ";
		String input = " ";
		String comment = " ";
		String loopStatement = " ";
		int loop = 0;
		int option = 0;
		Scanner in = new Scanner(System.in);
		Scanner scan = new Scanner(System.in);
		do
		{
			System.out.println("Enter an option by #: 1.) Output 2.) Input 3.) Comment 4.) Loop 5.) Terminate");
			option = in.nextInt();

			switch(option)
			{
			case 1:
				System.out.println("Enter your desired output");
				output = scan.nextLine();
				System.out.println();
				list.add("print('" + output +"')");
				break;
			case 2:
				System.out.println("Enter type of input: int (integer) or String");
				input = scan.nextLine();
				System.out.println();
				list.add("var = input('" + input + "')");
				break;
			case 3:
				System.out.println("Enter a comment");
				comment = scan.nextLine();
				System.out.println();
				list.add("#" + comment);
				break;
			case 4:
				System.out.println("Enter number of times to loop");
				loop = in.nextInt();
				System.out.println("Enter output for loop");
				loopStatement = scan.nextLine();
				System.out.println();
		        list.add("increment = 0;");
		        list.add("while(increment < " + loop +"):");
		        list.add("---print('" + loopStatement + "')");
		        list.add("---increment++");
				break;
			case 5:
				System.out.println("Program Terminated");
				System.out.println();
				break;
			default:
				System.out.println("Input invalid");
				System.out.println();
			}
		}
		while(option != 5);
	    list.forEach(System.out::println);
	
	    in.close();
	    scan.close();	    
	}
		
	@SuppressWarnings("unchecked")
	public static void c_plus()
	{
		@SuppressWarnings("rawtypes")
		ArrayList list = new ArrayList();
		String output = " ";
		String input = " ";
		String comment = " ";
		String loopStatement = " ";
		int loop = 0;
		int option = 0;
		Scanner in = new Scanner(System.in);
		Scanner scan = new Scanner(System.in);
		do
		{
			System.out.println("Enter an option by #: 1.) Output 2.) Input 3.) Comment 4.) Loop 5.) Terminate");
			option = in.nextInt();

			switch(option)
			{
			case 1:
				System.out.println("Enter your desired output");
				output = scan.nextLine();
				System.out.println();
				list.add("---std::cout << " + output + ";");
				break;
			case 2:
				System.out.println("Enter type of input: int (integer) or String");
				input = scan.nextLine();
				System.out.println();
		        list.add("---" + input + " i;");
		        list.add("---std::cin >> i;");
				break;
			case 3:
				System.out.println("Enter a comment");
				comment = scan.nextLine();
				System.out.println();
				list.add("//" + comment);
				break;
			case 4:
				System.out.println("Enter number of times to loop");
				loop = in.nextInt();
		        list.add("---int sequence = [" + loop + "], i;");
		        list.add("---for(i = 0; i < " + loop + "; i++)");
		        list.add("---{");
		        System.out.println();
				System.out.println("Enter output for loop");
				loopStatement = scan.nextLine();
		        list.add("------std::cout << " + loopStatement + ";");
		        list.add("---}");
				System.out.println();
				break;
			case 5:
				System.out.println("Program Terminated");
				System.out.println();
				break;
			default:
				System.out.println("Input invalid");
				System.out.println();
			}
		}
		while(option != 5);
		System.out.println("#include <iostream>;");
		System.out.println("namespace;");
		System.out.println("int main()");
		System.out.println("{");
		list.forEach(System.out::println);
		System.out.println("return 0;");
		System.out.println("}");

		in.close();
		scan.close();  
	}
		
	@SuppressWarnings("unchecked")
	public static void c_lang()
	{
		@SuppressWarnings("rawtypes")
		ArrayList list = new ArrayList();
		String output = " ";
		String input = " ";
		String comment = " ";
		String loopStatement = " ";
		int loop = 0;
		int option = 0;
		Scanner in = new Scanner(System.in);
		Scanner scan = new Scanner(System.in);
		do
		{
			System.out.println("Enter an option by #: 1.) Output 2.) Input 3.) Comment 4.) Loop 5.) Terminate");
			option = in.nextInt();

			switch(option)
			{
			case 1:
				System.out.println("Enter your desired output");
				output = scan.nextLine();
				list.add("---printf('" + output + "');\n");
				System.out.println();
				break;
			case 2:
				System.out.println("Enter type of input: int (integer) or String");
				input = scan.nextLine();
				list.add("---char stringInput[10];");
				list.add("---scanf(%s," + input + ");");
				System.out.println();
				break;
			case 3:
				System.out.println("Enter a comment");
				comment = scan.nextLine();
				list.add("//" + comment);
				System.out.println();
				break;
			case 4:
				System.out.println("Enter number of times to loop");
				loop = in.nextInt();
				list.add("---for(int i = 0; i <" + loop + "; i++)");
				list.add("---{");
				System.out.println("Enter output for loop");
				loopStatement = scan.nextLine();
				list.add("------printf('" + loopStatement + "');");
				list.add("---}");
				System.out.println();
				break;
			case 5:
				System.out.println("Program Terminated");
				System.out.println();
				break;
			default:
				System.out.println("Input invalid");
				System.out.println();
			}
		}
		while(option != 5);
		System.out.println("#include<stdio.h>");
		System.out.println("int main()");
		System.out.println("{");
		list.forEach(System.out::println);
		System.out.println("return 0;");
		System.out.println("}");

		in.close();
		scan.close();    
	}
}