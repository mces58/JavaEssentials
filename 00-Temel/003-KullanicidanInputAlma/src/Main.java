import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		scanner.useLocale(Locale.US);

		System.out.print("int bir sayi giriniz:");
		Object sayi = scanner.nextInt();
		System.out.println("Girilen sayi: " + sayi);
		System.out.println(sayi.getClass());

		try {// 2 saniye durdurur.
			Thread.sleep(2000);
		} catch (Exception e) {
			System.out.println(e);
		}

		System.out.print("\nDouble bir sayi giriniz:");
		Object sayi2 = scanner.nextDouble();
		// burada double deger alirken ondalikli sayiyi noktali bir sekilde girersek
		// hata verecektir cunku java da standart ondalikli sayiyi virgul ile ayirmaktir
		// bu yuzden noktayi kullanmak istiyorsak Local bilgisini degistirmek zorundayiz
		// boylece amerika standartlarini kullanmis olacaz
		System.out.println("Girilen sayi: " + sayi2);
		System.out.println(sayi2.getClass());

		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			System.out.println(e);
		}

		scanner.nextLine();
		System.out.print("\nstring bir ifade giriniz:");
		Object str = scanner.nextLine();
		System.out.println("Girilen ifade: " + str);
		System.out.println(str.getClass());

	}
}
