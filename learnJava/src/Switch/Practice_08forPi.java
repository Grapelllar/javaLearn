package Switch;

public class Practice_08forPi {
	public static void main(String[] args) {
		double pi = 1;
		int flag = 1;
		for(int i = 3 ; i < 100000  ; i+=2,flag++) {
			if(flag % 2 == 1) {
				pi -= 1.0/i;
			}else {
				pi += 1.0/i;
			}
			System.out.println(pi);
		}
		pi =  pi * 4;
		System.out.println(pi);
	}
}
