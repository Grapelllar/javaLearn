package Object;

public class Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PersonI i = new StudentI();
		i.a();

	}

}

interface PersonI{
	void run();
	String getName();
	default void a() {
		System.out.println("default method");
	}
}

interface HelloI extends PersonI{
	void hello();
}

class StudentI implements HelloI{
	
	public void run() {
		
	}
	
	public String getName(){
		return "xxx";
	}
	
	public void hello() {
		
	}
}