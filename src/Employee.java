// Defining Class Employee
public abstract class Employee {

	   private String name; // Declare variable of type String
	   private String address; // declare variable of type String
	   private int number; // Declare variable of type number

	   // Creating constructor of class employee with 3 parameters
	   public Employee(String name, String address, int number) {
		  // Constructing an employee
	      this.name = name;  // Assigning Employee name
	      this.address = address; // Assigning Employee Address
	      this.number = number; // Assigning a number
	   }

	   // Declaring abstract methods
	   public abstract void mailCheck();

	   // returns the string form of values
	   public String toString() {
	      return name + " " + address + " " + number;
	   }
	   
	   //getter for variable name
	   public String getName() {
	      return name;
	   }
	 
	   // getter for variable address
	   public String getAddress() {
	      return address;
	   }
	   
	   // setter for variable address
	   public void setAddress(String newAddress) {
	      address = newAddress;
	   }
	   // getter for variable number
	   public int getNumber() {
	      return number;
	   }
}