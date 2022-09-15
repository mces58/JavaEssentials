
public class Main {
	public static void main(String[] args) {
		// Bu kullanima for Each deniyor arrayleri veya ArrayListleri uzerinde
		// kullanilabilir

		String[] ogrenciler = { "can", "ali", "ahmet", "ayse" };
		// bunlari ekrana basmak icin for da yeni bir kullanim var
		// bu kullanim diziler ve arrayListler icin gecerli

		for (String ogrenci : ogrenciler) {
			// for un icine dizinin tipi sonra kafana gore bir referans adi sonra iki nokta
			// ust uste sonra da dizinin adi. Ekrana bastirmak icin de referans adi ile
			// ekrana bastirilir kisa ve oz bir kullanim
			System.out.println(ogrenci);
		}
		System.out.println("\n");

		// simdi de baska bir tipte dizi icin yapalim
		int[] numbers = { 10, 20, 30, 40, 50 };

		for (int number : numbers) {
			System.out.println(number);
		}

		// goruldugu gibi i'lerle falan ugrasmak yok

		System.out.println("\n");

		// simdi bir ornek daha yapalim
		// i'li for da ki gibi bu kullanim da array de ki tum elemanlari gezer
		// karsilartirir vs isler yapar

		double[] myList = { 1.1, 2.8, 3.85, 4.79, 0.89 };
		double total = 0;
		double max = myList[0];

		for (double number : myList) {
			total += number;
			System.out.println(number);

			if (max < number) {
				max = number;
			}
		}
		System.out.println("Sayilarin toplami : " + total);
		System.out.println("En buyuk sayi : " + max);

	}
}
