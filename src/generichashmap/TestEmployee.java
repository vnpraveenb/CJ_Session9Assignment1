/**
 * 
 */
package generichashmap;

import java.util.*;

 /**
 * This used to demostrate the addition of contents of the Employee object into a generic 
 * Hashmap object. Furthermore, the Employee code is used as the key and Employee name is used as
 * value in the resulting Hashmap. The Employees' names are displayed as the output
 * @author Praveen
 */
public class TestEmployee {
	
 	
	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		
		//Creating Employee Objects with parameterised constructor
		Employee emp1 = new Employee(1, "Praveen");
		Employee emp2 = new Employee(2, "Rajesh");
		
		//Creating Employee Objects with the empty constructor
		Employee emp3 = new Employee();
		emp3.setempCode(3);
		emp3.setEmpName("Anita");
		
		Employee emp4 = new Employee();
		emp4.setempCode(4);
		emp4.setEmpName("Rakesh");

		
		// Instantiating the Hashmap Object with empty constructor
		HashMap<Integer,String> employeeMap = new HashMap<Integer,String>();
		
		//All Employees' Employee code(key) and Employee Name(value) are added into the Hashmap
 		employeeMap.put(emp1.getempCode(), emp1.getEmpName());
		employeeMap.put(emp2.getempCode(), emp2.getEmpName());
		employeeMap.put(emp3.getempCode(), emp3.getEmpName());
		employeeMap.put(emp4.getempCode(), emp4.getEmpName());

		// Prints the Employee Names(values) in the HashMap
 		System.out.println(employeeMap.values());
 		
 		//Values in the printed one by one using the employee code
 		System.out.println(employeeMap.get(emp1.getempCode())); 
 		System.out.println(employeeMap.get(emp2.getempCode()));
 		System.out.println(employeeMap.get(emp3.getempCode()));
 		System.out.println(employeeMap.get(emp4.getempCode()));
 
		
		
	}

}
