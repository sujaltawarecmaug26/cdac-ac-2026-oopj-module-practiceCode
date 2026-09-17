
public class stringToFloat {
	
	
	
	
	private static String arrToString() {

		try {
			byte arrInput[] = new byte[100];
			
			System.out.println("Enter the value");
			int length = System.in.read(arrInput);
			byte arrFinal[] = new byte[length-2];
			System.arraycopy(arrInput,0, arrFinal, 0, length-2);
			
			String obj = new String(arrFinal);
			
			return obj;
			
		}catch(Exception e){
				e.printStackTrace();
			
		}
		
		return " ";
	}
	
	private static float strToFloat(String s) {
		
		float num = Float.parseFloat(s);
		return num;
	}
	

	public static void main(String[] args) {
		
		//calling arrToString converter function
		String Str = arrToString();
//		System.out.println("Result of Array to String: " + Str);
		
		//calling String to int converter function
		
		float num1 = strToFloat(Str);
//		System.out.println("Result of String to Int: " + num1);
		
		//calling arrToString converter function
		String Str1 = arrToString();
//		System.out.println("Result of Array to String: " + Str1);
				
		//calling String to int converter function
		float num2 = strToFloat(Str1);
//		System.out.println("Result of String to Int: " + num2);
		

		//adding two var num1 + num2;
		
		Float sum = num1 + num2;
		System.out.println("Result of Two Float Value: " + sum);
		
		
	}
}
