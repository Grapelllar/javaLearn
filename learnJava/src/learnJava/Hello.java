package learnJava;

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int a = 1;
//		a++;
		System.out.println(a);
		System.out.println("H W!");
		int x = 100;
		x = 200;
//		int y ;
		System.out.println(x);
		char zh = '中';
		System.out.println(zh);
//		var sb = new StringBuilder();
//		System.out.println(sb);
//		System.out.println(y);
		double x1 = 1.0/10;
		double y1 = 1 - 9.0 / 10;
		System.out.println(x1);
		System.out.println(y1);
		double r = Math.abs(x1-y1);
		if(r < 0.0001) {
			System.out.println("right");
		}
		else
			System.out.println("false");
		//int w1 = 1/0;
		double d1 = 0.0/0;
		System.out.println(d1);
		//boolean 短路
		boolean b = 5 < 3;
		boolean result = b && (5/0 > 0);
		System.out.println(result);
		String s = "fisrt line\n" 
				 + "second line\n"
				 + "end";
		System.out.println(s);
		
		//数组
		
		int[] ns = new int[5];
		System.out.println(ns.length);
		int[] ns2 = new int[] {1,2,3,4,5};
		System.out.println(ns2.length);
		int[] ns3 = {1,2,3,4};
		System.out.println(ns3.length);
		
	}
	// This is comment
	/*
	 * this is comment
	 */
	/**
	 * this is auto comment
	 */
	
	//浮点数问题

}
