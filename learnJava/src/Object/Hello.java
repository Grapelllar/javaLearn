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
		fmy.setSubjects("����","C++","C");
		fmy.viewer();
		
		Animal monkey = new Animal();
		monkey.setName("monkey");
		
		//������-��������
		int age = 18;
		monkey.setAge(age);
		monkey.viewer();
		age = 20;
		monkey.viewer();
		
		//������-��������
		String[] str = new String[] {"shower","singing"};
		monkey.setHobby(str);
		monkey.viewer();
		str[0] = "dancing";
		monkey.viewer();
		
		//����-String,��Ҫ��ָ�����
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
		//�ֲ��������ȼ����ߣ�������ʱ���ȵ��þֲ���
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
	
	//�ɱ�����
	public void setSubjects(String...subjects) {
		this.subjects = subjects;
	}
	
	//�ɱ�������һ��д��������Ҫ�Լ����죬�Ƚ��鷳
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

//�����󶨣��󶨻������ͺ���������ʱ������
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



