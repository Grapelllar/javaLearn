package Object;

public class OverrideTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		StudentE s = new StudentE();
//		s.run();
		
		PersonE p = new StudentE();
		p.run();
	}

}



class PersonE{
	public void run() {
		System.out.println("Person.run");
	}
}

class StudentE extends PersonE{
	
	@Override //ע�⣬ʹ��Override����������Override
	public void run() {
		System.out.println("Student.run");
	}
}