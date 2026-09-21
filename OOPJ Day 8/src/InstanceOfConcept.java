import java.io.*;

class Employee {
    void work() {
        System.out.println("Employee working");
    }
}

class Manager extends Employee {
    void manage() {
        System.out.println("Manager managing");
    }
}




public class InstanceOfConcept {

	public static void main(String[] args) {
		
		//upcasting
		Employee emp = new Manager();
		
		emp.work();
		
		//downcasting
		Manager man = (Manager) emp;
			man.manage();
			man.work();
			
		//old way to check whether an object belongs to specific class or not, befoe pattern matching
		if(emp instanceof Employee) {
			Manager m = (Manager) emp; //tradition way to do downcasting
			System.out.println("true");
		}else
			System.out.println("false");
			
		
		//pattern matching using instanceof keyword
		
		if(emp instanceof Manager m) {
			//below is modern way to downcast using instanceof keyword
			m.manage();
			m.work();
		}
	}

}


/**
 * Pattern Matching does: it check object type + cast object at a time and then use/create obj
 * 
 *In old Way we does: first we check object type -> then we perform downcasting -> then we use it
 *
 *  So modern Java code is -> shorter, easier to read, less repetitive, less error-prone.
 */
