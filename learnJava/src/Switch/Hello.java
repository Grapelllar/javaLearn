package Switch;
import java.util.Scanner;
public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("a");
		System.out.println("b");
		System.out.print("c");
		System.out.println("d");
		double d = 100000000;
		
		//input
		
//		Scanner scanner = new Scanner(System.in);
//		System.out.print("Input your name:");
//		String name = scanner.nextLine();
//		System.out.print("Input your age:");
//		int age = scanner.nextInt();
//		double a = 11111;
//		System.out.printf("%.2f\n", a);
//		System.out.printf("Hi, %s, you are %d\n",name,age);
//		
//		
		//if
		
		//Casue float type cannot precise
		double x = 1 - 9.0 / 10;
		if(x == 0.1) {
			System.out.println("x is 0.1");
		}else {
			System.out.println("x is Not 0.1");
		}
		
		//Use critical value
		double y = 1 - 9.0 / 10;
		if(Math.abs(y - 0.1) < 0.00001) {
			System.out.println("y is 0.1");
		}else {
			System.out.println("y is Not 0.1");
		}
		
		
		//判断引用类型相等
		String s1 = "hello";
		String s2 = "HELLO".toLowerCase();
		System.out.println(s1);
		System.out.println(s2);
		if(s1 == s2) {
			System.out.println("s1 == s2");
		}else {
			System.out.println("s1 != s2");
		}
		
		//判断引用类型内部变量是否相等
		String a1 = "hello";
		String a2 = "HELLO".toLowerCase();
		if(s1.equals(s2)) {
			System.out.println("s1 equals s2");
		}else {
			System.out.println("s1 not equals s2");
		}
		
		//避免使用 equals 时，有报 NullPointerException 错误
		String e = null;
		if( s1 != null && s1.equals("hello")) {
			System.out.println("hello");
		}
		
		
		//System.out.println("%.2lf",d);
		
		
		
		//Switch
		
		String fruit = "apple";
		switch(fruit) {
		case "apple":
			System.out.println("Selected apple");
			break;
		case "pear":
			System.out.println("Selected pear");
			break;
		case "mango":
			System.out.println("Selected mango");
			break;
		default:
			System.out.println("No fruit selected");
			
		}
		
		//
		
		String f = "orange";
		switch(f) {
		case "apple":
			System.out.println("apple");
			break;
		case "banana":
			int code = f.hashCode();
			break;
		}
		
		
		//for each
		int[] ns = {1,4,9,16,25};
		for(int n : ns) {
			System.out.println(n);
		}
		
		
		
	}

}
