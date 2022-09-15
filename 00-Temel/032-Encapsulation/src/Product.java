
public class Product {
	private int id; // urunun kimligi
	private String name; // urunun adi
	private String description; // urunun aciklamasi
	private double price; // urunun fiyati
	private int stockAmount; // urunun stok adedi

	// getter ve setter'in kisa yoldan yazimi alt + shift + s + r ile yapilabilir

	// istersek getter ve setter uzerinde degisiklikler yapabiliriz ornek amacli bir
	// ozellik daha ekleyelim

	private String code;
	// bu ozelligin amaci urunun adinin ilk harfi ile urunun id'sini birlestirmek
	// olsun. bunun icinde getter ve setter yazalim asagida.

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
		// this.id bu class'ta ki id'i tutuyor. diger id ise parametre olan id'dir.
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getStockAmount() {
		return stockAmount;
	}

	public void setStockAmount(int stockAmount) {
		this.stockAmount = stockAmount;
	}

	public String getCode() { // id ile urunun ilk adini birlestirmek icin getter'i kullanacagiz
		this.code = this.name.substring(0, 1) + this.id;
		return code;
		// burada code'un setter'ina gerek yok cunku ona bir deger atama yapmiyacagiz
		// name ile id birlestiriyoruz zaten ama setter'i yazsakta bir sey olmaz
	}
}
