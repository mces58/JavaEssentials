
public class Main {
	public static void main(String[] args) {
		Employee employee = new Employee("Can", 5000, 37, 2011);

		EmployeeManager employeeManager = new EmployeeManager();
		employeeManager.show(employee);

		System.out.println("\n");

		Employee employee2 = new Employee("Eser", 6254.84, 43, 2004);
		employeeManager.show(employee2);
	}
}
