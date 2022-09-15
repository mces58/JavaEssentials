import java.util.Scanner; // ctrl + shift + o

public class Main {
	public static void main(String[] args) {
		// C ile ayni

		System.out.println("1-Bakiye Goruntuleme");
		System.out.println("2-Para cekme");
		System.out.println("3-Para Yatirma");
		System.out.println("4-Kart iade");
		System.out.println("Hangi islemi yapmak istiyorsunuz: ");

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int secim = scan.nextInt();

		int bakiye = 1000;

		switch (secim) {
		case 1:
			System.out.println("Bakiyeniz : " + bakiye + " TL");
			break;

		case 2:
			System.out.println("Cekilecek miktar : ");

			int miktar = scan.nextInt();

			if (miktar > bakiye) {
				System.out.println("Yetersiz bakiye..");
			} else {
				bakiye -= miktar;
				System.out.println("Kalan Bakiyeniz : " + bakiye + " TL");
			}

			break;

		case 3:
			System.out.println("Yatirilacak miktar :");

			miktar = scan.nextInt();

			bakiye += miktar;

			System.out.println("Yeni Bakiyeniz : " + bakiye + " TL");
			break;

		case 4:
			System.out.println("Kartiniz iade edildi...");
			break;

		default:
			System.out.println("Gecersiz islem...");
		}
	}
}
