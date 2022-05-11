package Scope;

public class Scope {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Inner i = new Inner();
		i.hi();
	}
	
	private static void hello() {
		System.out.println("private hello!");
	}
	
	static class Inner{
		public void hi() {
//			main.hello();
		}
	}

}


public class BBB{
	
}