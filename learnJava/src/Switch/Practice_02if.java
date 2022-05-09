package Switch;
import java.util.Scanner;;
public class Practice_02if {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double BMI, kg, m;
		
		System.out.println("输入体重:");
		Scanner inputKG = new Scanner(System.in);
		kg = inputKG.nextDouble();
		
		System.out.println("输入身高:");
		Scanner inputM = new Scanner(System.in);
		m = inputM.nextDouble();
		
		BMI = kg / (m*m);
		
		if(BMI < 18.5) {
			System.out.println("过轻");			
		}else if(BMI < 25) {
			System.out.println("正常");
		}else if(BMI < 28) {
			System.out.println("过重");
		}else if(BMI < 32) {
			System.out.println("肥胖");
		}else {
			System.out.println("非常肥胖");
		}
		
		System.out.printf("you BMI is:%f", BMI);
	}

}
