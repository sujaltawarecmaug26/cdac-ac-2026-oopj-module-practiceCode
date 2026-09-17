
public class Day3_2 {
	
	
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
	
	private static int strToInt(String s) {
		
		int num = Integer.parseInt(s);
		return num;
	}
	

	public static void main(String[] args) {
		
		//calling arrToString converter function
		String Str = arrToString();
//		System.out.println("Result of Array to String: " + Str);
		
		//calling String to int converter function
		
		int num1 = strToInt(Str);
//		System.out.println("Result of String to Int: " + num1);
		
		//calling arrToString converter function
		String Str1 = arrToString();
//		System.out.println("Result of Array to String: " + Str1);
				
		//calling String to int converter function
		int num2 = strToInt(Str1);
//		System.out.println("Result of String to Int: " + num2);
		

		//adding two var num1 + num2;
		
		int sum = num1 + num2;
		System.out.println("Result of Two Sum: " + sum);
		
		
	}

}
