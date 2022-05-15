package InnerClass;

public class AnonymousClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OuterA a = new OuterA("A");
		a.methodInterface();
		a.methodClass();
	}

}

class OuterA{
	private String name;
	
	OuterA(String name){
		this.name = name;
	}
//	void asyncHello() {
//		Dog dog = new Dog();
//		dog.sayName();
//		Pig pig = new Pig();
//		pig.sayName();
//	}
	
	//调用接口的匿名内部类
	public void methodInterface() {
	A a = new A() {
		public void sayName(){
			System.out.println("dog");
		}
	};
		a.sayName();
		System.out.print(a.getClass());
	}
	
	//调用类的匿名内部类
	public void methodClass() {
		B b = new B(){

		};
		b.sayName();
		System.out.print(b.getClass());
	}
	
}


class B{
	void sayName() {
		System.out.println("B");
	}
}

interface A{
	void sayName();
}

//class Dog implements A{
//	@Override
//	public void sayName() {
//		System.out.println("Dog!");
//	}
//}
//
//class Pig implements A{
//	@Override
//	public void sayName() {
//		System.out.println("Pig!");
//	}
//}
