package Object;

public class Practice_02getset {
	public static void main(String[] args) {
		Person3 ming = new Person3();
		ming.setName("xiaoming");
		ming.setAge(12);
		System.out.println(ming.getAge());
	}
}

class Person3 {
	private String name;
	private int age;

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setName(String name) {
		this.name = name;
	}
}
