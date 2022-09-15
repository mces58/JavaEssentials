
public class Employee extends Person {
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

	private double salary;

	public Employee(int id, String firstName, String lastName, int age, double salary) {
		super(id, firstName, lastName, age);
		this.salary = salary;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
}
