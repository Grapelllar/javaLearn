package Switch;
import java.util.Scanner;;
public class Practice_02if {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double BMI, kg, m;
		
		System.out.println("��������:");
		Scanner inputKG = new Scanner(System.in);
		kg = inputKG.nextDouble();
		
		System.out.println("�������:");
		Scanner inputM = new Scanner(System.in);
		m = inputM.nextDouble();
		
		BMI = kg / (m*m);
		
		if(BMI < 18.5) {
			System.out.println("����");			
		}else if(BMI < 25) {
			System.out.println("����");
		}else if(BMI < 28) {
			System.out.println("����");
		}else if(BMI < 32) {
			System.out.println("����");
		}else {
			System.out.println("�ǳ�����");
		}
		
		System.out.printf("you BMI is:%f", BMI);
	}

}
