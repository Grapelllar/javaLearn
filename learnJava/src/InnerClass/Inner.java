package InnerClass;
import java.util.*;
public class Inner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer outer = new Outer("Nested");
		Outer.Inner inner = outer.new Inner();
		inner.hello();
		outer.asyncHello();
	}

}

class Outer{
	private String name;
	
	Outer(String name){
		this.name = name;
	}
	
	
	//内部类
	class Inner{
		void hello(){
			System.out.println("Hello," + Outer.this.name);
		}
	}
	
	//用匿名类定义内部类
	void asyncHello() {
		Runnable r = new Runnable(){
			@Override
			public void run() {
				System.out.println("Hello," + Outer.this.name);
			}
		};
		new Thread(r).start();
	}
}