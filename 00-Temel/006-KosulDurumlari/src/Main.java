import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		/*
		 * Karsilastirma operatorleri
		 * 
		 * a == b ---> esit mi (esitse true degilse false)
		 * 
		 * a != b ---> esit degil mi (esit degilse true esitse false)
		 * 
		 * a > b ---> a , b ' den buyuk mu (buyukse true degilse false)
		 * 
		 * a < b ---> a , b ' den kucuk mu (kucukse true degilse false)
		 * 
		 * a >= b ---> a , b ' ye esit mi veya a , b ' den buyuk mu (iyleyse true
		 * degilse false)
		 * 
		 * a < = b ---> a , b ' ye esit mi veya a , b ' den kucuk mu (oyleyse true
		 * degilse false)
		 * 
		 * Mantiksal baglaclar
		 * 
		 * and (ve) ---> &&
		 * 
		 * not(degil) ---> !
		 * 
		 * or(veya) ---||
		 * 
		 * 
		 * if( kosul ) { islemler.... }
		 * 
		 * else if ( kosul ) { islemler .... }
		 * 
		 * else { islemler ... }
		 * 
		 * C ile ayni
		 * 
		 */
		@SuppressWarnings("resource")

		Scanner scan = new Scanner(System.in);

		System.out.println("Notunuzu giriniz: ");

		int note = scan.nextInt();

		if (note > 90) {
			System.out.println("Notunuz : AA");
		}

		else if (note > 70 && note <= 90) {
			System.out.println("Notunuz : BB");
		}

		else if (note > 60 && note <= 70) {
			System.out.println("Notunuz : CC");
		}

		else if (note > 50 && note <= 60) {
			System.out.println("Notunuz : EE");
		}

		else {
			System.out.println("Dersten kaldiniz");
		}

		// burada kosullara bakip true veya false yaziyor unutma java da boolean diye
		// bir veri tipi var

		System.out.println("\nSonuc : " + (3 < 5));

		System.out.println("\nSonuc : " + !(3 < 5)); // degilini aldik

		System.out.println("\nSonuc : " + ((3 < 5) && ("can" == "can")));
		// print icinde de kosullari kontrol edebiliyoruz

		// simdi asagida facebook giris safyasi yapalim

		// stringler == ile kiyaslanamiyorlar bunun icin ayri bir fonksiyon daha
		// lazim bunuda equals ile yapiyoruz

		String kullaniciAdi = "mc_es58";
		String kullaniciSifresi = "123";

		System.out.println("\nKullanici adinizini giriniz: ");
		String isim = scan.next();

		System.out.println("\nSifrenizi giriniz: ");
		String sifre = scan.next();

		if (!(kullaniciAdi.equals(isim)) && !(kullaniciSifresi.equals(sifre))) {
			// isim.equals(kullaniciAdi) bu da dogru
			// sifre.equals(kullaniciSifresi) iki deger esitse anlamina geliyor
			System.out.println("Kullanici adinizi ve sifrenizi yanlis girdiniz !");
		}

		else if (isim.equals(kullaniciAdi) && !(sifre.equals(kullaniciSifresi))) {
			// !(sifre.equals(kullaniciSifresi)) bunun anlami mevcut sifreniz ile girmis
			// oldugunuz sifre esit degilse
			System.out.println("Sifrenizi yanlis girdiniz !");
		}

		else if (!(kullaniciAdi.equals(isim)) && kullaniciSifresi.equals(sifre)) {
			// !(isim.equals(kuLaniciAdi)) bunun anlami kullanici adlari esit degilse
			System.out.println("Kullanici adinizi yanlis girdiniz !");
		}

		else {
			System.out.println("Giris basarili");
		}
	}
}
