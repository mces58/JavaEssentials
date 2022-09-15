
public class Main {
	public static void main(String[] args) {
		// Bir sayinin pozitif tam bolenlerinin toplami , kendine esit olan sayiya
		// mukemmel sayi denir.

		int number = 28;
		int total = 0;

		if (number < 1) {
			System.out.println("Gecersiz sayi");
		}

		if (number == 1) {
			System.out.println("Mukemmel sayi");
		}

		for (int i = 1; i <= (number / 2); i++) {
			if (number % i == 0) {
				total += i;
			}
		}

		if (number == total) {
			System.out.println("Mukemmel sayi");
		}

		else {
			System.out.println("Mukemmel sayi degil");
		}
	}
}
