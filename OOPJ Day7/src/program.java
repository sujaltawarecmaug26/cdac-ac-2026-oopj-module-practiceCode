import org.cdac.Base;
import org.cdac.Derived;
import org.cdac.SuperDerived;

public class program {

	public static void main(String[] args) {
//		int day = 1;
//		
//		int result = switch(day){
//			case 1 ->{
//				System.out.println("Monday");
//				yield 11;
//			}
//
//			default -> {
//				System.out.println("Sunday");
//				yield 2;
//			}
//				
//		};
//		
//		System.out.println(result);
		
//		Base obj = new Base();
//		obj.show(); //base
//		Base obj = new Derived(); //upcasting
//		obj.str = "Shubham";
////		obj.num;
//		Derived obj1 = (Derived) obj; //downcasting
//		obj1.str = "Sujal";
//		obj1.num= 10;
//		
//		System.out.println("Name: "+ obj1.str +" "+ "Num: " + obj1.num );
//		System.out.println(obj.str);
//		
//		obj1.show(); //derived
		
//		
//		Base objj = new Derived();
//		objj.show();
		
		Base obj = new Derived();
		obj.show();
		
		SuperDerived obj2 = new SuperDerived();
		obj2.show();

	}

}
