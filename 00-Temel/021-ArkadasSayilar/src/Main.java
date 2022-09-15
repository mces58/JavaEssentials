
public class Main {
	public static void main(String[] args) {
		// iki sayinin pozitif tam bolenlerinin toplami birbirlerini veriyorsa bunlar
		// arkadas sayilardir. ornegin 220 ile 284

		int number1 = 1184;
		int number2 = 1210;
		int total = 0;

		for (int i = 1; i < number1 / 2 + 1; i++) {
			if (number1 % i == 0) {
				total += i;
			}
		}

		if (total == number2) {
			System.out.println("Arkadas sayilar");
		}

		else {
			System.out.println("Arkadas sayi degiller");
		}
	}
}
