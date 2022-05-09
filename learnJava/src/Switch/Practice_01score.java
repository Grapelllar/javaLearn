package Switch;
import java.util.Scanner;
public class Practice_01score {
	public static void main(String[] args) {
		System.out.println("Input your current score:");
		Scanner currentScore = new Scanner(System.in);
		double current = currentScore.nextDouble();
		
		System.out.println("Input your last score:");
		Scanner lastScore = new Scanner(System.in);
		//String out = scanner.nextLine();

		double last = lastScore.nextDouble();

		//System.out.println(out);
		System.out.printf("%.2f%%",((current-last)/current)*100);
		
	}
}
