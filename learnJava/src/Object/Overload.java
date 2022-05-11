package Object;

public class Overload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hello2 h1 = new Hello2();
		h1.hello();
		
		Hello2 h2 = new Hello2();
		h2.hello("mhj",8);
		System.out.println(h2.hello(33));
		
		String hot = "mhj";
		System.out.println(hot.indexOf("h"));
		
		String s = "Test string";
		int n1 = s.indexOf('t');
		int n2 = s.indexOf("st");
		int n3 = s.indexOf("st",4);
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n3);
	}

}

class Hello2{
	public void hello() {
		System.out.println("Hello, world!");
	}
	
	public void hello(String name) {
		System.out.println("Hello, " + name + "!");
	}
	public void hello(String name,int age) {
		if(age < 18) {
			System.out.println("Hi, " + name + "!");
		}else {
			System.out.println("Hello, " + name + "!");
		}
	}
	
	public int hello(int age) {
		return age;
	}
}
