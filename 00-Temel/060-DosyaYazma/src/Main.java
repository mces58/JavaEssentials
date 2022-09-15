import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		createFile();
		writeFile();
		readFile();
	}

	public static void createFile() {
		String path = "C:\\Users\\mc_es\\Documents\\Projects\\.javaDemos\\00-Temel\\060-DosyaYazma\\src";
		String fileName = "students.txt";
		File file = new File(path + fileName);

		try {
			if (file.createNewFile()) {
				System.out.println("Dosya olusturuldu");
			}

			else {
				System.out.println("Dosya zaten mevcut");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void writeFile() {
		String path = "C:\\Users\\mc_es\\Documents\\Projects\\.javaDemos\\00-Temel\\060-DosyaYazma\\src";
		String fileName = "students.txt";

		try {// yazma islemini FileWriter ile yapiyoruz
			BufferedWriter writer = new BufferedWriter(new FileWriter(path + fileName, true));
			/*
			 * sonda ki true'yu koymamizin nedeni dosyanin ustune surekli yazmasi icin her
			 * yeni bir sey yazdigimizda eskileri silinmesin diye
			 * 
			 * Buffered kullanmamiz daha efektif olmasini sagliyor yoksa soylede
			 * kullanilabilir FileWriter fileWriter = new FileWriter(path + fileName, true);
			 * ikiside ayni
			 */

			writer.newLine(); // dosya da yazarken bir asagi satira inmesi icin
			writer.write("can"); // dosyaya ekledik
			writer.newLine();
			writer.write("ali");
			writer.newLine();
			writer.write("1");

			System.out.println("Dosyaya yazildi");

			writer.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void readFile() {
		String path = "C:\\Users\\mc_es\\Documents\\Projects\\.javaDemos\\00-Temel\\060-DosyaYazma\\src";
		String fileName = "students.txt";
		File file = new File(path + fileName);
		String line;

		try {
			Scanner reader = new Scanner(file);

			while (reader.hasNextLine()) {
				line = reader.nextLine();
				System.out.println(line);
			}
			reader.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
