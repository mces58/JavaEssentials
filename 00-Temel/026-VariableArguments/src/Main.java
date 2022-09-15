
public class Main {
	public static int add(int number1, int number2) {
		return number1 + number2;
	}
	/*
	 * Bir hesap makinesini dusundugumuz de hesap makinesine istedigimiz kadar
	 * sayiyi girerek o sayilarla islem yapabiliriz. Lakin yukaridaki metotta sadece
	 * iki sayinin toplamasini gerceklestirebiliriz. Peki bizde ayni hesap
	 * makinesinin yaptigi gibi istedigimiz kadar sayiyi toplamak icin ne
	 * yapabiliriz?
	 * 
	 * Bunun icin metota int sayi dizisi gonderebiliriz .Bu bir cozum yada variable
	 * arguments kullanabiliriz
	 * 
	 * Aslinda variable arg. arka planda gonderdigimiz sayilari diziye
	 * cevirir.Dolayisiyla dizideki elemanlari toplamak icinde for a ihtiyac duyariz
	 */

	// Kullanimi ise: Birden fazla sayiyi bir parametre olarak gonderiyoruz bunun
	// icin uc nokta kullaniyoruz.

	public static int add2(int... numbers) {
		int sum = 0;
		for (int number : numbers) {
			sum += number;
		}
		return sum;
	}

	public static double findAverage(double... numbers) {
		double sum = 0;
		for (double number : numbers) {
			sum += number;
		}
		return sum / numbers.length;
	}

	public static void main(String[] args) {

		int total = add(10, 20);

		int total2 = add2(10, 20, 30, 40, 50, 60, 70, 80, 90, 100);

		double total3 = findAverage(1.5, 8.7, 9.4, 5, 6, 7.3, 3.55, 6.789);

		System.out.println(total);
		System.out.println(total2);
		System.out.println(total3);
	}

	/*
	 * Lakin bu yapi pek kullanilmaz cunku int degerler degilde metotda nesne
	 * gonderseydik bu metodun test edilebilirligi azalirdi aciklar cikmasina sebep
	 * olabilir . Yani sadece int degerler icin kullanilmiyor bu yapi
	 */
}
