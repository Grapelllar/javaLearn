package Switch;
import java.util.Scanner;
public class Practice_03cdk {
	public static void main(String[] args) {
		
		
		System.out.println("�淨\n"
						+ "1 ʯͷ\n"
						+ "2 ����\n"
						+ "3 ��");
		
		System.out.println("���1:");
		Scanner first = new Scanner(System.in); 
		int opt1 = first.nextInt();
		
//		System.out.println("���2:");
//		Scanner second = new Scanner(System.in);
//		int opt2 = second.nextInt();
		
		int random = (int)(1 + Math.random()*3);
		int opt2 = random;
		System.out.printf("�Է�������:%d",opt2);
		switch(opt1) {
		case 1:
			switch(opt2) {
			case 1:
				System.out.println("ƽ��");
				break;
			case 2:
				System.out.println("��Ӯ��");
				break;
			case 3:
				System.out.println("������");
				break;
			}
			break;
		case 2:
			switch(opt2) {
			case 1:
				System.out.println("������");
				break;
			case 2:
				System.out.println("ƽ��");
				break;
			case 3:
				System.out.println("��Ӯ��");
				break;
			}
			break;
		case 3:
			switch(opt2) {
			case 1:
				System.out.println("��Ӯ��");
				break;
			case 2:
				System.out.println("������");
				break;
			case 3:
				System.out.println("ƽ��");
				break;
			}
			break;
		}

		}
		
		
		
	}

