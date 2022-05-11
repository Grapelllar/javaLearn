package Object;

public class OverrideObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PersonG p = new PersonG("mhj");
		System.out.println(p.toString());
		System.out.println(p.getName().equals("mhj"));
		System.out.println(p.hashCode());
		System.out.println(p.hello());
		StudentG s = new StudentG("mhj");
		System.out.println(s.hello());
	}

}

class PersonG{
	
	private String name;
	
	public String hello() {
		return "Hello," + name;
	}
	
	
	public PersonG(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	@Override
	public String toString() {
		return "Person:name=" + name;
	}
	
	@Override
	public boolean equals(Object o) {
		
		if(o instanceof PersonG) {
			PersonG p = (PersonG) o;
			return this.name.equals(p.name);
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return this.name.hashCode();
	}
	
}

class StudentG extends PersonG{
	
	public StudentG(String name){
		super(name);
	}
	
	@Override
	public String hello() {
		return super.hello() + "!";
	}
}
