
public class Main {

	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {
			System.out.println("i = " + i);
		}
		System.out.println("\n");

		for (int j = 0, k = 10; j < 5 && k > 0; j++, k -= 3) {
			System.out.println("k = " + k + " j = " + j);
		}
		System.out.println("\n");

		for (int n = 0; n < 5; n++) {

			for (int m = 0; m < 5; m++) {
				System.out.println("n = " + n + " m = " + m);
			}
		}
	}
}