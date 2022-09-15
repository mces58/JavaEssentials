
public class Customer extends Person{
	/*
	 * int id; 
	 * String firstName; 
	 * String lastName;
	 * int age;
	 *  
	 * bu ozellikler hem Employee classi icin hem de Customer class icin de ortak
	 * dolayisiyla bu ortak ozellikleri iki defa yazmamak icin burada inheritance
	 * kullanilabilir Bunu da person classinda yapacagiz .Sonucta Customer dedigimiz
	 * de insan Employee dedigimizde insan .
	 */

	// extends ile bu classlari Person classina baglayalim

	private String email;

	public Customer(int id, String firstName, String lastName, int age, String email) {
		super(id, firstName, lastName, age);
		this.email = email;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
