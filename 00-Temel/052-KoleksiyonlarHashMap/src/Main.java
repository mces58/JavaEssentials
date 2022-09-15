import java.util.HashMap;

public class Main {
	public static void main(String[] args) {

		// pek kullanilan bir yapi degildir.
		// java.util.HashMap paketi dahil edilmelidir.

		HashMap<String, String> sozluk = new HashMap<String, String>();

		// iki string tipiyle calisacam bunlar illa string olmasina gerek yok
		// .String-Integer , Integer-Double , class-class , class-nesne de olabilir.
		// ilk yazilan String anahtar(key) olur ikinci String deger(value) olur.

		// sozluge eleman ekleyelim. Bunu put ile yapiyoruz

		sozluk.put("book", "kitap"); // book anahtar olurken kitap deger olmaktadir
		sozluk.put("car", "araba");
		sozluk.put("cat", "kedi");

		System.out.println(sozluk.size()); // sozlugun boyutunu yazar.

		for (String eleman : sozluk.keySet()) { // sozlugun anahtar elemanlarini gez demek
			System.out.println(eleman);
		}

		System.out.println();

		for (String eleman : sozluk.keySet()) {
			System.out.println(eleman + " : " + sozluk.get(eleman)); // deger elemanlarina get ile ulasiyoruz
		}

		sozluk.remove("cat"); // eleman sileceksek indis dgilde anahtar kelimeyi veriyoruz

		System.out.println("\n" + sozluk); // boylede hepsini yazdirabiliriz

		System.out.println("\n" + sozluk.get("book")); // book anahtar kelimesinin degerini yazdirir
	}
}
