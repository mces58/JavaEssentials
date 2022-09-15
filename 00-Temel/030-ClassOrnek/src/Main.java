
public class Main {
	public static void main(String[] args) {
		// nesneyi(referansi) olustur
		// classAdi nesneAdi = new classAdi();

		DortIslem dortIslem = new DortIslem();
		double sonuc = dortIslem.plus(10, 5, 4, 6, 85, 94, -75);
		System.out.println("Toplam : " + sonuc);

		sonuc = dortIslem.minus(10, 5);
		System.out.println("Fark : " + sonuc);

		sonuc = dortIslem.times(11.3, 5, 7, 3.5, -8.7);
		System.out.println("Carpim : " + sonuc);

		sonuc = dortIslem.divideBy(10, 7);
		System.out.println("Bolum : " + sonuc);
	}
}
