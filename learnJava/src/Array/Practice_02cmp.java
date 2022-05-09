package Array;

import java.util.Arrays;;

public class Practice_02cmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ns = { 28, 12, 89, 73, 65, 18, 96, 50, 8, 36 };
		// ÅÅÐòÇ°:
		System.out.println(Arrays.toString(ns));
		
		//Ã°ÅÝµ¹Ðò
		for(int i = ns.length - 1 ; i >= 0 ; i--) {
			for(int j = 0; j < i; j++) {
				if(ns[j] < ns[j + 1]) {
					int t = ns[j+1];
					ns[j+1] = ns[j];
					ns[j] = t;
				}
			}
		}
		
		// ÅÅÐòºó:
		System.out.println(Arrays.toString(ns));
		if (Arrays.toString(ns).equals("[96, 89, 73, 65, 50, 36, 28, 18, 12, 8]")) {
			System.out.println("²âÊÔ³É¹¦");
		} else {
			System.out.println("²âÊÔÊ§°Ü");
		}
	}

}
