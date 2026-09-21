
class StringConcept{
	
	
	// Variable is diff but point to same memory add, Sujal store on Const String pool
	//str1 & Str2 point to same Sujal which is stored on Const String Pool
	String str1 = "Sujal"; 
	String str2 = "Sujal";
	String str = new String("Sujal"); //str also store "sujal" but address is different, it created on heap using "new" keyword.           
	
	
	
	
	
	//validate to check whether str1 & str2 point to same address
	public boolean isCorrect() {
		if(str1 == str2)
			return true;
		else
			return false;
					
	}
	
	//it checks str & str1 points to same mem address or not , ans: false , content is same but address is different
	public boolean compare() {
		if(str == str1)
			return true;
		else
			return false;
	}
	
	
	public void immutableString() {
		System.out.println(str2);
		str2.concat("Sharma");
		System.out.println(str2);
	}
	
	
	public void mutableString() {
		StringBuffer Sb = new StringBuffer("sujal");
		System.out.println(Sb);
		Sb.append("Taware");
		
		System.out.println(Sb);
	}
	

	
	
	
	
	public void show() {
		System.out.println(str1); // it displayed st1 i.e Sujal
		
		if(str.equals(str1)) {
			System.out.println("Content is same, add is different ");
		}else
			System.out.println("Content is not - same, add is different ");
	}
	
}


public class Program {

	public static void main(String[] args) {
		StringConcept sc = new StringConcept();
		
		sc.show();
		
		System.out.println(sc.isCorrect());
		System.out.println(sc.compare());
		
		
		
		
		sc.immutableString();
		sc.mutableString();
		
	

	}

}
