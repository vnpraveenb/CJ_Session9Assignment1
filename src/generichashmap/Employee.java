/**
 * 
 */
package generichashmap;

 /**
 * This class is used to create employee object containing the employee code, employee. It also has
 * getter, setter methods to modify and retrieve the values of the variables of the  objects of this
 * class
 *
 * @author Praveen
 */
public class Employee {
	
	/** The employee code. */
	int empCode;
	
	/** The employee name. */
	String empName;

	/**
	 * Empty Constructor
	 * Instantiates a new employee.
	 */
	public Employee() {
 	}
	
	/**
	 * Instantiates a new employee.
	 *
	 * @param empCode the employee code
	 * @param empName the employee name
	 */
	public Employee(int empCode, String empName) {
		this.empCode = empCode;
		this.empName = empName;

 	}

 	// Getter and Setter Methods
	/**
	 * Sets the employee code.
	 * @param empCode the new employee code
	 * @return returns void(nothing)
	 */
	public void setempCode(int empCode){
		
		this.empCode = empCode;
	}
	
	/**
	 * Sets the employee name.
	 * @param empName the new employee name
	 * @return returns void(nothing)
	 */
	public void setEmpName(String empName){
		this.empName = empName;
	}
	
	/**
	 * Gets the employee code.
	 * @return the employee code
	 */
	public int getempCode(){
		return empCode;
	}

	/**
	 * Gets the employee name.
	 * @return the employee name
	 */
	public String getEmpName(){
		return empName;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString(){
		return empCode+": "+empName;
	}
}
