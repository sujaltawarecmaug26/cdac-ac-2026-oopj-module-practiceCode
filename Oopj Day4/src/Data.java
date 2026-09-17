
public class Data {
	
	//class Variables
	static int iStatic;
	int num1;
	float fNum;
	char key;
	boolean status;
	String str;
	
	//Static Block
	static {
		//inside Static Block can only access static variables and static functions
		
		iStatic = 100;
		System.out.println(iStatic);
	}
	
	public Data(){
		System.out.println("Data Constructer.......");
	}
	
//	{// Initializer Block 
//		System.out.println("Init Block.........");
//		num1 = 100;
//		key = 'A';
//		str = "Sujal";
//	}	
	
}
