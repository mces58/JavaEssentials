import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {

		ArrayList<Customer> customers = new ArrayList<Customer>(); // customer turunde arraylist

		customers.add(new Customer(1, "Can", "Eser"));
		customers.add(new Customer(2, "Ali", "Keser"));
		customers.add(new Customer(3, "Veli", "Telli"));

		for (Customer customer : customers) {
			System.out.println(customer.firstName);
		}

		// simdi bir tane daha musteri ekleyelim
		System.out.println();

		Customer customer1 = new Customer(4, "Hasan", "Basan");
		customers.add(customer1);

		for (Customer customer : customers) {
			System.out.println(customer.firstName);
		}

		// simdi bir musteri silelim
		System.out.println();

		customers.remove(0);
		customers.remove(customer1);

		for (Customer customer : customers) {
			System.out.println(customer.firstName);
		}
	}
}
