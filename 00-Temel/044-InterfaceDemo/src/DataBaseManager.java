
public class DataBaseManager {
	// bu bizim isci class'imiz yani tum cagirmalari buradan yapiyorum
	/*
	public void ekle(IDataBase dataBase) {
		// fonksiyona interface'yi gonderiyoruz database burada parametre
		dataBase.add();
	}

	public void sil(IDataBase dataBase) {
		dataBase.delete();
	}

	public void guncelle(IDataBase dataBase) {
		dataBase.update();
	}

	public void getir(IDataBase dataBase) {
		dataBase.get();
	}
	*/
	// bu yaptigimiz birinci yol
	// altta ki de ikinci yol
	// burada ise constructor yazip ona interface gonderiyoruz

	private IDataBase base;

	public DataBaseManager(IDataBase base) {
		this.base = base;
	}

	public void ekle() {
		base.add();
	}

	public void sil() {
		base.delete();
	}

	public void guncelle() {
		base.update();
	}

	public void getir() {
		base.get();
	}
}
