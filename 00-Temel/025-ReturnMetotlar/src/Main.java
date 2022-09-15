
public class Main {
	public static void main(String[] args) {
		int number = 131;
		System.out.println(divide(multiply(add(number))));
	}

	public static int multiply(int number) {
		return number * 3;
	}

	public static int add(int number) {
		return number + 5;
	}

	public static double divide(int number) {
		return (double) number / 7;
	}
}
