import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// C ile ayni
		// do-while kosul saglamasa bile dongu bir kere de olsa calisir

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);

		System.out.print("Bir sayi giriniz : ");

		int sayi = scan.nextInt();
		int toplam = 0;

		do {
			toplam += sayi % 10;
			sayi = sayi / 10;

		} while (sayi > 0);

		System.out.println("Sayinin basamaklari toplami : " + toplam + "\n");

		int i = 1;

		do {
			System.out.println(i);
			i += 2;
		} while (i < 15);
	}
}
