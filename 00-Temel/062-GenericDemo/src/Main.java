
public class Main {
	// repository deseni uzerinde generic siniflar ve kisitlar

	public static void main(String[] args) {

		Validator validator = new Validator();
		Customer customer = new Customer();

		validator.validate(customer);
	}
}
