
public class ProductManager {
	public void add(Product product) {
		System.out.println("Urun eklendi: " + product.name);
	}

	public void delete(Product product) {
		System.out.println("Urun silindi: " + product.id);
	}
}
