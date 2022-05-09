package Array;
import java.util.Arrays;
public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//输出数组在JVM的首地址
		int[] ns = {1,2,3,4,5};
		System.out.println(ns);
		
		//Arrays.toString
		int[] ns2 = {1,2,3,4,5};
		System.out.println(Arrays.toString(ns2));
		
		//冒泡排序:每次把最大的放前面
		int[] ns3 = {94,52, 61,23,45,91,24,5,6,14,52,88,56};
		System.out.println(Arrays.toString(ns3));
		
		for(int i = ns3.length - 1; i >= 0; i--) {
			for(int j = 0; j < i; j++) {
				if(ns3[j] > ns3[j + 1]) {
					int t = ns3[j + 1];
					ns3[j + 1] = ns3[j];
					ns3[j] = t;
				}
			}
		}
		
		System.out.println(Arrays.toString(ns3));
		
		int[] ns4 = {94,52, 61,23,45,91,24,5,6,14,52,88,56};
		Arrays.sort(ns4);
		System.out.println(Arrays.toString(ns4));
		//二维数组定义
		int[][] ns5= {
				{1,2,3,4},
				{5,6},
				{7,8,9}
		};
		System.out.println(ns5.length);
		for(int[] arr:ns5) {
			for(int n:arr) {
				System.out.print(n);
				System.out.print(',');
			}
		}
		System.out.println(Arrays.deepToString(ns5));
		
		
		//三维数组
		int[][][] ns6 = {
				{
					{1,2,3},
					{4,5,6},
					{7,8,9}
				},
				{
					{10,11},
					{12,13}
				},
				{
					{14,15,16},
					{17,18}
				}
		};
		for(int[][] arr1:ns6) {
			for(int[] arr2: arr1) {
				for(int n:arr2) {
					System.out.print(n);
					System.out.print(',');
				}
			}
		}
		System.out.println(Arrays.deepToString(ns6));
		
		//命令行参数
		for(String arg : args) {
			if("-version".equals(arg)) {
				System.out.println("v 1.0");
				break;
			}
		}
		
	}
}
