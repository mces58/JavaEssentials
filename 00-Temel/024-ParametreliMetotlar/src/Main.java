
public class Main {
	public static void main(String[] args) {
		add(3, 4, 5);
	}

	public static void add(int number1, int number2, int number3) {
		int total = 0;
		total = number1 + number2 + number3;
		message("Total: " + total);
	}

	public static void message(String message) {
		System.out.println(message);
	}
}
