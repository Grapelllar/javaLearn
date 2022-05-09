package Switch;

public class Practice_07forEach {
	public static void main(String[] args) {
	int[] ns = {1,4,9,16,25};
	int sum = 0;
	for(int i : ns) {
//		System.out.println(ns[i]);
		sum += i;
	}
	System.out.println(sum);
	}
}
