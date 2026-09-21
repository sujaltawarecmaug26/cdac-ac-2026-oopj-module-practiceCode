package org.sujal.com;

class TestException{
	
	//example of throw keyword
	public void ageValidator(int age) throws Exception {
		if(age < 18) {
			throw new IllegalArgumentException("Age must be 18 or above");
//			System.out.println("you can't vote");
		}else {
			System.out.println("you can vote.");
		}
	}
	
	public void foundElement(int idx, int arr[]) {
		
		if(idx > arr.length) {
			throw new ArrayIndexOutOfBoundsException(idx +"Index is out of bound array"); 
		}else if(idx < 0) {
			throw new ArrayIndexOutOfBoundsException("Index should be equal and greater than zero"); 
		}else {
			System.out.println(arr[idx]);
		}
		
	}
	
}

class Bank{
	
	public void withdrawProcess(int amount, int balance) throws Exception{
		
		if(amount < 0) {
			throw new IllegalArgumentException("Amount must be greater than zero");
		}
		
		if(amount > balance) {
			throw new IllegalArgumentException("Insufficient Balance");
		}
		
		System.out.println("Withdrawal Successful");
	}
}






public class Program {

	public static void main(String[] args) {
		
		TestException obj = new TestException();
		Bank bankObject = new Bank();
		
		int num1 = 40;
		int num2 = 0;
		int[] arr = {10, 20, 30};
		
		
		try {
			int ans = num1/num2;
			System.out.println(ans);
			System.out.println(arr[8]);
			
		}catch(ArithmeticException e) {
			e.printStackTrace();
			
		}catch (ArrayIndexOutOfBoundsException e) {

		    System.out.println("Invalid array index");
		    e.printStackTrace();

		}finally {

		    System.out.println("Finally executed");

		}
		
		System.out.println(num2);
		
		
		
		//catch exceptions that may occur from ageValidator method.s
		try {
			obj.ageValidator(9);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		obj.foundElement(1, arr); // o/p -> 20;
		
//		obj.foundElement(-1, arr); // occur -> Index should be equal and greater than zero
		 
//		obj.foundElement(8, arr); // occur -> 8 Index is out of bound array
		
		
		//bank class handle exceptions flow with nested try-catch
		try {
			
			//first
			try {
				bankObject.withdrawProcess(3000, 1822); // occur :Insufficient Balance exception
			} catch (Exception e) {
				 System.out.println("First transaction: "
			                + e.getMessage());
			}
			
			System.out.println("Outer try continues");
			
			//second
			try {
				bankObject.withdrawProcess(-3000, 1822); // occur : Amount must be greater than zero exception
			} catch (Exception e) {
				 System.out.println("Second transaction: "
			                + e.getMessage());
			}
			
			//third 
			bankObject.withdrawProcess(2000, 2822);
			
			//outer catch block
		}catch(Exception e){
			
			System.out.println("Outer Catch -> " + e.getMessage());
			
		}finally {
			
			System.out.println("Transaction process completed");
			
		}

	}

}
