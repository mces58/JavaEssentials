import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		/*
		 * Array'leri en basta tanimlarken boyutunu belirtiyoruz ve sonradan
		 * degistiremiyoruz yani arrayler statik yapidadirlar lakin ArrayList'ler boyle
		 * degiller sonradan boytunu degistirelibiliyoruz ArrayListler dinamik
		 * yapidadirlar
		 * 
		 * ArrayListler koleksiyondur
		 * 
		 * Arraylistler bir class'dir
		 * 
		 * ArrayListleri kullanirken java.util.ArrayList paketini dahil etmeliyiz
		 */
		ArrayList sayilar = new ArrayList(); 
		// arrayList'i tanimladik nesnesini olusturduk. class oldugu icin.Bu
		// kullanimda object ile calisiyoruz
		// bu kullanimda arraye her sey eklenebilir . sayi , string , class...Bu
		// kullanim pek tercih edilmez cunku tip guvenli degildir.

		System.out.println("boyut: " + sayilar.size()); // suan sayilar nesnesinde eleman olmadigi icin ici bos

		sayilar.add(10); // sifinci indis oluyor otomatik olarak
		sayilar.add(20); // birinci indis

		System.out.println("0. index: " + sayilar.get(0));
		System.out.println("1. index: " + sayilar.get(1)); // get ile okuyoruz 1 ise birinci indis demek

		sayilar.add("sivas"); // illa sayi verecez diye belirtmedik . Her sey verebiliriz
		System.out.println("2. index: " + sayilar.get(2));

		// sonradan bir degisiklik yapmak istersek bunu set ile yapiyoruz

		sayilar.set(0, "zara"); // sifinci indiste ki eleman yerine artik zara geldi demektir
		System.out.println("0. index: " + sayilar.get(0));

		sayilar.add(3, 1.4); // bu kullanim da 3.indeks oluyor 1.4 ise o indekste ki eleman oluyor

		System.out.println("3. index: " + sayilar.get(3));

		// eleman silmek icin remove kullanilir
		sayilar.remove(0);
		// sifinci indeksi sildik yerine 1. index geldi boylece yeni sifirinci
		// indekisimiz 20 oldu.
		System.out.println("0. index: " + sayilar.get(0));
		
		/*
	 	--------    --------   ----------    ----------    
	 	|      |    |      |   |        |    |        |
	 	|  10  |    |  20  |   | sivas  |    | zara   |
	 	|      |    |      |   |        |    |        |
	 	--------    --------   ----------    ----------
	 	0. indeks   1. indeks   2. indeks     3. indeks
	 	
	 	
	 	simdi 0 indeksi remove ettigmiz de 
	 	
	 	-------		  ----------     ----------  
	 	|     |		  |        |     |        |
	 	| 20  |		  | sivas  |     | zara   |
	 	|     |		  |        |     |        |
	 	-------		  ----------     ----------
	 	 yeni           yeni            yeni
	 	 0.indeks      1. indeks      2. indeks olmus olur
		*/
		
		// sayilar.clear();
		// butun elemanlari temizler geriye size bos bir nesne kalir
		System.out.println();

		for (Object i : sayilar) {

			System.out.println(i);
		}
		/*
		 * for (int i: sayilar) { System.out.println(i); }
		 * 
		 * boyle bir kullanimda sistem hata verir cunku biz arrayListin tipini vermedik
		 * yani arraylistte string(ankara) de var intte(20) dolayisiyla hata verir
		 * 
		 * bunun yerine Object seklinde kullanacagiz
		 */
	}
}
