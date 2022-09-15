
public class Manager extends Employee {
	private int calisanSayisi;

	public Manager(String name, String department, int salary, int calisanSayisi) {

		super(name, department, salary);
		this.calisanSayisi = calisanSayisi;
	}

	public void zam(int tutar) {

		System.out.println(this.calisanSayisi + " kisiye " + tutar + " TL zam yapildi...");
	}
	// override ana classimizda ki fonksiyonlari alt classlarda istege gore
	// duzenlemektir yani fonksiyona bir seyler ekleme veya cikarma yapma

	@Override
	public void show() { // kisa yol alt + shift + s ile override yapabiliriz
		super.show();
		// bu ifade super class'daki fonksiyonun aynisi burada gecerli olsun demek biz
		// simdi bunun ustune bir seyler ekleyelim

		System.out.println(calisanSayisi + " tane calisan bugun fazla mesai yapacaklardir...");

		// artik main'de override etmis oldugumuz fonksiyon kullanicak yani ana
		// classimizdaki fonksiyon daha gecerli degil
	}
}
