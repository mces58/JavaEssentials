
public class Employee {
	// bu class bizim super , base (ana) classimiz olacak

	private String name;
	private String department;
	private int salary;

	public Employee(String name, String department, int salary) {
		// constructor olusturduk kisa yol alt + shift + s ile
		this.name = name;
		this.department = department;
		this.salary = salary;
	}

	// bir tane metot yazalim
	// burada field tutan class'ta metot yazmak dogru degil . cunku single
	// responsibility prensibini ihmal etmekteyiz lakin olayi anlamak icin yaziyoruz
	public void show() {
		System.out.println("Adi: " + this.name);
		System.out.println("Departmani: " + this.department);
		System.out.println("Maasi: " + this.salary);
	}
}