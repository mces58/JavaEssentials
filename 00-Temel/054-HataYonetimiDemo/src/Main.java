import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) {
		createFile();
		readFile();
	}

	// dosya olusturmak icin
	public static void createFile() {
		String path = "C:\\Users\\mc_es\\Documents\\Projects\\.javaDemos\\00-Temel\\054-HataYonetimiDemo\\src\\sayilar.txt";
		File file = new File(path);

		try {
			// file.mkdir(); klasor olusturur
			if (file.createNewFile()) {
				System.out.println("Dosya olusturuldu");
			} else {
				System.out.println("Dosya zaten mevcut");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// dosya okumak icin
	public static void readFile() {
		BufferedReader reader = null;
		String line = null;
		int total = 0;

		try {
			reader = new BufferedReader(new FileReader(
					"C:\\Users\\mc_es\\Documents\\Projects\\.javaDemos\\00-Temel\\054-HataYonetimiDemo\\src\\sayilar.txt"));
			try {
				while ((line = reader.readLine()) != null) {

					total += Integer.valueOf(line); // line turu String'di onu int'e cevirdik
					System.out.println(line);
				}

				System.out.println("Toplami: " + total);
			} catch (Exception e) {
				e.printStackTrace();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		finally {
			try {
				reader.close();
				// dosyayi kapatiyoruz reader'in olmama ihtimaline karsi onlem icin try-catch yaptik
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
