package Object;

public class Abstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentH h = new StudentH();
		h.run();
	}

}

abstract class PersonH{
	public abstract void run();
}

class StudentH extends PersonH{
	@Override
	public void run() {
		System.out.println("Student.run");
	}
}