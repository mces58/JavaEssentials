
public class Customer {
	private String title;
	private String firstName;
	private String lastName;
	private String email;
	private String phoneNumber;

	public Customer(String title, String firstName, String lastName, String email, String phoneNumber) {
		this.title = title;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phoneNumber = phoneNumber;
	}

	public String getTitle() {
		return title;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getEmail() {
		return email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

}
