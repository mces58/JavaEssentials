
public class Main {
	public static void main(String[] args) {

		// stringler , java da aslinda bir class'dir.
		// Stringleri iki farkli sekilde tanimlayabiliriz.

		String s1 = "Can";
		String s2 = new String("Can"); // class oldugu icin nesne olusturarakta tanimlama yapabiliriz

		System.out.println(s1);
		System.out.println(s2);
		System.out.println();

		// LENGTH function
		System.out.println(s2.length()); // s2 uzunlugunu bulabiliriz
		System.out.println(s1.length()); // s1 uzunlugunuda bulabiliriz
		System.out.println();

		// CHARAT function
		// hangi indekste hangi eleman varsa charAt ile bunu bulabiliriz
		System.out.println("0 . indeks : " + s2.charAt(0));
		System.out.println("1 . indeks : " + s2.charAt(1));
		System.out.println("2 . indeks : " + s2.charAt(2));
		System.out.println();

		// STARTSWITH and ENDSWITH function
		// hangi elemanla basladigini kontrol edebiliriz s2 , C ile basliyor
		// dolayalisiyla true deger alir
		System.out.println(s2.startsWith("C"));
		System.out.println(s2.startsWith("m")); // s2 m ile baslamadigi icin false deger alir
		System.out.println(s2.endsWith("n")); // sonu n ile bittigi icin true
		System.out.println();

		// INDEXOF function
		System.out.println(s2.indexOf("a")); // a'nin indeks numarasini bulduk
		System.out.println(s2.lastIndexOf("n")); // n karakterini sondan aramaya baslar
		System.out.println();

		// peki bu iki tanimlama arasinda ki fark nedir?

		// mesela s3 diye bir sey daha tanimlayalim buna da Can atayim simdi s1 ile s3
		// ikisi de ayni yeri gosteriyor oldu
		// lakin bu s3 nesneli sekilde tanimlasaydik adres olarak ayni yerleri
		// gostermeyeceklerdi.

		String s3 = "Can"; // normal tanimlama

		if (s1 == s3) {
			System.out.println("adresler ayni");
			// goruldugu gibi ikiside ayni adresi gosteriyor cunku icindeki degerler ayni
			// tekrardan bellekte yeni bir yer acilmiyor s3'e.
		}

		String s4 = new String("Can"); // nesneli tanimlama

		if (s2 == s4) {
			System.out.println("Adresler ayni");
		}

		else {
			System.out.println("Adresler ayni degil");
			// s4'u nesneli olarak tanimladim ve bu s2 ile s4'un degerleri ayni olsa bile
			// adresleri farkli olacaktir. Cunku new'leme yapiyoruz.
			// Yani bellekten yeni bir yer istiyoruz
		}
		System.out.println();
		// s2 ile s4'un icindeki degerleri nasil kiyaslaruz? bunu equals
		// fonksiyonu ile yapiyoruz

		if (s2.equals(s4)) {
			System.out.println("s2 ile s4 degerleri esittir.");
		}

		String mesaj1 = "eser";
		String mesaj2 = "keser";

		if (mesaj1.equals(mesaj2)) {
			System.out.println("Mesaj1 ile Mesaj2 degerleri esittir.");
		}

		else {
			System.out.println("Mesaj1 ile Mesaj2 degerleri esit degildir.");
			// mesaj1 ile mesaj2 degiskenlerinin icindeki degerler esit degil
		}
		System.out.println();

		// CONCAT function
		// baska bir ozellik olarak stringleri birlestirebiliriz.
		System.out.println(s1.concat(" nasilsin?"));
		System.out.println();

		// REPLACE function
		// baska bir ozellik daha gosterelim replace Stringimizi degistirmede
		// duzenlemede kullanabiliriz
		String mesaj = "Bugun hava cok guzel";
		System.out.println(mesaj.replace(" ", "-"));
		// bosluk karakteri yerine - kullandim her bosluk icin yapti bunu
		System.out.println();

		// SUBSTRING function
		// yeni ozelligimiz substring bu ise Stringimizi istedigimiz yerden parcaliyor
		// ve geri kalanini aliyor
		System.out.println(mesaj.substring(3)); // 3 . indeksten itibaren almaya basladi
		// baska bir kullanimi ise
		System.out.println(mesaj.substring(2, 5));
		// 2 . indeksten basla 5 . indekse kadar parcala demek
		System.out.println();

		// TOLOWERCASE and TOUPPERCASE function
		System.out.println(mesaj.toLowerCase()); // stringimizi tamamen kucuk harfe cevirir
		System.out.println(mesaj.toUpperCase()); // stringimizi tamamen buyuk harfe cevirir
		System.out.println();

		// TRIM function
		// trim fonksiyonu basta ki ve sonda ki bosluk karakterini kaldirmaya yarar
		String mesaj3 = "          Nasilsin Can?         ";
		System.out.println(mesaj3);
		System.out.println(mesaj3.trim());
	}
}
