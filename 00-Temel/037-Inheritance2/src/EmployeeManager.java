
public class EmployeeManager extends PersonManager{
	/*
	public void list() {
		System.out.println("Listelendi.");
	}

	public void add() {
		System.out.println("Eklendi.");
	}
	
	public void delete() {
		System.out.println("Silindi.");
	}
	
	Bu operasyonlar hem CustomerManeger icin hemde EmployeeManager icin gecerli dolayisiyla 
	bunlari bir PersonManager classinda toplayabilir , CustomerManeger ile EmployeeManageri  
	PersonManager extends'leyebiliriz.
	*/
	
	// bu classa ozgu metot
	public void bestEmployee(Employee employee) {
		System.out.println("Bugunun en iyi calisani sizsiniz: " + employee.getFirstName());
	}
}
