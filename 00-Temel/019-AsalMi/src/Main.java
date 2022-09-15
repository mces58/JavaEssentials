
public class Main {
	public static void main(String[] args) {
		int number = 1;
		boolean result = true;

		if (number < 1) {
			System.out.println("Gecersiz sayi");
			return;// return koymazsak asal sayi diyor return ile programi bitiriyor
		}

		else if (number == 1) {
			System.out.println("asal degil");
			return;
		}

		// number / 2 yapmamizin sebebi zamandan kazanc icin eger bir sayi yarisina
		// kadar tam bolunmuyorsa diger yarisinda da tam bolunmez
		// temel matematik bilgisi
		for (int i = 2; i <= (number / 2); i++) {
			if (number % i == 0) {
				result = false;
				break;
			}
		}

		if (result) {
			System.out.println("asal");
		}

		else {
			System.out.println("asal degil");
		}
	}
}
