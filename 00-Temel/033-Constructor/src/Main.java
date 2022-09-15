
public class Main {
	public static void main(String[] args) {
		/*
		 * constructor yapici blok demektir eger bizim birden fazla degiskenimiz var ise
		 * ve bunlari getter setter fonksiyonlarini kullanmak yerine constructor'lari
		 * kullanabiliriz . getter ve setter yazmasi uzun surdugu icin sikinti
		 * olabiliyor.Constructor'lar daha kisa ve kullanilisli.
		 * 
		 * Constructor yazildigi class ile ayni ada sahip olmali
		 * 
		 * fonksiyon yazmayla ayni mantik lakin constructor yazarken int double string
		 * gibi tip belirtmiyoruz sadece classin adiyla ayni olsun yeter
		 */

		// nesne olusturalim
		Car car1 = new Car("Siyah", "Fiat Doblo", 1.9, 4, 50000);
		// bu yukarida yazdigimiz degerler parametreleri constructor'a gitmektedir

		CarManager carManager = new CarManager();
		carManager.showInfos(car1); // showInfos fonk cagirdik

		System.out.println("\n");

		// eger ben degerleri gondermek istemiyorsam degerlerin default olmasini
		// istiyorsam bunu icin default constructor yazmaliyiz . asagida onu yapalim

		Car car2 = new Car();
		carManager.showInfos(car2);
	}
}
