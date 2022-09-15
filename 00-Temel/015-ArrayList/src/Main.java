import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		/*
		 * Ders 51 ve 52 detayli konu anlatimi bulunmaktadir
		 * 
		 * Arrayleri en basta tanimlarken boyutunu belirtiyoruz ve sonradan
		 * degistiremiyoruz yani arrayler statik yapidadirlar lakin ArrayListler boyle
		 * degiller sonradan boytunu degistirelibiliyoruz ArrayListler dinamiktik
		 * yapidadirlar Arraylistler bir class'tir
		 * 
		 * ArrayListleri kullanirken java.util.ArrayList paketini dahil etmeliyiz
		 */
		ArrayList<String> names = new ArrayList<String>();
		// name adli nesne olusturduk arrayListler class oldugu icin turu string
		// Suan nesne olustu ama ici bos dolduralim . Doldururken .add kullaniyoruz

		// ArrayListler de sifirinci indeksten baslar
		names.add("Can");
		names.add("Eser");
		names.add("Ali");
		names.add("Ayse");

		// sifirinci indeks bastiralim ekrana

		System.out.println("0 . indeks : " + names.get(0)); // bastirmak icin .get kullaniyoruz
		System.out.println("1 . indeks : " + names.get(1));

		// ArrayListimizin uzunlugunu bulmak icin .size() kullanilir
		System.out.println("ArrayList uzunluk : " + names.size());

		// Simdi de hepsini ekrana bastiralim
		for (int i = 0; i < names.size(); i++) {
			System.out.println(names.get(i));
		}
		System.out.println();

		// ArrayListimizden eleman silmek istersek .remove ile yapiyoruz .
		// Ya silecegimiz elemanin adini giriyoruz ya da indeks numarasini giriyoruz

		// ayse ismini ArrayListimizden silelim
		names.remove("Ayse");

		for (int i = 0; i < names.size(); i++) {
			System.out.println(names.get(i));
		}
		System.out.println();

		// simdi de ali ismini silelim bunu indeks numarasini vererek yapalim Ali
		// isminin indeks numarasi 2
		names.remove(2);

		for (int i = 0; i < names.size(); i++) {
			System.out.println(names.get(i));
		}

		// Bir ozellik daha gosterelim
		// ArrayListteki elemanimizin hangi indekste oldugunu bulmak istiyorsak
		// .indexOf() kullanabiliriz
		// eser isminin kacinci indekste oldugunu bulalim

		System.out.println("\nEser isminin indeks numarasi: " + names.indexOf("Eser"));
		System.out.println("Can isminin indeks numarasi: " + names.indexOf("Can"));
		System.out.println("Fatma isminin indeks numarasi: " + names.indexOf("Fatma"));
		// fatma ismi listede olmadigi icin -1 degeri doner
	}
}
