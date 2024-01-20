package relationshipEx;

public class SalesPerson extends Employee 
{
	double sales,commission,totalSalary;
	
	public SalesPerson() {
		super();
		sales =  82;
	}
	
	public SalesPerson(int id, String name, Address  address, double workingDays ,double perDay, double sales) 
	{
	super(id, name, address,workingDays,perDay);
	this.sales = sales;

}
	
	
	@Override
	public void calculate() {
		
		super.calculate();
		super.calculate();
		if(sales>=95)
			commission = salary * 0.2;
		else if(sales>=80)
			commission = salary *0.1;
		else if(sales>=70)
			commission = salary *0.05;
		else
			commission =0;
		
		
		totalSalary = salary + commission;
			
	}
	
	
	
}
