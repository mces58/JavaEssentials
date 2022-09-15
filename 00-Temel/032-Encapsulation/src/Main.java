
public class Main {
	// get okumaya set ise deger vermeye yarar

	// getter ve setter fonk fieldlerimizi korumaya almaya yarar onlari public'ten
	// private cevirir ve herkesin erismesini engeller

	public static void main(String[] args) {

		Product product = new Product();
		product.setId(10);
		product.setName("Laptop");
		product.setDescription("Monster Laptop");
		product.setPrice(7500);
		product.setStockAmount(5);
		// setter ile atamalar yaptik

		System.out.println(product.getId());
		System.out.println(product.getName());
		System.out.println(product.getDescription());
		System.out.println(product.getPrice() + " TL");
		System.out.println(product.getStockAmount() + " adet");
		// getter ile de atadigimiz degerleri okuduk

		System.out.println(product.getCode());
		// burada ise getCode ekrana bastirdik
	}
}
