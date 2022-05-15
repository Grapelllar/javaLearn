package CoreClass;

public class Encoding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String
		
		//字符串比较
		
		//放入同一个常量池，巧合相等。
		String s1 = "hello";
		String s2 = "hello";
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		
		//通过方法改变字符串，未放入一个常量池
		String s3 = "hello";
		String s4 = "HELLO".toLowerCase();
		String s5 = "HELLO";
		System.out.println(s3 == s4);
		System.out.println(s3.equals(s4));
		System.out.println(s5 == s4);
		
		//搜索子串
		System.out.println("Hello".contains("ll"));
		System.out.println("Hellllllllo".lastIndexOf("l"));
		System.out.println("Hellllllllo".startsWith("ll"));
		System.out.println("Hellllo".endsWith("o"));
		
		//提取子串
		System.out.println("Heabcdo".substring(2));
		System.out.println("Helaxksdadflo".substring(2,4));
		
		//去除首尾空白字符
		System.out.println(" \tHello\r\n");
		System.out.println(" \tHello\r\n".trim());
		
		//去空白字符和中文的空格字符(\u3000)
		System.out.println("\u3000Hello\u3000");
//		System.out.println("\u3000Hello\u3000".strip()); java11
//		System.out.println("Hello ".stripLeading); Java11
//		System.out.println(" Hello".stripTrailing); Java11
		System.out.println("".isEmpty());
		System.out.println("   ".isEmpty());
//		System.out.println("  \n".isBlank());
	}

}
