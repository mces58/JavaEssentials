
public class Main {
	public static void main(String[] args) {
		// Java da degisken tipleri
		/*
		 * byte ---> sayi , 1 byte 
		 * short ---> sayi , 2 byte 
		 * int ---> sayi , 4 byte 
		 * long ---> sayi , 8 byte 
		 * float ---> ondalikli sayi , 4 byte 
		 * double ---> ondalikli sayi , 8 byte 
		 * char ---> karakter , 2 byte 
		 * boolean ---> true ya da false , 1 byte
		 */

		byte a = 1;
		System.out.println(a);
		
		short b = 25;
		System.out.println(b);
		int c = 457;
		System.out.println(c);

		long d = 46764;
		System.out.println(d);

		double e = 0.254;
		System.out.println(e);

		char f = 65;
		// 'A' --> ascii tablosunda karsigili .Aslinda her karakter birer sayidir
		System.out.println(f);

		char karakter = 'a';
		// 'a'---> Ascii tablosunda 97 degerine sahipmis
		System.out.println((int) karakter);

		boolean g = true;
		System.out.println(g);

		String z = "mehmetcan";
		// string bir ifade tanimlarken S buyuk yaziliyor
		System.out.println(z);

		// Java buyuk harfe (case sensitive) duyarli bir dildir

		System.out.println("Benim adim " + z);

		// C'de ki %d,s,f... gibi seyler yok burada cift tirnaktan sonra virgul yok
		// onun yerine arti(+) koyarak birlestiriyoruz

		String mesaj = "Bugun java ogrenmeye basladim. ";

		String mesaj2 = "Umarim beni zorlamaz. ";

		String mesaj3 = "Seni seviyorum JAVA.";

		System.out.println(mesaj + mesaj2 + mesaj3);
	}
}
