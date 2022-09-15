
public class ProductManager {
	public void add(Product product) {
		if (ProductValidator.isValid(product)) {
			System.out.println("Urun eklendi.");
		}

		else {
			System.out.println("Urun bilgileri gecersiz.");
		}
	}
}
