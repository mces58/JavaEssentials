
public class Main {
	public static void main(String[] args) {
		Employee employee = new Employee(123,"can", "eser",34,3000);
		/*
		employee.id = 123;
		employee.firstName = "can";
		employee.lastName = "eser";
		employee.age = 34;
		employee.salary = 3000;
		*/
		Customer customer = new Customer(147,"emos","eser",25,"emos@gmail.com");
		/*
		customer.id = 147;
		customer.firstName = "emos";
		customer.lastName = "eser";
		customer.age = 25;
		customer.email = "emos@gmail.com";
		*/
		
		// boyle yaparakta degerleri atayabiliriz
		// bir kacta metodu ele alalim 
		CustomerManager customerManager = new CustomerManager();
		customerManager.list();
		customerManager.add();
		customerManager.delete();
		customerManager.luckyCustomer(customer);
		
		EmployeeManager employeeManager = new EmployeeManager();
		employeeManager.list();
		employeeManager.add();
		employeeManager.delete();
		employeeManager.bestEmployee(employee);
	}
}
