package Object;

public class Extends {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Student s = new Student();
		//向上转型
		PersonC p = new Student("mhj",18,30);
		
		//向下转型
		PersonC p1 = new Student();
		System.out.println(p instanceof PersonC);
		PersonC p2 = new PersonC();
		Student s1 = (Student)p1;
		PersonC p3 = new Student() ;
		if(p3 instanceof Student) {
			Student s3 = (Student) p3;
			System.out.println("YES");
		}
//		Student s2 = (Student)p2;
//		Student s = new Student();
//		PersonC p = s;
//		Object o1 = p;
//		Object o2 = s;
	}

}

class  PersonC{
	protected String name;
	protected int age;
	
	public PersonC() {}
	
	public PersonC(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void getAge() {
		System.out.println(this.age);
	}
//	public String getName() { return "";}
//	public void setName(String name) {}
//	public int getAge() {return 0;}
//	public void setAge(int age) {}
	
}

class Student extends PersonC{
	
	protected int score;
	
	public Student() {}
	
	public Student(String name, int age ,int score) {
//		super(name,age);
		this.score = score;
	}
	
	public void getScore() {
		System.out.println(this.score);
	}
//	public int getScore() {return 0;}
//	public void setScore(int score) {}
//	
//	public String hello() {
//		return "Hello," + name;
//	}
	
}