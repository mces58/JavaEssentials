
public class Main {
	public static void main(String[] args) {
		Entity entity = new Entity(10, 4);
		Calculator calculator = new Calculator();

		System.out.println("Topla: " + calculator.add(entity));
		System.out.println("Cikar: " + calculator.minus(entity));
		System.out.println("Carp: " + calculator.times(entity));
		System.out.println("Bol: " + calculator.divideBy(entity));
	}
}
