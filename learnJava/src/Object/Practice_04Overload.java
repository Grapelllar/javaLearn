package Object;

public class Practice_04Overload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PersonA ming = new PersonA();
		PersonA hong = new PersonA();
		ming.setName("Xiao Ming");
		
		hong.setName("Xiao","Hong");
		System.out.println(ming.getName());
		System.out.println(hong.getName());
	}

}

class PersonA{
	private String name = "";
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setName(String... strings) {
		for(String s:strings) {
			this.name += s + " ";
		}
	}
	
}
