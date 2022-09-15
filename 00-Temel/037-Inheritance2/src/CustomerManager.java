
public class CustomerManager extends PersonManager{
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
	
	// bu metod bu classa ozgu metot
	public void luckyCustomer(Customer customer) {
		System.out.println("Bugunun sansli musterisi sizsiniz: " + customer.getFirstName());
	}	
}
