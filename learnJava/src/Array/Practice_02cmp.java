package Array;

import java.util.Arrays;;

public class Practice_02cmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ns = { 28, 12, 89, 73, 65, 18, 96, 50, 8, 36 };
		// ����ǰ:
		System.out.println(Arrays.toString(ns));
		
		//ð�ݵ���
		for(int i = ns.length - 1 ; i >= 0 ; i--) {
			for(int j = 0; j < i; j++) {
				if(ns[j] < ns[j + 1]) {
					int t = ns[j+1];
					ns[j+1] = ns[j];
					ns[j] = t;
				}
			}
		}
		
		// �����:
		System.out.println(Arrays.toString(ns));
		if (Arrays.toString(ns).equals("[96, 89, 73, 65, 50, 36, 28, 18, 12, 8]")) {
			System.out.println("���Գɹ�");
		} else {
			System.out.println("����ʧ��");
		}
	}

}
