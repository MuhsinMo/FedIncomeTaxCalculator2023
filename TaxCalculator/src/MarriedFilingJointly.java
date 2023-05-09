
public class MarriedFilingJointly 
{

	public void MarriedFlJ(double income)
	{
		if(income <27700) 
		{
			System.out.println("Your federal income tax is: $0");
			System.exit(0);
		}
		
		System.out.println("Your standard deduction for 2023 is $27700");
		income = income -27700;
		double fedTax =0;
		
		// 10% Tax Rate
		
		if(income>=0 && income<22001)
		{
			fedTax = 0;
			System.out.println("Your federal income tax is: $"+fedTax);
		}
		
		
		// 12% Tax Rate
		
		else if(income>=22001 && income<89451)
		{
			fedTax =  2200 +((income-22000)*0.12);
			System.out.println("Your federal income tax is: $"+fedTax);
		}
		
		// 22% Tax Rate
		
		else if(income>=89451 && income<190751)
		{
			fedTax =  10294 +((income-89450) * 0.22);
		
			System.out.println("Your federal income tax is: $"+fedTax);
			
		}
		// 24% Tax Rate
		
		else if(income>=190751 && income<364201)
		{
			fedTax =  32580 +((income-190750)*0.24);
			System.out.println("Your federal income tax is: $"+fedTax);
		}
		// 32% Tax Rate
		else if(income>=364201 && income<462501)
		{
			fedTax =  74208 +((income-364200)*0.32);
			System.out.println("Your federal income tax is: $"+fedTax);
		}
		
		// 35% Tax Rate
		else if(income>=462501 && income<693751)
		{
			fedTax =  105664 +((income-462500)*0.35);
			System.out.println("Your federal income tax is: $"+fedTax);
		}
		
		// 37% Tax Rate
		else if( income>=693751)
		{
			fedTax =  186601.50 +((income-693750)*0.37);
			System.out.println("Your federal income tax is: $"+fedTax);
		}
		 
	}


}
