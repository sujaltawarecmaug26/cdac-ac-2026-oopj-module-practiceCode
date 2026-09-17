
abstract class A
{
	 public int num = 10;
	 
	 public A(int n) {
		 System.out.println("A Constrctor Called......" + num);
		 num = n;
	 }
	 
	 public abstract void fly(); 
	public final void  show() {
		System.out.println("in A Show");
	}

}

class B extends A{
	
	 
	 public B(int n) {
		 super(n);
		 System.out.println("B Constrctor Called......" + n);
		 
	 }
	
	public void fly() {
		System.out.println("Flyingggggggggggggggg");
	};
	
	public void display() {
		System.out.println("in B Show");
	}
	
}


public class Program {

	public static void main(String[] args) {
			
		A obj = new B(2);
		obj.show();
		obj.fly();
		System.out.println(obj.num);

	}

}
