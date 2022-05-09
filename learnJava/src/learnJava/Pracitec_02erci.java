package learnJava;

public class Pracitec_02erci {
	public static void main(String[] args) {
	double a = 1.0;
	double b = 3.0;
	double c = -4.0;
	double r1 = (-b + Math.sqrt(b*b-4*a*c)) / 2*a;
	double r2 = (-b - Math.sqrt(b*b-4*a*c)) / 2*a;
	System.out.println(r1);
	System.out.println(r2);
	System.out.println(r1 == 1 && r2 == -4 ? "right":"false");
	}
}
