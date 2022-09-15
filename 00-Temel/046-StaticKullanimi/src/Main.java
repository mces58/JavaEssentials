
public class Main {
	public static void main(String[] args) {

		Product product = new Product();

		product.id = 1;
		product.name = "kulaklik";
		product.price = 100;

		ProductManager manager = new ProductManager();

		manager.add(product);

		Product product2 = new Product();

		product2.id = 2;
		product2.name = "";// isimi bos gonderdigimiz icin gecersizdir dedi.
		product2.price = 50;

		manager.add(product2);

		System.out.println();

		/*
		 * Goruldugu gibi ProductValidator da ki metoda ulasmak icin onu new'lemeye
		 * gerek duymadik static yaparak class adiyla ulasabiliyoruz.
		 * 
		 * class'lar static olamaz lakin inner class'lar static olarak kullanilirlar
		 * 
		 * inner classa ornek olarakta bir tane DataBaseHelper class'i olusturalim.
		 * inner class'lari cagirma class adlariyla olur new'leme olmaz.
		 * 
		 */

		DataBaseHelper.Crud.update();
		DataBaseHelper.Crud.delete();

		DataBaseHelper.Connection.updateConnetion();
	}
}
