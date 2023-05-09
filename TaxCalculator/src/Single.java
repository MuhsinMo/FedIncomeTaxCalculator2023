
public class Single extends MarriedFilingSeparately 
{
	public void single(double income)
	{
		if(income <13850) 
		{
			System.out.println("Your federal income tax is: $0");
			System.exit(0);
		}
		
		
		System.out.println("Your standard deduction for 2023 is $13850");
		income = income -13850;
		double fedTax = 0;
		
		
		//10%
		if(income>=0 && income<11001) 
		{
			fedTax = income *0.10;
			System.out.println("Your federal income tax is: $"+fedTax);
			
		}
		//12%
		else if(income>=11001 && income<44726)
		{
			fedTax =  1100 +((income-11000)*0.12);
			System.out.println("Your federal income tax is: $"+fedTax);
		}
		//22%
		else if(income>=44726 && income<95376)
		{fedTax =  5147 +((income-44725) * 0.22);
		System.out.println("Your federal income tax is: $"+fedTax);
			
		}
		//24%
		else if(income>=95376  && income<182101)
		{
			fedTax =  16290 +((income-95375) * 0.24);
			System.out.println("Your federal income tax is: $"+fedTax);
		}
		//32%
		else if(income>=182101 && income<231251)
		{
			fedTax =  37104 +((income-182100) * 0.32);
			System.out.println("Your federal income tax is: $"+fedTax);	
		}
		//35%
		else if(income>=231251 && income<578126)
		{
			fedTax =  52832 +((income-231250) * 0.35);
			System.out.println("Your federal income tax is: $"+fedTax);
		}
		//37%
		else if(income >=578126)
		{
			fedTax =  174238.25 +((income-578125) * 0.37);
			System.out.println("Your federal income tax is: $"+fedTax);
		}
		
		
	}
	
	public void headOfHouse(double income)
	{
		if(income <20800) 
		{
			System.out.println("Your federal income tax is: $0");
			System.exit(0);
		}
		
		System.out.println("Your standard deduction for 2023 is $13850");
		income = income -20800;

		double fedTax = 0;
		
		//10%
		if(income>=0 && income<15701)  
		{
			fedTax = income*0.10;
			System.out.println("Your federal income tax is: $"+fedTax);
			
		}
		//12%
		else if(income>=15701 && income<59851)
		{
			fedTax =  1570 +((income-15700)*0.12);
			System.out.println("Your federal income tax is: $"+fedTax);
		}
		//22%
		else if(income>=59851 && income<95351)
		{fedTax =  6868 +((income-59850) * 0.22);
		System.out.println("Your federal income tax is: $"+fedTax);
			
		}
		//24%
		else if(income>=95351  && income<182101)
		{
			fedTax =  14678 +((income-95350) * 0.24);
			System.out.println("Your federal income tax is: $"+fedTax);
		}
		//32%
		else if(income>=182101 && income<231251)
		{
			fedTax =  35498 +((income-182100) * 0.32);
			System.out.println("Your federal income tax is: $"+fedTax);	
		}
		//35%
		else if(income>=231251 && income<578101)
		{
			fedTax =  51226 +((income-231250) * 0.35);
			System.out.println("Your federal income tax is: $"+fedTax);
		}
		//37%
		else if(income >=578101)
		{
			fedTax =  172623.50 +((income-578100) * 0.37);
			System.out.println("Your federal income tax is: $"+fedTax);
		}
		
	}

}
