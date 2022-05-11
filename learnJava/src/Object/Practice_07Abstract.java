package Object;

public class Practice_07Abstract {
	public static void main(String[] args) {
		IncomeA income[] = new IncomeA[] { new GaofeiA(3000), new GongziA(6999) };
		System.out.println(totalTox(income));
	}

	public static double totalTox(IncomeA... incomes) {
		double sum = 0;
		for (IncomeA income : incomes) {
			sum += income.getWage();
		}
		return sum;
	}

}

abstract class IncomeA {
	protected double wage;

	public IncomeA(double wage) {
		this.wage = wage;
	}

	public abstract double tox();

	public abstract double getWage();
}

class GaofeiA extends IncomeA {
	public GaofeiA(double wage) {
		super(wage);
		// TODO Auto-generated constructor stub
	}

	public double tox() {
		return wage * 0.1;
	}

	public double getWage() {
		return tox();
	}
}

class GongziA extends IncomeA {
	public GongziA(double wage) {
		super(wage);
		// TODO Auto-generated constructor stub
	}

	public double tox() {
		return wage * 0.2;
	}

	public double getWage() {
		return tox();
	}
}