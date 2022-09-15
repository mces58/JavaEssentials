
public class Main {
	public static void main(String[] args) {
		int a = 12;
		int b = 5;

		System.out.println("Toplam: " + (a + b));

		System.out.println("Fark: " + (a - b));

		System.out.println("Carpim: " + (a * b));

		System.out.println("(Dogru degil) Bolum: " + (double) (a / b));
		// islem bittikten sonra double konulmus lakin islemin sonucu dogru degil
		// double nereye koydugun onemli

		System.out.println("(double) Bolum: " + ((double) a / b));
		// burada a'yi double cevirerek islem yapiyoruz

		System.out.println("Kalan: " + (a % b));

		System.out.println("Rastgele islem: " + (53 / 5.1 - (54 * 21)));
	}
}
