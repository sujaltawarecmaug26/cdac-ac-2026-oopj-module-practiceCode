
public class Base {
	int num1;
	int num2;
	
	public void show() {
		System.out.println("Base Called");
	}
	
	public static void main(String []args) {
		
		//upcasting;
		Base obj = new Derived();
		obj.show();
		
		//downcasting
		Derived data = (Derived)obj;
		
		Base dObj = new DerivedMost();
		dObj.num1 = 70;
		
		DerivedMost nObj = (DerivedMost) dObj;
		nObj.num1 = 70;
		data.num3 = 30;
		data.num2 = 20;
		System.out.println(dObj.num1);
		System.out.println(data.num2);
		System.out.println(obj.num2);	
		System.out.println(obj.num1);	
		
	}
}
