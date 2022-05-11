package Object;

public class Static {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PersonK ming = new PersonK("Xiao Ming",12);
		PersonK hong = new PersonK("Xiao Hong",15);
		ming.number = 88;
		System.out.println(hong.number);
		hong.number = 99;
		PersonK.number = 100;
		System.out.println(ming.number);
		System.out.println(hong.number);
		PersonK.setNumber(30);
		System.out.println(PersonK.number);
		
//		PersonK p = new PersonK("mhj",18);
		BBB b = new BBB();
		System.out.println(b.FEMALE);
		
		
	}

}

class PersonK{
	public String name;
	public int age;
	
	public static int number;
	
	public PersonK(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	//static 方法相当于函数
	public static void setNumber(int value) {
		number = value;
	}
	
	public interface AAA{
		public static int MALE = 1;
		public static int FEMALE = 2;
	}
	

}

interface AAA{
	public static int MALE = 1;
	public static int FEMALE = 2;
}

class BBB implements AAA {
	
}

