package Switch;
import java.util.Scanner;
public class Practice_03cdk {
	public static void main(String[] args) {
		
		
		System.out.println("玩法\n"
						+ "1 石头\n"
						+ "2 剪子\n"
						+ "3 布");
		
		System.out.println("玩家1:");
		Scanner first = new Scanner(System.in); 
		int opt1 = first.nextInt();
		
//		System.out.println("玩家2:");
//		Scanner second = new Scanner(System.in);
//		int opt2 = second.nextInt();
		
		int random = (int)(1 + Math.random()*3);
		int opt2 = random;
		System.out.printf("对方出的是:%d",opt2);
		switch(opt1) {
		case 1:
			switch(opt2) {
			case 1:
				System.out.println("平局");
				break;
			case 2:
				System.out.println("你赢了");
				break;
			case 3:
				System.out.println("你输了");
				break;
			}
			break;
		case 2:
			switch(opt2) {
			case 1:
				System.out.println("你输了");
				break;
			case 2:
				System.out.println("平局");
				break;
			case 3:
				System.out.println("你赢了");
				break;
			}
			break;
		case 3:
			switch(opt2) {
			case 1:
				System.out.println("你赢了");
				break;
			case 2:
				System.out.println("你输了");
				break;
			case 3:
				System.out.println("平局");
				break;
			}
			break;
		}

		}
		
		
		
	}

