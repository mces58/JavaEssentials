
public class Main {
	public static void main(String[] args) {
		Product product = new Product();
		product.id = 1;
		product.name = "laptop";
		product.description = "monster laptop";
		product.price = 7500;
		product.stockAmount = 14;

		ProductManager productManager = new ProductManager();
		productManager.add(product);
		productManager.delete(product);
	}
}
