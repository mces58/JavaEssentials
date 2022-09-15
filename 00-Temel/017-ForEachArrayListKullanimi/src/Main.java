import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		// For each , arrayler veya arrayListler de kullanilabilir

		int[] sayilar = { 10, 20, 30, 40, 50 };

		for (int sayi : sayilar) {
			System.out.println("Eleman: " + sayi);
		}
		System.out.println();

		ArrayList<String> names = new ArrayList<String>();

		names.add("Can");
		names.add("Ali");
		names.add("Ahmet");
		names.add("Semih");
		names.add("Veli");

		for (String name : names) {
			System.out.println("Eleman: " + name);
		}
		System.out.println();

		// Bir de cok boyutlu diziler de nasil oluyormus ona bakalim

		int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		for (int[] satir : matrix) {
			// tipini bir koseli parantez sonra kafana gore isim sonra dizinin adi sonucta
			// cok boyutlu dizileri bastirmak icin ic ice donguler kullaniyorduk ayni mantik

			for (int sutun : satir) { // burada sutunu bastiriyoruz
				System.out.print(sutun + " ");
			}
			System.out.println();
		}
	}
}
