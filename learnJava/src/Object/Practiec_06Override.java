package Object;

public class Practiec_06Override {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tox tox[] = new Tox[] {
			new Tox(10000),
			new Gaofei(3000),
		};
		System.out.println(totalWage(tox));
		
	}
	public static double totalWage(Tox... toxs) {
		double sum = 0;
		for(Tox t:toxs) {
			sum += t.getTox();
		}
		return sum;
	}

}

class Tox{
	protected double wage;
	
	public Tox(double wage) {
		this.wage = wage;
	}
	
	public double getTox() {
		return wage*0.1;
	}
}

class Gaofei extends Tox{
	
	public Gaofei(double wage) {
		super(wage);
	}
	
	@Override
	public double getTox() {
		return wage*0.2;
	}
}


