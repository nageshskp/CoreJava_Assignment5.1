
public class AbstractClass {

	
	public static void main(String [] args) {

	      Salary objSalary = new Salary("Student", "Bengaluru", 7, 30000.00);

	      Employee objEmployee = new Salary("Graduate ", "Bengaluru", 9, 900000.00);
	      

	      System.out.println("Call salary check method --");

	      objSalary.mailCheck();
	      System.out.println();

	      System.out.println("Call employee check method--");

	      objEmployee.mailCheck();
	   }
}

