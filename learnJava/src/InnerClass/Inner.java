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
	
	
	//�ڲ���
	class Inner{
		void hello(){
			System.out.println("Hello," + Outer.this.name);
		}
	}
	
	//�������ඨ���ڲ���
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