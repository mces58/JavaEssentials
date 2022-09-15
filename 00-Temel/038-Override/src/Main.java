
public class Main {
	public static void main(String[] args) {
		Employee employee = new Employee("Mehmetcan", "Bilisim", 3000);
		employee.show();

		System.out.println();

		Manager manager = new Manager("Mehmetcan ESER", "Bilisim", 5000, 10);// 10 burada kisi sayisi

		manager.show();
		manager.zam(100);
	}
}
