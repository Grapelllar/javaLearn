package Object;

import java.util.Arrays;

public class Construct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person2 p = new Person2("XiaoMing",15);
		Person2 p2 = new Person2("XiaoMa",20,"C++","C","Java");
//		Person2 p3 = new Person2(); error ���췽���ѱ���д
//		System.out.println(p.getName());
//		System.out.println(p.getAge());
		p2.viewer();
	}

}


class Person2{
	private String name;
	private int age;
	private String[] hobbies;
	
//	public Person2() {} ����Ҫʹ��Ĭ�Ϲ��췽������Ҫ�Լ�����
	
	public Person2(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public Person2(String name, int age , String...strings) {
		this(name,age); //���췽������
		this.hobbies = strings;
	}
	
	public int getAge() {
		return this.age;
	}

	public String getName() {
		return this.name;
	}
	
	public void viewer() {
		System.out.println("The name is :" + this.name);
		System.out.println("The age is :" + this.age);
		System.out.println("The hobbies are :" + Arrays.toString(hobbies));
	}
	
}