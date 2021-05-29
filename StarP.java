package Star_Patterns;

import java.util.Scanner;

public class StarP 
{
	static void rightAngle(int length , String symbol)
	{
		for(int i = 0; i < length ; i++)
		{
			for(int j = 0; j <= i; j++)
			{
				System.out.print(" "+symbol);
			}
			System.out.println();

		}
	}


	static void mirrorRight(int length , String symbol)
	{
		int space = length - 1;

		for(int i = 0; i < length; i++)
		{
			for(int j = 0 ; j <= space; j++)
			{
				System.out.print("  ");
			}
			space--;
			for(int j = 0 ; j <=i ; j++)
			{
				System.out.print(symbol);
			}
			System.out.println();

		}
	}

	static void invertedMirriorRight(int length , String symbol)
	{
		int space = 0;
		int symbolCount = length;

		for(int i = 0; i < length; i++)
		{
			for(int j = 0 ; j < space; j++)
			{
				System.out.print("   ");
			}
			space++;
			for(int j = 0 ; j <symbolCount ; j++)
			{
				System.out.print(symbol);
			}
			symbolCount--;
			System.out.println();

		}
	}

	static void triangleP(int length , String symbol)
	{
		int starCount = 1;
		int spaceCount = length-1;

		for (int i = 1; i <= length; i++)	
		{
			for (int j = 1; j <= spaceCount; j++) 	
			{
				System.out.print("   ");
			}
			spaceCount--;
			for (int j = 1;  j <= starCount;  j++)	
			{
				System.out.print(" "+symbol);
			}
			starCount = starCount+2;
			System.out.println();

		}
	}

	static void invertedTraiangle(int length, String symbol)
	{
		int starCount = length;
		int spaceCount = 1;

		for (int i = 0; i < length; i++)	
		{
			for (int j = 0; j <= spaceCount; j++) 	
			{
				System.out.print("   ");
			}
			spaceCount++;
			for (int j = 0;  j < starCount;  j++)	
			{
				System.out.print(" "+symbol);
			}
			starCount = starCount-2;
			System.out.println();

		}
	}

	static void diamondP(int length, String symbol)
	{
		int starCount = 1;
		int spaceCount = 2;
		int mid = (length+1)/2;

		for (int i = 1; i <= length; i++)	  
		{
			for (int j = 1; j <= spaceCount; j++) 	
			{
				System.out.print("   ");
			}
			for (int k = 1; k <= starCount; k++) 	
			{
				System.out.print(" "+symbol);	
			}
			System.out.println();

			if(i < mid)
			{
				starCount = starCount+2;
				spaceCount--;
			}
			else
			{
				starCount = starCount-2;
				spaceCount++;
			}
		}
	}

	static void solidHalf(int length ,String symbol)
	{
		int starCount = 1;
		int mid = (length+1)/2;

		for (int i = 1; i <= length; i++) 
		{
			for (int j = 1; j <= starCount; j++) 
			{
				System.out.print(""+symbol);
			}
			System.out.println();
			if(i < mid )
			{
				starCount++;
			}
			else
			{
				starCount--;
			}
		}

	}


	static void option()
	{
		System.out.println("  ------------ Select Pattern ------------ ");
		Scanner scan = new Scanner(System.in);
		System.out.println(" 1. Right Angle Pattern ");
		System.out.println(" 2. Mirror Right Angle Pattern");
		System.out.println(" 3. Inverted Mirror Right Pattern ");
		System.out.println(" 4. Triangle Pyramid ");
		System.out.println(" 5. Inverted Triangle Pyramid ");
		System.out.println(" 6. Diamond Pattern ");
		System.out.println(" 7.Solid Half Diamond ");
		System.out.println("  ------------------------------------------- ");

		System.out.print("Enter Your Choice :-  ");
		int ch = scan.nextInt();		

		if(ch!=0 && ch <=7)
		{
			System.out.print("Enter Length of pattern you want to print :  ");

		}
		else
		{
			System.out.println("Invalid input choice!!.....");
			System.out.println(" Please select again..");
			System.out.println();
			option();
		}
		int length  = scan.nextInt();
		System.out.print("Enter type of symbol you want :  ");
		String symbol = scan.next();

		System.out.println();

		switch(ch)
		{
		case 1: 
			StarP.rightAngle(length, symbol);
			System.out.println();
			option();
			break;

		case 2: 
			StarP.mirrorRight(length, symbol);
			System.out.println();
			option();
			break;

		case 3: 
			StarP.invertedMirriorRight(length , symbol);
			System.out.println();
			option();
			break;

		case 4:
			StarP.triangleP(length , symbol);
			System.out.println();
			option();
			break;

		case 5:
			StarP. invertedTraiangle(length, symbol);
			System.out.println();
			option();
			break;

		case 6:
			StarP.diamondP(length, symbol);
			System.out.println();
			option();
			break;

		case 7:
			StarP.solidHalf(length,symbol);
			System.out.println();
			option();
			break;

		default:
			System.out.println("Invalid input!!");
			System.out.println();
			option();

		}

	}


	public static void main(String [] args)
	{
		option();	
	}	


}
