package Object;
import java.util.Arrays;
public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person mhj = new Person();
		mhj.setAge(20);
		mhj.setName("mhj");
		mhj.setSubjectsArrays(new String[] {"a","b"});
		mhj.viewer();
		mhj.getXusui();
		
		Person fmy = new Person();
		fmy.setNameAndAge("fmy", 21);
		fmy.setSubjects("高数","C++","C");
		fmy.viewer();
		
		Animal monkey = new Animal();
		monkey.setName("monkey");
		
		//参数绑定-基本类型
		int age = 18;
		monkey.setAge(age);
		monkey.viewer();
		age = 20;
		monkey.viewer();
		
		//参数绑定-引用类型
		String[] str = new String[] {"shower","singing"};
		monkey.setHobby(str);
		monkey.viewer();
		str[0] = "dancing";
		monkey.viewer();
		
		//特例-String,需要从指针分析
		String name = "xiaoming";
		monkey.setName(name);
		name = "baibai";
		monkey.viewer();
	}
}

class Person {
	private String name;
	private int age;
	private String[] subjects;
	public void setName(String name) {
		//局部变量优先级更高，有重名时优先调用局部的
		this.name = name;
	}

	public void setAge(int age) {
		if (age >= 0 && age <= 100) {
			this.age = age;
		}else {
			age = -1;
		}
	}
	public void setNameAndAge(String name,int age) {
		this.name = name;
		this.age = age;
	}
	
	//可变类型
	public void setSubjects(String...subjects) {
		this.subjects = subjects;
	}
	
	//可变类型另一种写法，但需要自己构造，比较麻烦
	public void setSubjectsArrays(String[] subjects) {
		this.subjects = subjects;
	}
	
	
	public int getAge() {
		return this.age;
	}

	public void getName() {
		this.name = name;
	}
	public void viewer() {
		System.out.printf("Your name is : %s\n",name);
		System.out.printf("Your age is : %d\n",age);
		System.out.printf(Arrays.toString(subjects) + "\n");
	}
	public void getXusui() {
		System.out.println(xusui());
	}
	private int xusui() {
		return this.age - 2;
	}
}

//参数绑定，绑定基本类型和引用类型时的区别
class Animal{
	private String name;
	private int age;
	private String[] hobbies;
	
	public void setName(String name){
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setHobby(String...strings) {
		this.hobbies = strings;
	}
	public void viewer() {
		System.out.printf("The animal name is : %s\n",name);
		System.out.printf("The animal age is : %d\n", age);
		System.out.printf("The hobbies of animals are:" + Arrays.toString(hobbies) + "\n");
	}
}



