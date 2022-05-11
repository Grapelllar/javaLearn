package Object;

public class Practice_09static {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PersonL a = new PersonL("mhj");
		PersonL b = new PersonL("mhj");
		PersonL c = new PersonL("mhj");
		PersonL d = new PersonL("mhj");
		PersonL e = new PersonL("mhj");
		PersonL f = new PersonL("mhj");
		
		System.out.println(PersonL.getCount());
	}

}

class PersonL{
	public String name;
	
	public static int count;
	
	public PersonL(String name) {
		this.name = name;
		this.count ++;
	}
	
	public static int getCount(){
		return count;
	}
}