
public abstract class GameCalculator {
	public abstract void hesapla();
	/*
	 * bu metodumuz bir abstract ve bunun anlami GameCalculator class'ina kim bagli
	 * ise (yani alt class'lar ) bu metodu hepsi icermek zorunda . Fakat bu metodu
	 * override etmek zorunda yani kendi metodunu kendi yazmak zorunda yani hesapla
	 * fonk. GameCalculator'a bagli tum class'larda olacak ve her class bunu kendi
	 * ozelliklerine gore override edecek simdi her class'a hesapla fonk yazalim
	 */

	// abstract bir class'ta illa abstract bir operasyon olmak zorunda degil
	public final void gameOver() {
		System.out.println("Oyun bitti...");
		// gameOver methodu final kelimesi daha override edilemez yani tum class'larda
		// bu hali gecerli olacak demektir.Uzerine ekleme veya cikarilma yapilmayacak
		// anlamina gelir.

		// bu class super classimiz
		// abstract class veya operasyon da herkes kendi isini kendi yapar
	}
}
