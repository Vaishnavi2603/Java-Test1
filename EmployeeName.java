package JavaTest1;

class Employee{
	
	 String firstName;
	 String lastName;
	
	public Employee(String firstName,String lastName) 
	{
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		
	}
	
	@Override
	public String toString() {
		return "Employee Name: \nFirstname : " + firstName + "\nLastname : " + lastName;
	}	
}

public class EmployeeName {
	
	public static void main(String[] args) {
		
		Employee emp1 = new Employee("Rahul","Kumar");
		Employee emp2 = new Employee("Prasad","Rao");
		System.out.println(emp1);
		System.out.println(emp2);
	}

}

