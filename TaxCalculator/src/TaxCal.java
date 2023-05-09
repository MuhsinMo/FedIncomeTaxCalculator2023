import java.util.Scanner;

public class TaxCal  extends Single
{
	
	public static void main(String[]args) 
	{
		
		Scanner input = new Scanner(System.in);
		
		TaxCal obj = new TaxCal();
		
		System.out.println("What is your filing status?");
		System.out.println("A. Single");
		System.out.println("B. Married, filing seperetely");
		System.out.println("C. Married, filing jointly ");
		
		String status = input.nextLine();
		
		
		
		if(status.equalsIgnoreCase("A"))
		{
			System.out.println("Your filing status is Single.");
			
			System.out.println("Are you the head of the household? (Y/N)");
			String head = input.nextLine();
			
			System.out.println("What is your income? ");
			double in = input.nextDouble();
			
			if(head.equalsIgnoreCase("Y")) 
			{
				obj.headOfHouse(in);
			}
			else 
			{
				obj.single(in);
			}
			
		}
		
		else if(status.equalsIgnoreCase("B")) 
		{
			System.out.println("Your filing status is Married, filing seperetely.");
			System.out.println("What is your income? ");
			double in = input.nextDouble();
			obj.marriedFlS(in);
			
		}
		else if(status.equalsIgnoreCase("C"))
		{
			System.out.println("Your filing status is Married, filing jointly.");
			System.out.println("What is your income? ");
			double in = input.nextDouble();
			obj.MarriedFlJ(in);
		}
		
		else 
		{

			System.out.println("Please choose a correct status.");
		}
		
	}

}
