
public class ProductValidator {
	public ProductValidator() {
		System.out.println("Yapici blok calisti");
	}

	/*
	 * constructor new'lenirken calisir biz burada staticler uzerinden gittigimiz
	 * icin (yani class ismiyle) new'lenme olmaz. Dolayisiyla constructor da
	 * calismaz. peki soru su? static ifadelerinde constructor ifadelere benzer
	 * yapici bloklari var midir? cevap vardir. kullanimi asagidaki gibidir.
	 */
	static {
		System.out.println("Static yapici blok calisti.");
	}
	/*
	 * bu kullanim bir nevi constructor gorevi gormektedir. Bu class'in kullanildigi
	 * yerlerde calisir. Bu class'i new'leyerekte bir yerde cagirsak bu static ifade
	 * yinede calisir. Ana class'imiz burada ProductValidator'dir ve ana class'lar
	 * static olamaz lakin class icinde classlar da vardir bunlara inner class denir
	 */
	// public class birsey{
	// public static void bisey() {
	// System.out.println("Bir sey");
	// }
	// }

	// bu class'in icindeki static bisey fonksiyonunu kullanabilmek icin inner
	// class'inda static olmasi gerekir

	public static boolean isValid(Product product) {
		if (product.price > 0 && !product.name.isEmpty()) {
			// isEmpty() bossa demek. Basina ! gelirse bos degilse anlamina gelir
			return true;
		}

		else {
			return false;
		}
	}
}
