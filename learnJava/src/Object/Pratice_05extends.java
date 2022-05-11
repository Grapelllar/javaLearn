//定义PrimaryStudent，从Student继承，并新增一个grade字段
package Object;

public class Pratice_05extends {
	public static void main(String[] args) {
		PersonD p = new PersonD("小明", 12);
		StudentD s = new StudentD("小红", 20, 99);
		// TODO: 定义PrimaryStudent，从Student继承，新增grade字段:
		
		StudentD ps = new PrimaryStudent("小军", 9, 100, 5);
		System.out.println(ps.getScore());
	}
}

class PersonD {
	protected String name;
	protected int age;

	public PersonD(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}

class StudentD extends PersonD {
	protected int score;

	public StudentD(String name, int age, int score) {
		super(name, age);
		this.score = score;
	}

	public int getScore() {
		return score;
	}
}

class PrimaryStudent extends StudentD{
    // TODO
	protected int grade;
	
	public PrimaryStudent(String name, int age, int score,int grade) {
		super(name, age, score);
		this.grade = grade;
	}
	public int getGrade() {
		return grade;
	}
}
