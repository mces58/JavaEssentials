
public class Manager extends Employee {
	/*
	 * simdi bu bizim alt classimiz ve bu alt classimizin ana(super) classa ulasmasi
	 * icin extends kelimesini kulanmaliyiz bunun yeri classimizin adinin yaninda
	 * olmali ve extends'in yanina da ulasacagimiz super classin adini yazariz
	 * extends ettigimiz class'in constructor'i varsa sub class'a yazilmak
	 * zorundadir
	 * 
	 * tabi biz bu classimiza ozgu degiskenler tanimlayabilir veya metotlar
	 * yazabiliriz yani illada super classimizla ayni olmak zorunda degil simdi bu
	 * classimiza ozgu bir degisken tanimlayalim ve birde fonksiyon yazalim
	 */

	private int calisanSayisi; // bunu constroctura eklemeyi unutma

	public Manager(String name, String department, int salary, int calisanSayisi) {
		// ana (super) classimiz da ki constructori burada kullanmak icin super
		// kelimesini kullaniriz
		super(name, department, salary); // ana classimizda ki bilgilere boyle ulasiriz

		this.calisanSayisi = calisanSayisi;
	}

	// bir tane de fonk yazalim
	// burada field tutan class'ta metot yazmak dogru degil . cunku single
	// responsibility prensibini ihmal etmekteyiz lakin olayi anlamak icin yaziyoruz

	public void zam(int tutar) {
		System.out.println(this.calisanSayisi + " kisiye " + tutar + " TL zam yapildi...");
	}
}
