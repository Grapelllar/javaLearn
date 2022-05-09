package Array;

public class Practice_03average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] scores = { { 82, 90, 91 }, { 68, 72, 64 }, { 95, 91, 89 }, { 67, 52, 60 }, { 79, 81, 85 }, };
		double average = 0;
		
		for(int arr[] : scores ) {
			for(int n : arr) {
				average += n;
			}
		}
		average /= 15;
		
		System.out.println(average);
		if (Math.abs(average - 77.733333) < 0.000001) {
			System.out.println("²âÊÔ³É¹¦");
		} else {
			System.out.println("²âÊÔÊ§°Ü");
		}
	}

}
