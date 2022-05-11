package Object;

public class Practice_03Person {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person4 ming = new Person4("ะกร๗",12);
		System.out.println(ming.getName());
		System.out.println(ming.getAge());
	}
	
	

}
class Person4{
	private String name;
	private int age;
	
	public Person4(String name,int age){
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
}