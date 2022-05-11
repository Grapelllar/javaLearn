package Object;

public class Practice_08Implement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IncomeJ gongzi[] = new IncomeJ[] {
				new GongziJ(8000),
				new GaofeiJ(5000)
		};
		System.out.println(totalTox(gongzi));
		
		IncomeJ j = new GongziJ(40000);
		System.out.println(j.view());
	}
	
	public static double totalTox(IncomeJ...incomeJs) {
		double sum = 0;
		for(IncomeJ income : incomeJs) {
			sum += income.tox();
		}
		return sum;
	}

}

interface IncomeJ{
	double tox();
	default double view() {
		return tox();
	}
}

class GongziJ implements IncomeJ{
	
	protected double wage;
	
	public GongziJ(double wage){
		this.wage = wage;
	}
	
	public double tox() {
		return wage * 0.1;
	}
	
} 

class GaofeiJ implements IncomeJ{
	
	protected double wage;
	
	public GaofeiJ(double wage){
		this.wage = wage;
	}
	
	public double tox() {
		return wage * 0.2;
	}
	
} 